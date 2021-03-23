package com.academia.ginastica;

import com.academia.ginastica.entidades.Aluno;
import com.academia.ginastica.entidades.Pacotes;
import com.academia.ginastica.gerenciador.Gerenciador;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void apresentar(){
        System.out.println("Seja bem vindo ao sistema de gerenciamento da academia.");
        System.out.println("Selecione uma das opções abaixo: ");
        System.out.println("C ) Cadastrar aluno.");
        System.out.println("L ) Listar alunos da academia.");
        System.out.println("S ) Sair do sistema.");
    }
    public static void main(String[] args) {

        List<Aluno> alunos = new ArrayList<>();
        List<Pacotes> planos = new ArrayList<>();

        //Criação de pacotes
        planos.add(new Pacotes(30.00,"trimestral",3));
        planos.add(new Pacotes(50.00,"semestral",6));
        planos.add(new Pacotes(110.00,"anual",12));

        while (true){
            apresentar();
            Gerenciador gerenciador =  new Gerenciador();
            Scanner leitor = new Scanner(System.in);
            String option = leitor.next();
            

            if(option.equalsIgnoreCase("C")){
                alunos = gerenciador.cadastrarAluno(alunos, planos);
            } else if(option.equalsIgnoreCase("L")){
                gerenciador.listarAlunos(alunos);
            } else if(option.equalsIgnoreCase("S")){
                System.out.println("Volte sempre.");
                break;
            } else {
                System.out.println("Opção inválida.");
            }
        }
    }
}

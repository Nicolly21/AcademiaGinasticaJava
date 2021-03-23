package com.academia.ginastica.gerenciador;

import com.academia.ginastica.entidades.Aluno;
import com.academia.ginastica.entidades.Pacotes;

import java.util.List;
import java.util.Scanner;

public class Gerenciador {

    public List<Aluno> cadastrarAluno(List<Aluno> alunos, List<Pacotes> planos){
        Aluno aluno = new Aluno();
        Scanner entrada = new Scanner(System.in);
        System.out.println("Informe os dados do aluno");
        System.out.println("Nome");
        aluno.setNome(entrada.next());
        System.out.println("CPF");
        aluno.setCpf(entrada.next());
        System.out.println("Idade");
        aluno.setIdade(entrada.nextInt());
        System.out.println("Altura");
        aluno.setAltura(Double.parseDouble(entrada.next()));
        System.out.println("Peso");
        aluno.setPeso(Double.parseDouble(entrada.next()));
        System.out.println("Status");
        System.out.println("A) ativo");
        System.out.println("I) inativo");
        String status = entrada.next();
        if(status.equalsIgnoreCase("A")){
            aluno.setStatus(Boolean.TRUE);
        } else {
            aluno.setStatus(Boolean.FALSE);
        }
        System.out.println("Plano");
        planos(planos);
        aluno.setPlano(retornaPlano(planos, entrada.nextInt()));
        alunos.add(aluno);
       
        return alunos;
    }

    public void listarAlunos(List<Aluno> alunos){
        for (Aluno aluno:alunos) {
            System.out.println("Nome: "+aluno.getNome());
            System.out.println("Cpf: "+aluno.getCpf());
            System.out.println("Idade: "+aluno.getIdade());
            System.out.println("Altura: "+aluno.getAltura());
            System.out.println("Peso: "+aluno.getPeso());
            System.out.println("Status: "+aluno.getStatusAluno());
            System.out.println("Plano: "+aluno.getPlano().getDescricao());
        }
        statusAlunos(alunos);
    }
    public void statusAlunos(List<Aluno> alunos){
        int ativos = 0;
        int inativos = 0;
        for (Aluno aluno:alunos) {
            if(aluno.getStatus()){
                ativos += 1;
            } else {
                inativos += 1;
            }
        }

        System.out.println("Alunos ativos: "+ativos+" Alunos inativos: "+inativos);
    }

    public void planos(List<Pacotes> pacotes){
        System.out.println("Selecione um dos planos abaixo: ");
        for (Pacotes pacote:pacotes) {
            System.out.println("Plano: "+((Integer)(pacotes.indexOf(pacote))+1));
            System.out.println("Tipo: "+pacote.getDescricao());
            System.out.println(pacote.getMeses()+" Meses");
            System.out.println("Valor: "+pacote.getValor());
        }
    }

    public Pacotes retornaPlano(List<Pacotes> planos, int option){
        return planos.get(option-1);
    }
}

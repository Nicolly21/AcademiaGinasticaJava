package com.academia.ginastica.entidades;

public class Aluno {

    String nome;
    String cpf;
    Integer idade;
    Double altura;
    Double peso;
    Boolean status;
    Pacotes pacotes;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    public Double getAltura() {
        return altura;
    }

    public void setAltura(Double altura) {
        this.altura = altura;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public Pacotes getPlano() {
        return pacotes;
    }

    public void setPlano(Pacotes pacotes) {
        this.pacotes = pacotes;
    }

    public String getStatusAluno(){
        if(this.status){
            return "Ativo";
        } else {
            return "Inativo";
        }
    }
}

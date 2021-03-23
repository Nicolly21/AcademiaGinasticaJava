package com.academia.ginastica.entidades;

public class Pacotes {

    Double valor;
    String descricao;
    Integer meses;

    public Pacotes(Double valor, String descricao, Integer meses){
        this.valor = valor;
        this.descricao = descricao;
        this.meses = meses;
    }

    public Double getValor() {
        return valor;
    }

    public void setValor(Double valor) {
        this.valor = valor;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public Integer getMeses() {
        return meses;
    }

    public void setMeses(Integer meses) {
        this.meses = meses;
    }
}

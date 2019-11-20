package com.ProvaOficialAndroid.marcacaodeconsulta.Modelos;

public class Pessoa {
    private String cpf;
    private String especidade;

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getEspecidade() {
        return especidade;
    }

    public void setEspecidade(String especidade) {
        this.especidade = especidade;
    }

    public String getProfissao() {
        return profissao;
    }

    public void setProfissao(String profissao) {
        this.profissao = profissao;
    }

    public String getRg() {
        return rg;
    }

    public void setRg(String rg) {
        this.rg = rg;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    private String profissao;
    private String rg;
    private char sexo;
}

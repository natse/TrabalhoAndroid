package com.ProvaOficialAndroid.marcacaodeconsulta.Modelos;

import java.util.List;

public class Consulta {
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getValor() {
        return valor;
    }

    public void setValor(String valor) {
        this.valor = valor;
    }

    private String descricao;
    private String valor;
    private Ubs ubs;

    public List<Paciente> getPaciente() {
        return paciente;
    }

    public void setPaciente(List<Paciente> paciente) {
        this.paciente = paciente;
    }

    private List<Paciente> paciente;


    public Ubs getUbs() {
        return ubs;
    }

    public void setUbs(Ubs ubs) {
        this.ubs = ubs;
    }
}

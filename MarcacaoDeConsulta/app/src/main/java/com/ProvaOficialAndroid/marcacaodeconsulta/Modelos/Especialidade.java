package com.ProvaOficialAndroid.marcacaodeconsulta.Modelos;

import java.util.List;

public class Especialidade {
    private int codigo;
    private String nome;

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    private List<Medico>medicos;

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }
}

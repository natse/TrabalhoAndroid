package com.ProvaOficialAndroid.marcacaodeconsulta.Modelos;

import java.util.List;

public class Medico extends Pessoa{
    private int codigo;
    private String crm;
    private Especialidade especialidades;

    public List<Ubs> getUbs() {
        return ubs;
    }

    public void setUbs(List<Ubs> ubs) {
        this.ubs = ubs;
    }

    private List<Ubs> ubs;
    public Especialidade getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(Especialidade especialidades) {
        this.especialidades = especialidades;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getCrm() {
        return crm;
    }

    public void setCrm(String crm) {
        this.crm = crm;
    }
}

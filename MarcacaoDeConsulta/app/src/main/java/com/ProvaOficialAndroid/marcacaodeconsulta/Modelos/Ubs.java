package com.ProvaOficialAndroid.marcacaodeconsulta.Modelos;

import java.util.Date;
import java.util.List;

public class Ubs {

    public Date getDtAbetura() {
        return dtAbetura;
    }

    public void setDtAbetura(Date dtAbetura) {
        this.dtAbetura = dtAbetura;
    }

    public String getEndereco() {
        return endereco;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    private Date dtAbetura;
    private String endereco;

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    public List<Medico> getMedicos() {
        return medicos;
    }

    public void setMedicos(List<Medico> medicos) {
        this.medicos = medicos;
    }

    public List<Especialidade> getEspecialidades() {
        return especialidades;
    }

    public void setEspecialidades(List<Especialidade> especialidades) {
        this.especialidades = especialidades;
    }

    private List<Medico> medicos;
    private List<Especialidade>especialidades;

    private List<Consulta>consultas;
}

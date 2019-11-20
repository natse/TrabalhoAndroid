package com.ProvaOficialAndroid.marcacaodeconsulta.Modelos;

import java.util.List;

public class Secretaria extends Pessoa{
    private String matricula;

    public List<Consulta> getConsultas() {
        return consultas;
    }

    public void setConsultas(List<Consulta> consultas) {
        this.consultas = consultas;
    }

    private List<Consulta> consultas;


    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }
}

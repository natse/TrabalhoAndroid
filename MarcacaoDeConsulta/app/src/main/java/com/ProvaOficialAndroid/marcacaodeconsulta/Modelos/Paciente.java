package com.ProvaOficialAndroid.marcacaodeconsulta.Modelos;

public class Paciente extends Pessoa {
    private int nomeMae;

    public Consulta getConsulta() {
        return consulta;
    }

    public void setConsulta(Consulta consulta) {
        this.consulta = consulta;
    }

    private Consulta consulta;

    public int getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(int nomeMae) {
        this.nomeMae = nomeMae;
    }
}

package com.ProvaOficialAndroid.marcacaodeconsulta.Modelos;

import java.util.Date;

public class Retorno {
    private Date dataRetorno;
    private int nomeOaciente;
    private  int codMedico;

    public Date getDataRetorno() {
        return dataRetorno;
    }

    public void setDataRetorno(Date dataRetorno) {
        this.dataRetorno = dataRetorno;
    }

    public int getNomeOaciente() {
        return nomeOaciente;
    }

    public void setNomeOaciente(int nomeOaciente) {
        this.nomeOaciente = nomeOaciente;
    }

    public int getCodMedico() {
        return codMedico;
    }

    public void setCodMedico(int codMedico) {
        this.codMedico = codMedico;
    }
}

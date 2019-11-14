package com.ProvaOficialAndroid.marcacaodeconsulta.Modelos;

public class Paciente {
    private int nomeMae;
    private Login login;

    public Login getLogin() {
        return login;
    }

    public void setLogin(Login login) {
        this.login = login;
    }

    public int getNomeMae() {
        return nomeMae;
    }

    public void setNomeMae(int nomeMae) {
        this.nomeMae = nomeMae;
    }
}

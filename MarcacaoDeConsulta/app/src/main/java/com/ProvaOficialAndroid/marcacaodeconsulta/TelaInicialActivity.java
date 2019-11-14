package com.ProvaOficialAndroid.marcacaodeconsulta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class TelaInicialActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_telainicia);
    }

    public void onClinkCadastror(View view) {
        Intent cadastrar = new Intent(TelaInicialActivity.this, TelaCadastrorActivity.class);
        startActivity(cadastrar);
    }
    public void onClinkMarcarConsulta(View view) {
        Intent marcaConsulta = new Intent(this, MarcarConsultaActivity.class);
        startActivity(marcaConsulta);
    }


    public void onClinkEsqueceu(View view) {
        Intent esqueceu = new Intent(this, RecuperarSenhaActivity.class);
        startActivity(esqueceu);
    }
}

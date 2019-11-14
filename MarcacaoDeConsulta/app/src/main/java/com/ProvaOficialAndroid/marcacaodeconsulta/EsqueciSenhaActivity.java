package com.ProvaOficialAndroid.marcacaodeconsulta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ProvaOficialAndroid.marcacaodeconsulta.R;

public class EsqueciSenhaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_esqueci_senha);
    }

    public void onClinkTelaInicial(View view) {
        Intent telaInicial = new Intent( this, TelaInicialActivity.class);
        startActivity(telaInicial);
    }
}

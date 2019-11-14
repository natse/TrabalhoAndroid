package com.ProvaOficialAndroid.marcacaodeconsulta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.ProvaOficialAndroid.marcacaodeconsulta.R;

public class TelaCadastrorActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_tela_cadastror);
    }

    public void onClinkTelaInicialCadastror(View view) {
        Intent TelaInicialCadastror = new Intent( this, TelaInicialActivity.class);
        startActivity(TelaInicialCadastror);
    }
}

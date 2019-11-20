package com.ProvaOficialAndroid.marcacaodeconsulta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void onClinkMenuMarcarConsulta(View view) {
        Intent menuMarcarConsulta = new Intent(this, MarcarConsultaActivity.class);
        startActivity(menuMarcarConsulta);
    }

    public void onClinkMenuHistorico(View view) {
        Intent menuHistorico = new Intent(this, HistoricoActivity.class);
        startActivity(menuHistorico);
    }

    public void onClinkMenuSair(View view) {
        Intent menuSair = new Intent(this, LoginActivity.class);
        startActivity(menuSair);
    }
}

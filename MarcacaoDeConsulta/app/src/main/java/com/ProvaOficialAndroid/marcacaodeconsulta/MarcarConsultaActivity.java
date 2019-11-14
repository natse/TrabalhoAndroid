package com.ProvaOficialAndroid.marcacaodeconsulta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MarcarConsultaActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_marcar_consulta);
    }

    public void onClinkAgendaConsulta(View view){
            Intent agendaConsulta = new Intent(this, AgendaConsultaActivity.class);
            startActivity(agendaConsulta);

    }
}

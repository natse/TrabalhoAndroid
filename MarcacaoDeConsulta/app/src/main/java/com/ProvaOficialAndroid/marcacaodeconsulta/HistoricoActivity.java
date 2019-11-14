package com.ProvaOficialAndroid.marcacaodeconsulta;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HistoricoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_historico);
    }

    public void onClinkMenu(View view) {
        Intent menu = new Intent( this, MenuActivity.class);
        startActivity(menu);
    }
}

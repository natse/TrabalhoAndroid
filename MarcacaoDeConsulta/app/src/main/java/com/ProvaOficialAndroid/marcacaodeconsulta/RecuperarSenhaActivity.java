package com.ProvaOficialAndroid.marcacaodeconsulta;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class RecuperarSenhaActivity extends AppCompatActivity {

    private EditText editEmail,editNumer;
    private Button btnRecuperarSenha;
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recuperar_senha);
        inicializarComponentes();
        eventoClink();
    }

    private void eventoClink() {
        btnRecuperarSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String email = editEmail.getText().toString();
                String numero = editNumer.getText().toString();
                resetSenha(email,numero);

            }
        });
    }

    private void resetSenha(String email, String numero) {
        auth.sendPasswordResetEmail(email)
                .addOnCompleteListener(RecuperarSenhaActivity.this, new OnCompleteListener<Void>() {
                    @Override
                    public void onComplete(@NonNull Task<Void> task) {
                        if (task.isSuccessful()){
                            Toast.makeText(RecuperarSenhaActivity.this, "Enviado no seu E=mail para altera sua senha", Toast.LENGTH_SHORT).show();
                            finish();
                        }else {
                            Toast.makeText(RecuperarSenhaActivity.this, "E-mail não registrado", Toast.LENGTH_SHORT).show();
                        }
                    }
                });
    }


    private void inicializarComponentes() {
        editEmail = (EditText) findViewById(R.id.EdtInformeGmail);
        editNumer = (EditText) findViewById(R.id.EdtInformeGmail);
        btnRecuperarSenha = (Button) findViewById(R.id.BtnInformeGmail);
    }

    @Override
    protected void onStart() {
        super.onStart();
        auth = conexao.getFirebaseAuth();
    }
}

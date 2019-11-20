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
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class CadastrorActivity extends AppCompatActivity {
    private EditText editCodSus,editSenhas;
    private Button btnCadastrar;
    private FirebaseAuth auth;
    private FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cadastror);
        inicializaComponentes();
        eventoClicks();
    }

    private void eventoClicks() {
        btnCadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                criarUser(editCodSus.getText().toString(), editSenhas.getText().toString());
            }
        });

    }


    private void criarUser(String codSus, String senha) {
        auth.createUserWithEmailAndPassword(codSus, senha)
                .addOnCompleteListener(CadastrorActivity.this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()){
                            Intent i = new Intent(CadastrorActivity.this, LoginActivity.class);
                            startActivity(i);
                            Toast.makeText(CadastrorActivity.this, "Cadastro com sucesso", Toast.LENGTH_SHORT).show();
                            finish();

                        }else {
                            Toast.makeText(CadastrorActivity.this, "Cadastro em enválido ", Toast.LENGTH_SHORT).show();
                        }
                    }
                });

    }

    private void inicializaComponentes() {
        editCodSus = (EditText) findViewById(R.id.EditCadastror);
        editSenhas = (EditText) findViewById(R.id.EditCriarSenha);
        btnCadastrar = (Button) findViewById(R.id.BtnCadastrarLogin);
    }

    @Override
    protected void onStart() {
        super.onStart();
        auth = conexao.getFirebaseAuth();
    }
}

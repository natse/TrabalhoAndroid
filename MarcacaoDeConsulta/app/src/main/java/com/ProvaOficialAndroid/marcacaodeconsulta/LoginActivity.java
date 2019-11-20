package com.ProvaOficialAndroid.marcacaodeconsulta;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;


public class LoginActivity extends AppCompatActivity {


    private EditText editLogin, editSenha;
    private Button btnLogan;
    private TextView txtcadastrar, txtEsqSenha;
    private FirebaseAuth auth;
    private FirebaseUser user;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        inicializaCompenentes();
        eventoClicks();

    }
    private void LoganLogin(String email,String password){
        auth.signInWithEmailAndPassword(email, password)
                .addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                    @Override
                    public void onComplete(@NonNull Task<AuthResult> task) {
                        if (task.isSuccessful()) {
                            // Sign in success, update UI with the signed-in user's information
                            Log.d("TAG", "signInWithEmail:success");
                            FirebaseUser user = auth.getCurrentUser();
                            Intent i = new Intent(LoginActivity.this, MarcarConsultaActivity.class);
                            startActivity(i);
                            Toast.makeText(LoginActivity.this, "Login com sucesso", Toast.LENGTH_SHORT).show();

                        } else {
                            // If sign in fails, display a message to the user.
                            Log.w("Tag", "signInWithEmail:failure", task.getException());
                            Toast.makeText(LoginActivity.this, "Senha ou login errando", Toast.LENGTH_SHORT).show();
                        }

                    }
                });
    }

    private void eventoClicks() {
        txtcadastrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cadastrar = new Intent(getApplicationContext(),CadastrorActivity.class);
                startActivity(cadastrar);
            }
        });
        btnLogan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoganLogin(editLogin.getText().toString(), editSenha.getText().toString());
            }
        });
        txtEsqSenha.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(LoginActivity.this, RecuperarSenhaActivity.class);
                startActivity(i);
            }
        });
    }

    private void inicializaCompenentes() {
        editLogin = (EditText) findViewById(R.id.EditLogin);
        editSenha = (EditText) findViewById(R.id.EditSenha);
        btnLogan = (Button) findViewById(R.id.BtnLogin);
        txtcadastrar = (TextView) findViewById(R.id.BtnCadastrar);
        txtEsqSenha = (TextView) findViewById(R.id.BtnEsqueciSenha);
    }

    @Override
    protected void onStart() {
        super.onStart();
        auth = conexao.getFirebaseAuth();
        user = conexao.getFirebaseUser();
    }
}

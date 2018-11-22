package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.support.annotation.NonNull;
import android.util.Log;
import android.widget.TextView;
import android.widget.Toast;


import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class MainActivity extends AppCompatActivity {

    CardView btnIniciar;
    EditText txtEmail;
    EditText txtPassword;
    TextView txtRegistrarse, txtOlvido;

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        auth = FirebaseAuth.getInstance();

        txtEmail = findViewById(R.id.txtEmail);
        txtPassword = findViewById(R.id.txtPassword);
        btnIniciar = findViewById(R.id.btnIniciar);
        txtRegistrarse = findViewById(R.id.txtRegistrarse);
        txtOlvido = findViewById(R.id.txtOlvido);
        FirebaseUser user = FirebaseAuth.getInstance().getCurrentUser();

        if (user == null) {
            btnIniciar.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    final String email = txtEmail.getText().toString().trim();
                    final boolean result = !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();
                    final String password = txtPassword.getText().toString().trim();

                    try {
                        if (password.length() > 0 && email.length() > 0 && result ) {
                            auth.signInWithEmailAndPassword(email, password)
                                    .addOnCompleteListener(MainActivity.this, new OnCompleteListener<AuthResult>() {
                                        @Override
                                        public void onComplete(@NonNull Task<AuthResult> task) {
                                            if (!task.isSuccessful()) {
                                                try {
                                                    Toast.makeText(
                                                            MainActivity.this,
                                                            "Acceso fallido",
                                                            Toast.LENGTH_LONG).show();
                                                    Log.v("error", task.getResult().toString());
                                                } catch (Exception e) {
                                                    txtEmail.requestFocus();
                                                    e.printStackTrace();
                                                }
                                            } else {
                                                Intent i = new Intent(MainActivity.this, Class_Menu.class);
                                                startActivity(i);
                                                finish();
                                            }
                                        }
                                    });
                        } else {
                            Toast.makeText(
                                    MainActivity.this,
                                    "Asegurese que todos los campos sean correctos.",
                                    Toast.LENGTH_LONG).show();
                        }
                    } catch (Exception e) {
                        txtEmail.requestFocus();
                        e.printStackTrace();
                    }
                }
            });
        } else {
            Intent i = new Intent(MainActivity.this, Class_Menu.class);
            startActivity(i);
            finish();
        }

        txtRegistrarse.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, RegisterActivity.class);
                startActivity(i);
            }
        });

        txtOlvido.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent i = new Intent(MainActivity.this, ForgetAndChangePasswordActivity.class);
                startActivity(i);
            }
        });

    }

}

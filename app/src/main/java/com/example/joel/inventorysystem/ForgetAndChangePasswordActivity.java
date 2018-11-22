package com.example.joel.inventorysystem;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.CardView;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.FirebaseAuth;

public class ForgetAndChangePasswordActivity extends AppCompatActivity {

    EditText txtInput;
    CardView btnRecuperar;
    FirebaseAuth auth = FirebaseAuth.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forget_and_change_password);

        txtInput = findViewById(R.id.txtInput);
        btnRecuperar = findViewById(R.id.btnRecuperar);

        btnRecuperar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                final String email = txtInput.getText().toString();
                final boolean result = !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();

                if (result) {
                    auth.sendPasswordResetEmail(email).addOnCompleteListener(new OnCompleteListener<Void>() {
                        @Override
                        public void onComplete(@NonNull Task<Void> task) {
                            if (task.isSuccessful()) {
                                Toast.makeText(ForgetAndChangePasswordActivity.this, "Le hemos enviado instrucciones para restablecer su password", Toast.LENGTH_SHORT).show();
                            } else {
                                Toast.makeText(ForgetAndChangePasswordActivity.this, "Falla al enviar el mail", Toast.LENGTH_SHORT).show();
                            }
                        }
                    });
                } else {
                    Toast.makeText(ForgetAndChangePasswordActivity.this, "E-mail incorrecto", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}

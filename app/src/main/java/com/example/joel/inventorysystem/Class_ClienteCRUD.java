package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Toast;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Class_ClienteCRUD extends AppCompatActivity {
    Button btnGuardarC;
    EditText txtCodigoC, txtNombreC, txtDireccionC, txtTelefonoC, txtCorreoC, txtDNIC;

    // Access a Cloud Firestore instance from your Activity

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_crud);
        btnGuardarC = findViewById(R.id.btnGuardarC);
        txtCodigoC = findViewById(R.id.txtCodigoC);
        txtNombreC = findViewById(R.id.txtNombreC);
        txtDireccionC = findViewById(R.id.txtDireccionC);
        txtTelefonoC = findViewById(R.id.txtTelefonoC);
        txtCorreoC = findViewById(R.id.txtCorreoC);
        txtDNIC = findViewById(R.id.txtDNIC);

        btnGuardarC.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String email = txtCorreoC.getText().toString().trim();
                final boolean result = !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();

                try {
                    if (result) {
                        Map<String, Object> cliente = new HashMap<>();
                        cliente.put("codigo", txtCodigoC.getText().toString());
                        cliente.put("nombre", txtNombreC.getText().toString());
                        cliente.put("direccion", txtDireccionC.getText().toString());
                        cliente.put("telefono", txtTelefonoC.getText().toString());
                        cliente.put("correo", txtCorreoC.getText().toString());
                        cliente.put("dni", txtDNIC.getText().toString());

                        // Add a new document with a generated ID
                        db.collection("clientes")
                                .add(cliente)
                                .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                                    @Override
                                    public void onSuccess(DocumentReference documentReference) {
                                        Log.d("Crear Cliente", "DocumentSnapshot added with ID: " + documentReference.getId());
                                        finish();
                                    }
                                })
                                .addOnFailureListener(new OnFailureListener() {
                                    @Override
                                    public void onFailure(@NonNull Exception e) {
                                        Log.w("Crear Cliente", "Error adding document", e);
                                    }
                                });
                    } else {
                        Toast.makeText(
                                Class_ClienteCRUD.this,
                                "E-mail invalido",
                                Toast.LENGTH_LONG).show();
                    }
                } catch (Exception e) {
                    Log.v("Error", "Al querer guardar snapshot", e);
                }
            }
        });

    }
}

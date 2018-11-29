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

public class Class_ProveedorCRUD extends AppCompatActivity {

    EditText txtCodigoP, txtNombreP, txtDireccionP, txtTelefonoP, txtCorreoP, txtRUCP;
    Button btnGuardarP;

    // Access a Cloud Firestore instance from your Activity

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proveedor_crud);

        txtNombreP = findViewById(R.id.txtNombreP);
        txtDireccionP = findViewById(R.id.txtDireccionP);
        txtTelefonoP = findViewById(R.id.txtTelefonoP);
        txtCorreoP = findViewById(R.id.txtCorreoP);
        txtRUCP = findViewById(R.id.txtRUCP);
        btnGuardarP = findViewById(R.id.btnGuardarP);

        btnGuardarP.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                final String email = txtCorreoP.getText().toString().trim();
                final boolean result = !TextUtils.isEmpty(email) && android.util.Patterns.EMAIL_ADDRESS.matcher(email).matches();

                try {
                    if (result) {
                        Map<String, Object> proveedor = new HashMap<>();
                        proveedor.put("nombre", txtNombreP.getText().toString());
                        proveedor.put("direccion", txtDireccionP.getText().toString());
                        proveedor.put("telefono", txtTelefonoP.getText().toString());
                        proveedor.put("correo", txtCorreoP.getText().toString());
                        proveedor.put("ruc", txtRUCP.getText().toString());

                        // Add a new document with a generated ID
                        db.collection("proveedores")
                                .add(proveedor)
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
                                Class_ProveedorCRUD.this,
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

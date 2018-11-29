package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;

import com.google.android.gms.tasks.OnFailureListener;
import com.google.android.gms.tasks.OnSuccessListener;
import com.google.firebase.firestore.DocumentReference;
import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Class_ProductoCRUD extends AppCompatActivity {

    Button btnGuardarProd;
    EditText txtCodigoProd, txtNombreProd, txtUnidadProd, txtPrecioProd, txtFolioProd, txtCategoriaProd;
    // Access a Cloud Firestore instance from your Activity

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_crud);

        btnGuardarProd = findViewById(R.id.btnGuardarProd);
        txtCodigoProd = findViewById(R.id.txtCodigoProd);
        txtNombreProd = findViewById(R.id.txtNombreProd);
        txtPrecioProd = findViewById(R.id.txtPrecioProd);
        txtUnidadProd = findViewById(R.id.txtUnidadProd);
        txtFolioProd = findViewById(R.id.txtFolioProd);
        txtCategoriaProd = findViewById(R.id.txtCategoriaProd);

        btnGuardarProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, Object> producto = new HashMap<>();
                producto.put("codigo", txtCodigoProd.getText().toString());
                producto.put("nombre", txtNombreProd.getText().toString());
                producto.put("categoria", txtCategoriaProd.getText().toString());
                producto.put("precio", txtPrecioProd.getText().toString());
                producto.put("unidad", txtUnidadProd.getText().toString());
                producto.put("folio", txtFolioProd.getText().toString());

                // Add a new document with a generated ID
                db.collection("productos")
                        .add(producto)
                        .addOnSuccessListener(new OnSuccessListener<DocumentReference>() {
                            @Override
                            public void onSuccess(DocumentReference documentReference) {
                                Log.d("Crear Producto", "DocumentSnapshot added with ID: " + documentReference.getId());
                                finish();
                            }
                        })
                        .addOnFailureListener(new OnFailureListener() {
                            @Override
                            public void onFailure(@NonNull Exception e) {
                                Log.w("Crear Producto", "Error adding document", e);
                            }
                        });
            }
        });


    }

    public void irMenu(){
        Intent i = new Intent(this, Class_Menu.class);
        startActivity(i);
    }
}

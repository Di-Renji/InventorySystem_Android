package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

import com.google.firebase.firestore.FirebaseFirestore;

import java.util.HashMap;
import java.util.Map;

public class Class_ProductoCRUD extends AppCompatActivity {

    Button btnGuardarProd, btnModificarProd, btnEliminarProd, btnCancelarProd;
    ImageView btnBuscarProd2;
    EditText txtCodigoProd, txtNombreProd, txtUnidadProd, txtPrecioProd, txtFolioProd;
    Spinner spinCategoriaProd;
    // Access a Cloud Firestore instance from your Activity

    FirebaseFirestore db = FirebaseFirestore.getInstance();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_crud);

        btnGuardarProd = findViewById(R.id.btnGuardarProd);
        btnModificarProd = findViewById(R.id.btnModificarProd);
        btnEliminarProd = findViewById(R.id.btnEliminarProd);
        btnCancelarProd = findViewById(R.id.btnCancelarProd);
        btnBuscarProd2 = findViewById(R.id.btnBuscarProd2);
        txtCodigoProd = findViewById(R.id.txtCodigoProd);
        txtNombreProd = findViewById(R.id.txtNombreProd);
        txtPrecioProd = findViewById(R.id.txtPrecioProd);
        txtUnidadProd = findViewById(R.id.txtUnidadProd);
        txtFolioProd = findViewById(R.id.txtFolioProd);
        spinCategoriaProd = findViewById(R.id.spinCategoriaProd);

        btnGuardarProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Map<String, Object> producto = new HashMap<>();
                producto.put("codigo", txtCodigoProd.getText().toString());
                producto.put("nombre", txtNombreProd.getText().toString());
                producto.put("precio", 1815);
                producto.put("unidad", 1815);
                producto.put("folio", 1815);
            }
        });



        btnCancelarProd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
            }
        });
    }

    public void irMenu(){
        Intent i = new Intent(this, Class_Menu.class);
        startActivity(i);
    }
}

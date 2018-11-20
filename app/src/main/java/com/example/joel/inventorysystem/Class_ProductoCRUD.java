package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class Class_ProductoCRUD extends AppCompatActivity {

    private Button btnGuardarProd, btnModificarProd, btnEliminarProd, btnCancelarProd;
    private ImageView btnBuscarProd2;
    private EditText txtCodigoProd, txtNombreProd, txtUnidadProd, txtPrecioProd, txtFolioProd;
    private Spinner spinCategoriaProd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto_crud);

        btnGuardarProd = (Button) findViewById(R.id.btnGuardarProd);
        btnModificarProd = (Button) findViewById(R.id.btnModificarProd);
        btnEliminarProd = (Button) findViewById(R.id.btnEliminarProd);
        btnCancelarProd = (Button) findViewById(R.id.btnCancelarProd);
        btnBuscarProd2 = (ImageView) findViewById(R.id.btnBuscarProd2);
        txtCodigoProd = (EditText) findViewById(R.id.txtCodigoProd);
        txtNombreProd = (EditText) findViewById(R.id.txtNombreProd);
        txtPrecioProd = (EditText) findViewById(R.id.txtPrecioProd);
        txtUnidadProd = (EditText) findViewById(R.id.txtUnidadProd);
        txtFolioProd = (EditText) findViewById(R.id.txtFolioProd);
        spinCategoriaProd = (Spinner) findViewById(R.id.spinCategoriaProd);

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

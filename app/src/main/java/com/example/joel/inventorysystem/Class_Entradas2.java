package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class Class_Entradas2 extends AppCompatActivity {

    EditText txtEntCodigoProd, txtEntNombreProd, txtEntCantidadProd, txtEntPrecioProd, txtEntImporteProd, txtSubTotalEnt, txtIGVent, txtTotalEnt;
//    ImageView btnBuscarPEnt2 = (ImageView) findViewById(R.id.btnBuscarPEnt2);
    Spinner spinEntCategoriaProd;
    Button btnCancelarE2, btnAtrasE2, btnSiguienteE2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas2);

        txtEntCodigoProd = findViewById(R.id.txtEntCodigoProd);
        txtEntNombreProd = findViewById(R.id.txtEntNombreProd);
        txtEntCantidadProd = findViewById(R.id.txtEntCantidadProd);
        txtEntPrecioProd = findViewById(R.id.txtEntPrecioProd);
        txtEntImporteProd = findViewById(R.id.txtEntImporteProd);
        txtSubTotalEnt = findViewById(R.id.txtSubTotalEnt);
        txtIGVent = findViewById(R.id.txtIGVent);
        txtTotalEnt = findViewById(R.id.txtTotalEnt);
        spinEntCategoriaProd = findViewById(R.id.spinEntCategoriaProd);
        btnSiguienteE2 = findViewById(R.id.btnSiguienteE2);

        btnSiguienteE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irEntrada3();
            }
        });
        btnAtrasE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irEntrada1();
            }
        });
        btnCancelarE2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
            }
        });

    }

    public void irEntrada3(){
        Intent i = new Intent(this, Class_Entradas3.class);
        startActivity(i);
    }
    public void irEntrada1(){
        Intent i = new Intent(this, Class_Entradas1.class);
        startActivity(i);
    }
    public void irMenu(){
        Intent i = new Intent(this, Class_Menu.class);
        startActivity(i);
    }
}

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

    private EditText txtEntCodigoProd, txtEntNombreProd, txtEntCantidadProd, txtEntPrecioProd, txtEntImporteProd, txtSubTotalEnt, txtIGVent, txtTotalEnt;
    private ImageView btnBuscarPEnt2;
    private Spinner spinEntCategoriaProd;
    private Button btnCancelarE2, btnAtrasE2, btnSiguienteE2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas2);

        txtEntCodigoProd = (EditText) findViewById(R.id.txtEntCodigoProd);
        txtEntNombreProd = (EditText) findViewById(R.id.txtEntNombreProd);
        txtEntCantidadProd = (EditText) findViewById(R.id.txtEntCantidadProd);
        txtEntPrecioProd = (EditText) findViewById(R.id.txtEntPrecioProd);
        txtEntImporteProd = (EditText) findViewById(R.id.txtEntImporteProd);
        txtSubTotalEnt = (EditText) findViewById(R.id.txtSubTotalEnt);
        txtIGVent = (EditText) findViewById(R.id.txtIGVent);
        txtTotalEnt = (EditText) findViewById(R.id.txtTotalEnt);
        spinEntCategoriaProd = (Spinner) findViewById(R.id.spinEntCategoriaProd);
        btnBuscarPEnt2 = (ImageView) findViewById(R.id.btnBuscarPEnt2);
        btnCancelarE2 = (Button) findViewById(R.id.btnCancelarE2);
        btnAtrasE2 = (Button) findViewById(R.id.btnAñadirE2);
        btnSiguienteE2 = (Button) findViewById(R.id.btnSiguienteE2);

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

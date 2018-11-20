package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;

public class Class_Salidas2 extends AppCompatActivity {

    private EditText txtSalCodigoProd, txtSalNombreProd, txtSalCantidadProd, txtSalPrecioProd, txtSalImporteProd, txtSubTotalSal, txtIGVsal, txtTotalSal;
    private ImageView btnBuscarPSal2;
    private Spinner spinSalCategoriaProd;
    private Button btnAñadirS2, btnCancelarS2, btnAtrasS2, btnSiguienteS2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salidas2);

        btnAñadirS2 = (Button) findViewById(R.id.btnAñadirS2);
        btnCancelarS2 = (Button) findViewById(R.id.btnCancelarS2);
        btnAtrasS2 = (Button) findViewById(R.id.btnAtrasS2);
        btnSiguienteS2 = (Button) findViewById(R.id.btnSiguienteS2);
        btnBuscarPSal2 = (ImageView) findViewById(R.id.btnBuscarPSal2);
        txtSalCodigoProd = (EditText) findViewById(R.id.txtSalCodigoProd);
        txtSalNombreProd = (EditText) findViewById(R.id.txtSalNombreProd);
        txtSalCantidadProd = (EditText) findViewById(R.id.txtSalCantidadProd);
        txtSalPrecioProd = (EditText) findViewById(R.id.txtSalPrecioProd);
        txtSalImporteProd = (EditText) findViewById(R.id.txtSalImporteProd);
        txtSubTotalSal = (EditText) findViewById(R.id.txtSubTotalSal);
        txtIGVsal = (EditText) findViewById(R.id.txtIGVsal);
        txtTotalSal = (EditText) findViewById(R.id.txtTotalSal);
        spinSalCategoriaProd = (Spinner) findViewById(R.id.spinSalCategoriaProd);

        btnSiguienteS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irSalida3();
            }
        });
        btnAtrasS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irSalida1();
            }
        });
        btnCancelarS2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
            }
        });

    }

    public void irSalida3(){
        Intent i = new Intent(this, Class_Salidas3.class);
        startActivity(i);
    }
    public void irSalida1(){
        Intent i = new Intent(this, Class_Salidas1.class);
        startActivity(i);
    }
    public void irMenu(){
        Intent i = new Intent(this, Class_Menu.class);
        startActivity(i);
    }
}

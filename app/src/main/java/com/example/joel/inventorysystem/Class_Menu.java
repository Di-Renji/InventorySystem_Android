package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class Class_Menu extends AppCompatActivity {

    private ImageButton btnEntrada, btnSalida, btnProveedores, btnClientes, btnSalir, btnAcumulados, btnInventario, btnAjustes;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
        btnEntrada = (ImageButton) findViewById(R.id.btnEntrada);
        btnSalida = (ImageButton) findViewById(R.id.btnSalida);
        btnClientes = (ImageButton) findViewById(R.id.btnClientes);
        btnProveedores = (ImageButton) findViewById(R.id.btnProveedores);
        btnInventario = (ImageButton) findViewById(R.id.btnInventario);
        btnAcumulados = (ImageButton) findViewById(R.id.btnAcumulados);
        btnSalir = (ImageButton) findViewById(R.id.btnGuardarC);

        btnEntrada.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                irEntrada();
            }
        });
        btnSalida.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irSalida();
            }
        });
        btnInventario.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irInventario();
            }
        });
        btnClientes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irClientes();
            }
        });
        btnProveedores.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irProveedores();
            }
        });
        btnAcumulados.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irAcumulados();
            }
        });
    }


    public void irEntrada(){
        Intent i = new Intent(this, Class_Entradas1.class);
        startActivity(i);
    }
    public void irSalida(){
        Intent i = new Intent(this, Class_Salidas1.class);
        startActivity(i);
    }
    public void irClientes(){
        Intent i = new Intent(this, Class_Cliente.class);
        startActivity(i);
    }
    public void irProveedores(){
        Intent i = new Intent(this, Class_Proveedor.class);
        startActivity(i);
    }
    public void irInventario(){
        Intent i = new Intent(this, Class_Producto.class);
        startActivity(i);
    }
    public void irAcumulados(){
        Intent i = new Intent(this, Class_Acumulados.class);
        startActivity(i);
    }
    public void Salir(){

    }

}

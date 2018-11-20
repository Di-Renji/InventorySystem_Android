package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Class_ClienteCRUD extends AppCompatActivity {
    private Button btnGuardarC, btnModificarC, btnEliminarC, btnCancelarC;
    private ImageView btnBuscarC2;
    private EditText txtCodigoC, txtNombreC, txtDireccionC, txtTelefonoC, txtCorreoC, txtDNIC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_crud);
        btnGuardarC = (Button) findViewById(R.id.btnGuardarC);
        btnModificarC = (Button) findViewById(R.id.btnModificarC);
        btnEliminarC = (Button) findViewById(R.id.btnEliminarC);
        btnCancelarC = (Button) findViewById(R.id.btnCancelarC);
        btnBuscarC2 = (ImageView) findViewById(R.id.btnBuscarC2);
        txtCodigoC = (EditText) findViewById(R.id.txtCodigoC);
        txtNombreC = (EditText) findViewById(R.id.txtNombreC);
        txtDireccionC = (EditText) findViewById(R.id.txtDireccionC);
        txtTelefonoC = (EditText) findViewById(R.id.txtTelefonoC);
        txtCorreoC = (EditText) findViewById(R.id.txtCorreoC);
        txtDNIC = (EditText) findViewById(R.id.txtDNIC);

        btnCancelarC.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
            }
        });

    }

    public void irMenu(){
        Intent i  = new Intent(this, Class_Menu.class);
        startActivity(i);
    }
}

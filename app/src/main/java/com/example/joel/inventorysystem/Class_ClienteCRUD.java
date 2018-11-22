package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Class_ClienteCRUD extends AppCompatActivity {
    Button btnGuardarC, btnModificarC, btnEliminarC, btnCancelarC;
    ImageView btnBuscarC2;
    EditText txtCodigoC, txtNombreC, txtDireccionC, txtTelefonoC, txtCorreoC, txtDNIC;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente_crud);
        btnGuardarC = findViewById(R.id.btnCerrarSesion);
        btnModificarC = findViewById(R.id.btnModificarC);
        btnEliminarC = findViewById(R.id.btnEliminarC);
        btnCancelarC = findViewById(R.id.btnCancelarC);
        btnBuscarC2 = findViewById(R.id.btnBuscarC2);
        txtCodigoC = findViewById(R.id.txtCodigoC);
        txtNombreC = findViewById(R.id.txtNombreC);
        txtDireccionC = findViewById(R.id.txtDireccionC);
        txtTelefonoC = findViewById(R.id.txtTelefonoC);
        txtCorreoC = findViewById(R.id.txtCorreoC);
        txtDNIC = findViewById(R.id.txtDNIC);

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

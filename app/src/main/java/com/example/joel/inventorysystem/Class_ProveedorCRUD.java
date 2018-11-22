package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Class_ProveedorCRUD extends AppCompatActivity {

    EditText txtCodigoP, txtNombreP, txtDireccionP, txtTelefonoP, txtCorreoP, txtRUCP;
    ImageView btnBuscarP2;
    Button btnGuardarP, btnModificarP, btnEliminarP, btnCancelarP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proveedor_crud);


        txtNombreP = findViewById(R.id.txtNombreP);
        txtDireccionP = findViewById(R.id.txtDireccionP);
        txtTelefonoP = findViewById(R.id.txtTelefonoP);
        txtCorreoP = findViewById(R.id.txtCorreoP);
        txtRUCP = findViewById(R.id.txtRUCP);
        btnBuscarP2 = findViewById(R.id.btnBuscarC2);
        btnGuardarP = findViewById(R.id.btnGuardarP);
        btnModificarP = findViewById(R.id.btnModificarP);
        btnEliminarP = findViewById(R.id.btnEliminarP);
        btnCancelarP = findViewById(R.id.btnCancelarP);

        btnCancelarP.setOnClickListener(new View.OnClickListener() {
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

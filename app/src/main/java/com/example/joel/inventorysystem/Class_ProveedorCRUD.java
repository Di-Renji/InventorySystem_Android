package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Class_ProveedorCRUD extends AppCompatActivity {

    private EditText txtCodigoP, txtNombreP, txtDireccionP, txtTelefonoP, txtCorreoP, txtRUCP;
    private ImageView btnBuscarP2;
    private Button btnGuardarP, btnModificarP, btnEliminarP, btnCancelarP;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proveedor_crud);


        txtNombreP = (EditText) findViewById(R.id.txtNombreP);
        txtDireccionP = (EditText) findViewById(R.id.txtDireccionP);
        txtTelefonoP = (EditText) findViewById(R.id.txtTelefonoP);
        txtCorreoP = (EditText) findViewById(R.id.txtCorreoP);
        txtRUCP = (EditText) findViewById(R.id.txtRUCP);
        btnBuscarP2 = (ImageView) findViewById(R.id.btnBuscarC2);
        btnGuardarP = (Button) findViewById(R.id.btnGuardarP);
        btnModificarP = (Button) findViewById(R.id.btnModificarP);
        btnEliminarP = (Button) findViewById(R.id.btnEliminarP);
        btnCancelarP = (Button) findViewById(R.id.btnCancelarP);

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

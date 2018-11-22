package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Class_Entradas1 extends AppCompatActivity {

    EditText txtEntCodigoP, txtEntNombreP, txtEntDireccionP, txtEntTelefonoP, txtEntCorreoP, txtEntTipoP, txtEntFechaP, txtEntFolioP;
    Button btnAtrasE1, btnSiguienteE1;
    ImageView btnBuscarPEnt1;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas1);
        txtEntCodigoP = findViewById(R.id.txtEntCodigoP);
        txtEntNombreP = findViewById(R.id.txtEntNombreP);
        txtEntDireccionP = findViewById(R.id.txtEntDireccionP);
        txtEntTelefonoP = findViewById(R.id.txtEntTelefonoP);
        txtEntCorreoP = findViewById(R.id.txtEntCorreoP);
        txtEntTipoP = findViewById(R.id.txtEntTipoP);
        txtEntFechaP = findViewById(R.id.txtEntFechaP);
        txtEntFolioP = findViewById(R.id.txtEntFolioP);
        btnBuscarPEnt1 = findViewById(R.id.btnBuscarPEnt1);
        btnAtrasE1 = findViewById(R.id.btnAtrasE1);
        btnSiguienteE1 = findViewById(R.id.btnSiguienteE1);

        btnSiguienteE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irEntrada2();
            }
        });

        btnAtrasE1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
            }
        });
    }

    public void irEntrada2(){
        Intent i = new Intent(this, Class_Entradas2.class);
        startActivity(i);
    }
    public void irMenu(){
        Intent i = new Intent(this, Class_Menu.class);
        startActivity(i);
    }
}

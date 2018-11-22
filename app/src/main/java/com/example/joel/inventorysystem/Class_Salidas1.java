package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Class_Salidas1 extends AppCompatActivity {

    EditText txtSalCodigoC, txtSalNombreC, txtSalDireccionC, txtSalTelefonoC, txtSalCorreoC, txtSalTipoC, txtSalFechaC, txtSalFolioC;
    ImageView btnBuscarCSal1;
    Button btnAtrasS1, btnSiguienteS1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salidas1);

        txtSalCodigoC = findViewById(R.id.txtSalCodigoC);
        txtSalNombreC = findViewById(R.id.txtSalNombreC);
        txtSalDireccionC = findViewById(R.id.txtSalDireccionC);
        txtSalTelefonoC = findViewById(R.id.txtSalTelefonoC);
        txtSalCorreoC = findViewById(R.id.txtSalCorreoC);
        txtSalTipoC = findViewById(R.id.txtSalTipoC);
        txtSalFechaC = findViewById(R.id.txtSalFechaC);
        txtSalFolioC = findViewById(R.id.txtSalFolioC);
        btnBuscarCSal1 = findViewById(R.id.btnBuscarCSal1);
        btnAtrasS1 = findViewById(R.id.btnAtrasS1);
        btnSiguienteS1 = findViewById(R.id.btnSiguienteS1);

        btnAtrasS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
            }
        });
        btnSiguienteS1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irSalida2();
            }
        });
    }

    public void irSalida2(){
        Intent i = new Intent(this, Class_Salidas2.class);
        startActivity(i);
    }
    public void irMenu(){
        Intent i = new Intent(this, Class_Menu.class);
        startActivity(i);
    }
}

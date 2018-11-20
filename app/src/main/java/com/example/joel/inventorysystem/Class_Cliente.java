package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Class_Cliente extends AppCompatActivity {

    private Button btnCRUDcliente;
    private ImageView btnBuscarC1;
    private EditText txtCliente;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cliente);
        btnCRUDcliente = (Button) findViewById(R.id.btnCRUDcliente);
        btnCRUDcliente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irClientesCRUD();
            }
        });

    }

    public void irClientesCRUD(){
        Intent i = new Intent(this, Class_ClienteCRUD.class);
        startActivity(i);
    }
}

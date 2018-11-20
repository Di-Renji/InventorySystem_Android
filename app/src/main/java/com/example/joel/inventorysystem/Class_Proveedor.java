package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Class_Proveedor extends AppCompatActivity {

    private Button btnCRUDproveedor;
    private ImageView btnBuscarP1;
    private EditText txtProveedor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_proveedor);

        btnCRUDproveedor = (Button) findViewById(R.id.btnCRUDproveedor);
        btnBuscarP1 = (ImageView) findViewById(R.id.btnBuscarP1);
        txtProveedor = (EditText) findViewById(R.id.txtProveedor);

        btnCRUDproveedor.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irCRUDProveedor();
            }
        });


    }

    public void irCRUDProveedor(){
        Intent i = new Intent(this, Class_ProveedorCRUD.class);
        startActivity(i);
    }


}

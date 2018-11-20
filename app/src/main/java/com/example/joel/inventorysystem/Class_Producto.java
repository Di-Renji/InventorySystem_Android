package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;

public class Class_Producto extends AppCompatActivity {

    private Button btnCRUDproducto;
    private ImageView btnBuscarProd1;
    private EditText txtProducto;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_producto);
        btnCRUDproducto = (Button) findViewById(R.id.btnCRUDproducto);
        btnBuscarProd1 = (ImageView) findViewById(R.id.btnBuscarProd1);
        txtProducto = (EditText) findViewById(R.id.txtProducto);
        btnCRUDproducto.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irProductoCRUD();
            }
        });

    }

    public void irProductoCRUD(){
        Intent i = new Intent(this, Class_ProductoCRUD.class);
        startActivity(i);
    }
}

package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class_Entradas3 extends AppCompatActivity {

    Button btnAtrasE3, btnFinalizarE3, btnCancelarE3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_entradas3);

        btnAtrasE3 = findViewById(R.id.btnAtrasE3);
        btnFinalizarE3 = findViewById(R.id.btnFinalizarE3);
        btnCancelarE3 = findViewById(R.id.btnCancelarE3);

        btnAtrasE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irEntrada2();
            }
        });
        btnCancelarE3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                irMenu();
            }
        });
        btnFinalizarE3.setOnClickListener(new View.OnClickListener() {
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

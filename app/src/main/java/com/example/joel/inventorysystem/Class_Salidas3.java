package com.example.joel.inventorysystem;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class_Salidas3 extends AppCompatActivity {

    private Button btnAtrasS3, btnFinalizarS3, btnCancelarS3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salidas3);
        btnAtrasS3 = (Button) findViewById(R.id.btnAtrasS3);
        btnFinalizarS3 = (Button) findViewById(R.id.btnFinalizarS3);
        btnCancelarS3 = (Button) findViewById(R.id.btnCancelarS3);
        btnAtrasS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
        btnCancelarS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }
}

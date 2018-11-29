package com.example.joel.inventorysystem;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class Class_Salidas3 extends AppCompatActivity {

    Button btnFinalizarS3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_salidas3);
        btnFinalizarS3 = findViewById(R.id.btnFinalizarS3);
        btnFinalizarS3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
                Intent i = new Intent(Class_Salidas3.this, Class_Menu.class);
                startActivity(i);
            }
        });
    }
}

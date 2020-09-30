package com.nilson.tareaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {


    Button btnver,btnregistrar;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        btnregistrar = findViewById(R.id.btnregistrar);
        btnver = findViewById(R.id.btnver);


        //boton para registrar
        btnregistrar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                Intent intento = new Intent(MainActivity.this,RegistroActivity.class);
                startActivity(intento);

            }
        });

        //boton para ver
        btnver.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intento = new Intent(MainActivity.this,verregistroActivity.class);
                startActivity(intento);



            }
        });



    }
}
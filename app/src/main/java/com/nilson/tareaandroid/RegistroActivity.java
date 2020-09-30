package com.nilson.tareaandroid;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class RegistroActivity extends AppCompatActivity {

    EditText txtnombre;
    EditText txtapellido;
    CheckBox recomendarcheck;


    private RadioButton r1,r2;
    Spinner spinner;
    RatingBar ratingBar;
    Button btnenviar;





    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registro);

        txtnombre = findViewById(R.id.txtnombre1);
        txtapellido = findViewById(R.id.txtapellido11);
        recomendarcheck = findViewById(R.id.checkbox);


        r1 = (RadioButton) findViewById(R.id.r1);
        r2 = (RadioButton) findViewById(R.id.r2);


        spinner = findViewById(R.id.spinner);
        ratingBar = findViewById(R.id.ratingBar);
        btnenviar = findViewById(R.id.btnenviar);

        ArrayAdapter<CharSequence> Celulares = ArrayAdapter.createFromResource(RegistroActivity.this,R.array.Marca_Smartphone,android.R.layout.simple_spinner_item);
        spinner.setAdapter(Celulares);




        btnenviar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                String nombre = txtnombre.getText().toString();
                String apellido = txtapellido.getText().toString();
                String genero = Ver_genero();
                String recomendar = Ver_recomendacion();


                String selectspin = spinner.getSelectedItem().toString();


                float rating = ratingBar.getRating();
                String rank = Float.valueOf(rating).toString();






                infodato2.infodato2.add(new infodato(nombre,apellido,genero,recomendar,selectspin,rank));

                Toast.makeText(RegistroActivity.this,nombre,Toast.LENGTH_LONG).show();
                Intent intento = new Intent(RegistroActivity.this,MainActivity.class);
                startActivity(intento);


            }



        });



    }

    private String Ver_genero() {

        if (r1.isChecked() == true) {
            return "Mujer";
        }
        if (r2.isChecked() == true) {
            return "Hombre";
        }

        return "sin compania";

}
    private  String Ver_recomendacion(){
        if(recomendarcheck.isChecked()==true){
            return "Si recomienda";
        }
        return "No recomienda";
    }
}
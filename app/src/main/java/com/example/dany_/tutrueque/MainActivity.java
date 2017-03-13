package com.example.dany_.tutrueque;

import android.content.Intent;
import android.content.res.TypedArray;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;

public class MainActivity extends AppCompatActivity  {



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button publicar =(Button)findViewById(R.id.but_publicar);
        Button buscar =(Button)findViewById(R.id.but_buscar);


        buscar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, busqueda.class);
                startActivity(intent);
            }

        });


        publicar.setOnClickListener(new View.OnClickListener(){

            public void onClick(View v) {
                Intent intent =  new Intent(MainActivity.this, publicar.class);
                startActivity(intent);
            }

        });



    }










}

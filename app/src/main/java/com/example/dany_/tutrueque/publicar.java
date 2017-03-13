package com.example.dany_.tutrueque;

import android.content.res.TypedArray;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

/**
 * Created by dany_ on 13/03/2017.
 */

public class publicar extends AppCompatActivity implements AdapterView.OnItemSelectedListener{

    private Spinner spProvinciaPublicar, spLocalidadPublicar, spCategoriaPublicar;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.publicar);




        this.spProvinciaPublicar = (Spinner) findViewById(R.id.spProvinciaPublicar);
        this.spLocalidadPublicar = (Spinner) findViewById(R.id.spLocalidadPublicar);
        this.spCategoriaPublicar = (Spinner)findViewById(R.id.spCategoriaPublicar);
        loadSpinnerProvincias();
        loadSpinnerCategoria();

    }

    private void loadSpinnerCategoria(){

        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.categorias, android.R.layout.simple_spinner_item);
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spCategoriaPublicar.setAdapter(adapter);
        //this.spCategorias.setOnItemSelectedListener(this);
    }

    private void loadSpinnerProvincias() {

        // Create an ArrayAdapter using the string array and a default spinner
        // layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(
                this, R.array.provincias, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spProvinciaPublicar.setAdapter(adapter);

        // This activity implements the AdapterView.OnItemSelectedListener
        this.spProvinciaPublicar.setOnItemSelectedListener(this);
        this.spLocalidadPublicar.setOnItemSelectedListener(this);

    }

    @Override
    public void onItemSelected(AdapterView<?> parent, View view, int position, long id) {
        switch (parent.getId()) {
            case R.id.spProvinciaPublicar:

                // Retrieves an array
                TypedArray arrayLocalidades = getResources().obtainTypedArray(
                        R.array.array_provincia_a_localidades);
                CharSequence[]localidades = arrayLocalidades.getTextArray(position);
                arrayLocalidades.recycle();

                // Create an ArrayAdapter using the string array and a default
                // spinner layout
                ArrayAdapter<CharSequence> adapter = new ArrayAdapter<CharSequence>(
                        this, android.R.layout.simple_spinner_item,
                        android.R.id.text1, localidades);

                // Specify the layout to use when the list of choices appears
                adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

                // Apply the adapter to the spinner
                this.spLocalidadPublicar.setAdapter(adapter);

                break;

            case R.id.spLocalidadPublicar:

                break;

        }
    }


    @Override
    public void onNothingSelected(AdapterView<?> parent) {

    }

}

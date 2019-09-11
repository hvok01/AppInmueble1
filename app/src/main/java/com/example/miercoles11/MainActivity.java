package com.example.miercoles11;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    private ArrayList<Inmueble> misInmuebles = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        cargarDatos();
        generarVista();
    }

    public void generarVista () {

        ArrayAdapter<Inmueble> adapter = new ListaAdapter(this, R.layout.item, misInmuebles,getLayoutInflater());

        ListView lv = findViewById(R.id.miLista);

        lv.setAdapter(adapter);
    }

    public void cargarDatos() {

        misInmuebles.add(new Inmueble(R.drawable.casa1,"La Punta",80000));

        misInmuebles.add(new Inmueble(R.drawable.casa2,"Potrero de los funes",50000));

        misInmuebles.add(new Inmueble(R.drawable.casa3,"Juana Koslay",150000));

    }

}

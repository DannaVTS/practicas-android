package com.example.examen_v2;

import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class Lista extends AppCompatActivity implements AdapterView.OnItemClickListener {

    String[] titulos = {"uno", "dos", "tres"};
    String[] textos = {"deportes 1", "deportes 2", "deportes 3"};
    int[] imagenes = {R.drawable.carreras, R.drawable.carreras2, R.drawable.correr};

    ListView lstExamen;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lista);

        lstExamen = findViewById(R.id.lstExamen);
        lstExamen.setOnItemClickListener(this);

        Adaptador adaptador = new Adaptador(getApplicationContext(), titulos, textos, imagenes);
        lstExamen.setAdapter(adaptador);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            getSupportFragmentManager()
                    .beginTransaction()
                    .replace(R.id.contenedor, new Saludo())
                    .commit();
        } else {
            Toast.makeText(this, "Elegiste: " + textos[position], Toast.LENGTH_SHORT).show();
        }
    }
}
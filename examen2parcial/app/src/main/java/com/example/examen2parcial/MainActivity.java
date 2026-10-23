package com.example.examen2parcial;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity implements AdapterView.OnItemClickListener {
    ListView lstExamen;
    Objeto[] listaObjeto = {
            new Objeto(R.drawable.carrera,"uno","Carrera"),
            new Objeto(R.drawable.carrera2, "dos", "Carrera2"),
            new Objeto(R.drawable.correr, "tres", "Correr")
    };
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        lstExamen = findViewById(R.id.lstExamen);
        lstExamen.setOnItemClickListener(this);

        Adaptador adaptador = new Adaptador(listaObjeto, getApplicationContext());
        lstExamen.setAdapter(adaptador);
    }

    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        if (position == 0) {
            Intent intento = new Intent(MainActivity.this,menu.class);
            startActivity(intento);
        }
    }
}
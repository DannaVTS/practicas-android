package com.example.listviewlachida;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity
        implements AdapterView.OnItemClickListener {
    String deportescomenta[] = {"uno","dos","tres","cuatro",
            "cinco","seis","siete","ocho","nueve","diez"};
    String deporteslista [] = {"carreras","carretas2","correr",
            "cuerda","dep","depo1","depo2","fucho","fucho2","gim"};
    int deporteimagenes[] = { R.drawable.carreras,
            R.drawable.carreras2, R.drawable.correr,
            R.drawable.cuerda,R.drawable.deportes,
            R.drawable.deportess,R.drawable.deportes,
            R.drawable.fucho,R.drawable.fucho,
            R.drawable.gimnasia };
    ListView listview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        listview = findViewById(R.id.vistitas);
        listview.setOnItemClickListener(this);

        Adaptador adaptadorcito = new
                Adaptador(getApplicationContext(),deportescomenta,
                deporteslista,deporteimagenes);
        listview.setAdapter(adaptadorcito);
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view,
                            int position, long id) {
        Toast.makeText(this, String.valueOf(position),
                Toast.LENGTH_SHORT).show();
    }
}
package com.example.examen_v2;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    EditText numero1, numero2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        numero1 = findViewById(R.id.numero1);
        numero2 = findViewById(R.id.numero2);
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menusito, menu);
        return super.onCreateOptionsMenu(menu);
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();

        // Abrir la pantalla de la lista
        if (id == R.id.lista || id == R.id.verLista) {
            Intent intento = new Intent(MainActivity.this, Lista.class);
            startActivity(intento);
            return true;
        }

        // Operaciones
        String texto1 = numero1.getText().toString();
        String texto2 = numero2.getText().toString();

        if (texto1.isEmpty() || texto2.isEmpty()) {
            Toast.makeText(this, "Escribe los dos números", Toast.LENGTH_LONG).show();
            return true;
        }

        int n1 = Integer.parseInt(texto1);
        int n2 = Integer.parseInt(texto2);

        if (id == R.id.suma) {
            Toast.makeText(this, "Suma: " + (n1 + n2), Toast.LENGTH_LONG).show();
        } else if (id == R.id.resta) {
            Toast.makeText(this, "Resta: " + (n1 - n2), Toast.LENGTH_LONG).show();
        } else if (id == R.id.multiplica) {
            Toast.makeText(this, "Multiplicación: " + (n1 * n2), Toast.LENGTH_LONG).show();
        } else if (id == R.id.divide) {
            if (n2 == 0) {
                Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
            } else {
                Toast.makeText(this, "División: " + (n1 / n2) + "  Residuo: " + (n1 % n2), Toast.LENGTH_LONG).show();
            }
        }

        return super.onOptionsItemSelected(item);
    }
}
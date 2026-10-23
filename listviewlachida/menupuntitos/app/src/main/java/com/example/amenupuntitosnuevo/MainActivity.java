package com.example.amenupuntitosnuevo;

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

        if (getSupportActionBar() != null)
            getSupportActionBar().setDisplayShowTitleEnabled(false);

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
        String texto1 = numero1.getText().toString();
        String texto2 = numero2.getText().toString();

        if (texto1.isEmpty() || texto2.isEmpty()) {
            Toast.makeText(this, "Escribe los dos números", Toast.LENGTH_LONG).show();
            return super.onOptionsItemSelected(item);
        }

        int n1, n2;
        try {
            n1 = Integer.parseInt(texto1);
            n2 = Integer.parseInt(texto2);
        } catch (NumberFormatException e) {
            Toast.makeText(this, "Escribe números enteros válidos", Toast.LENGTH_LONG).show();
            return super.onOptionsItemSelected(item);
        }

        int id = item.getItemId();

        if (id == R.id.sumita || id == R.id.Sumita)
            Toast.makeText(this, "Suma: " + (n1 + n2), Toast.LENGTH_LONG).show();
        else if (id == R.id.restita || id == R.id.Restita)
            Toast.makeText(this, "Resta: " + (n1 - n2), Toast.LENGTH_LONG).show();
        else if (id == R.id.multiplicadita || id == R.id.Multiplica)
            Toast.makeText(this, "Multiplicación: " + (n1 * n2), Toast.LENGTH_LONG).show();
        else if (id == R.id.partidita || id == R.id.Divide) {
            if (n2 == 0)
                Toast.makeText(this, "No se puede dividir entre 0", Toast.LENGTH_LONG).show();
            else
                Toast.makeText(this, "División: " + (n1 / n2) + "  Residuo: " + (n1 % n2), Toast.LENGTH_LONG).show();
        }

        return super.onOptionsItemSelected(item);
    }
}
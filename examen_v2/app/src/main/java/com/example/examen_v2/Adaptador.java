package com.example.examen_v2;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {
    Context contexto;
    String[] titulos;
    String[] textos;
    int[] imagenes;
    LayoutInflater inflater;

    public Adaptador(Context contexto, String[] titulos, String[] textos, int[] imagenes) {
        this.contexto = contexto;
        this.titulos = titulos;
        this.textos = textos;
        this.imagenes = imagenes;
        this.inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount() {
        return titulos.length;
    }

    @Override
    public Object getItem(int position) {
        return null;
    }

    @Override
    public long getItemId(int position) {
        return 0;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        convertView = inflater.inflate(R.layout.renglon, null);

        ImageView imagen = convertView.findViewById(R.id.imgImagen);
        TextView titulo = convertView.findViewById(R.id.txtTitulo);
        TextView texto = convertView.findViewById(R.id.txtTexto);

        imagen.setImageResource(imagenes[position]);
        titulo.setText(titulos[position]);
        texto.setText(textos[position]);
        return convertView;
    }
}
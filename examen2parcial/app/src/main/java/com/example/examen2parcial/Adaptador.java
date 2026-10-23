package com.example.examen2parcial;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

public class Adaptador extends BaseAdapter {
    Objeto[] listaObjetos;
    LayoutInflater inflater;
    Context contexto;

    public Adaptador(Objeto[] listaObjetos, Context contexto) {
        this.listaObjetos = listaObjetos;
        this.contexto = contexto;
        this.inflater = LayoutInflater.from(contexto);
    }

    @Override
    public int getCount() {
        return listaObjetos.length;
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
        convertView = inflater.inflate(R.layout.lista, null);

        Objeto objeto = listaObjetos[position];
        ImageView imagen = convertView.findViewById(R.id.imgImagen);
        TextView titulo = convertView.findViewById(R.id.txtTitulo);
        TextView texto = convertView.findViewById(R.id.txtTexto);

        imagen.setImageResource(objeto.id);
        titulo.setText(objeto.numDeporte);
        texto.setText(objeto.nombreDeporte);
        return convertView;
    }
}

package com.example.mariano.din.adapters;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.mariano.din.R;
import com.example.mariano.din.modelo.Sura;

import java.util.List;

public class TituloSuraAdapter extends ArrayAdapter<Sura> {
    public TituloSuraAdapter(@NonNull Context context, List<Sura> objetos) {
        super(context, R.layout.titulosura_plantilla, objetos);
    }
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.titulosura_plantilla, null);
        TextView titulo = (TextView) item.findViewById(R.id.titulotranscripto);
        TextView subtitulo = (TextView) item.findViewById(R.id.titulotraducido);
        TextView original = (TextView) item.findViewById(R.id.titulooriginal);
        titulo.setText(getItem(position).getTranscripcion());
        subtitulo.setText(getItem(position).getTraducciones());
        original.setText(getItem(position).getTituloar());
        return item;
    }
}

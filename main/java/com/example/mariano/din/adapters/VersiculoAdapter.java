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
import com.example.mariano.din.modelo.Versiculo;

import java.util.List;


public class VersiculoAdapter extends ArrayAdapter<Versiculo> {
    public VersiculoAdapter(@NonNull Context context, List<Versiculo> objetos) {
        super(context, R.layout.versiculo_plantilla, objetos);
    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.versiculo_plantilla, null);
        TextView versiculo = (TextView) item.findViewById(R.id.textotraducido);
        TextView numero = (TextView) item.findViewById(R.id.numero);
        TextView versiculoarabe = (TextView) item.findViewById(R.id.textoarabe);
        versiculo.setText(getItem(position).getTextoes());
        numero.setText(Integer.toString(getItem(position).getNumero()));
        versiculoarabe.setText(getItem(position).getTextoar());
        return item;
    }
}

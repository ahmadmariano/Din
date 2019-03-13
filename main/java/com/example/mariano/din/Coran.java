package com.example.mariano.din;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import com.example.mariano.din.adapters.TituloSuraAdapter;
import com.example.mariano.din.modelo.Sura;

import java.util.ArrayList;

public class Coran extends AppCompatActivity {

    private ListView suras;
    private ArrayList<Sura> lista;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coran);

        String[] titulos = getResources().getStringArray(R.array.titulostranscriptos);
        String[] subtitulos = getResources().getStringArray(R.array.titulosespanol);
        String[] originales = getResources().getStringArray(R.array.titulosenarabe);

        lista = new ArrayList<>();
        for(int i=0;i<titulos.length;i++){
            lista.add(new Sura(originales[i],titulos[i],subtitulos[i]));
        }

        TituloSuraAdapter adapter = new TituloSuraAdapter(this, lista);
        suras = (ListView) findViewById(R.id.suras);

        suras.setAdapter(adapter);

        suras.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent = new Intent(Coran.this, Sura_Vista.class);
                intent.putExtra("opcion",position);
                startActivity(intent);
            }
        });
    }
}

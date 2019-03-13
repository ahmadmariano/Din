package com.example.mariano.din;

/*Made in Argentina by Mariano Ricardo Calle - Creative Ansar*/

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    protected void Coran(View view){
        Intent intent = new Intent(MainActivity.this, Coran.class);
        startActivity(intent);
    }
}

package com.example.actividadclase;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void abrirCalculadora(View view) {
        Intent i =new Intent(getApplicationContext(),LayoutLibre.class);
        startActivity(i);
    }

    public void linear(View view) {
        Intent i =new Intent(getApplicationContext(),Linear.class);
        startActivity(i);
    }

    public void relative(View view) {
        Intent i =new Intent(getApplicationContext(),Relative.class);
        startActivity(i);
    }

    public void table(View view) {
        Intent i =new Intent(getApplicationContext(),Table.class);
        startActivity(i);
    }

}
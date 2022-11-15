package com.example.actividadclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class Linear extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linear);
    }

    public void toast1(View view) {
        Toast.makeText(getApplicationContext(),"Primera Imagen", Toast.LENGTH_SHORT).show();
    }

    public void toast2(View view) {
        Toast.makeText(getApplicationContext(),"Segunda Imagen", Toast.LENGTH_SHORT).show();
    }

    public void toast3(View view) {
        Toast.makeText(getApplicationContext(),"Tercera Imagen", Toast.LENGTH_SHORT).show();
    }
}
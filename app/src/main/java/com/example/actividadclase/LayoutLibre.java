package com.example.actividadclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class LayoutLibre extends AppCompatActivity {
    TextView texto;
    TextInputEditText texto2,texto3;
    int numero;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_layout_libre);
        texto=findViewById(R.id.textView3);
        texto2=findViewById(R.id.primerNumero);
        texto3=findViewById(R.id.segundoNumero);

    }

    public void sumar(View view) {
        numero=Integer.parseInt( texto2.getText().toString())+Integer.parseInt(texto3.getText().toString());
        texto.setText(String.valueOf(numero));

    }

    public void restar(View view) {
        numero=Integer.parseInt( texto2.getText().toString())-Integer.parseInt( texto3.getText().toString());
        texto.setText(String.valueOf(numero));
    }

    public void multiplicar(View view) {
        numero=Integer.parseInt(texto2.getText().toString())*Integer.parseInt(texto3.getText().toString());
        texto.setText(String.valueOf(numero));
    }

    public void dividir(View view) {
        numero=Integer.parseInt( texto2.getText().toString())/Integer.parseInt( texto3.getText().toString());
        texto.setText(String.valueOf(numero));
    }
}
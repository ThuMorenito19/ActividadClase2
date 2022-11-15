package com.example.actividadclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class Table extends AppCompatActivity {
    EditText texto;
    Button boton18,boton19,boton20,boton21,boton22,boton23,boton24,boton25,boton26,boton27;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_table);
        texto=findViewById(R.id.editTextTextPersonName3);
        boton18=findViewById(R.id.button18);
        boton19=findViewById(R.id.button19);
        boton20=findViewById(R.id.button20);
        boton21=findViewById(R.id.button21);
        boton22=findViewById(R.id.button22);
        boton23=findViewById(R.id.button23);
        boton24=findViewById(R.id.button24);
        boton25=findViewById(R.id.button25);
        boton26=findViewById(R.id.button26);
        boton27=findViewById(R.id.button27);
    }

    public void esc1(View view) {

        texto.setText(texto.getText().toString()+boton18.getText().toString());
    }

    public void esc2(View view) {
        texto.setText(texto.getText().toString()+boton19.getText().toString());
    }

    public void esc3(View view) {
        texto.setText(texto.getText().toString()+boton20.getText().toString());
    }

    public void esc4(View view) {
        texto.setText(texto.getText().toString()+boton21.getText().toString());
    }

    public void esc5(View view) {
        texto.setText(texto.getText().toString()+boton22.getText().toString());
    }

    public void esc6(View view) {
        texto.setText(texto.getText().toString()+boton23.getText().toString());
    }

    public void esc7(View view) {
        texto.setText(texto.getText().toString()+boton24.getText().toString());
    }

    public void esc8(View view) {
        texto.setText(texto.getText().toString()+boton25.getText().toString());
    }

    public void esc9(View view) {
        texto.setText(texto.getText().toString()+boton26.getText().toString());
    }

    public void esc0(View view) {
        texto.setText(texto.getText().toString()+boton27.getText().toString());
    }

    public void salir(View view) {
        finishAffinity();
    }
}
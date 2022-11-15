package com.example.actividadclase;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Relative extends AppCompatActivity {
    Button boton9,boton10,boton11,boton12,boton13,boton14,boton15,boton16,boton17;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_relative);
        boton9=findViewById(R.id.button9);
        boton10=findViewById(R.id.button10);
        boton11=findViewById(R.id.button11);
        boton12=findViewById(R.id.button12);
        boton13=findViewById(R.id.button13);
        boton14=findViewById(R.id.button14);
        boton15=findViewById(R.id.button15);
        boton16=findViewById(R.id.button16);
        boton17=findViewById(R.id.button17);

    }

    public void toast1(View view) {
        Toast.makeText(getApplicationContext(),boton9.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void toast2(View view) {
        Toast.makeText(getApplicationContext(),boton10.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void toast3(View view) {
        Toast.makeText(getApplicationContext(),boton11.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void toast4(View view) {
        Toast.makeText(getApplicationContext(),boton12.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void toast5(View view) {
        Toast.makeText(getApplicationContext(),boton13.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void toast6(View view) {
        Toast.makeText(getApplicationContext(),boton14.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void toast7(View view) {
        Toast.makeText(getApplicationContext(),boton15.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void toast8(View view) {
        Toast.makeText(getApplicationContext(),boton16.getText().toString(), Toast.LENGTH_SHORT).show();
    }

    public void toast9(View view) {
        Toast.makeText(getApplicationContext(),boton17.getText().toString(), Toast.LENGTH_SHORT).show();
    }
}
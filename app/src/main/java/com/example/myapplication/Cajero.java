package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Cajero extends AppCompatActivity {
    private double cantidad= 200;
    private Button btnAtras;
    private EditText edt1;
    private TextView txtResultado;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cajero);
        btnAtras = findViewById(R.id.btnAtras);
        edt1=findViewById(R.id.txtNumero);
        txtResultado = findViewById(R.id.txtResultado);
        txtResultado.setText("Cantidad : "+cantidad);
    }

    public void retroceder (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void depositar(View v){
    double aumento = Double.parseDouble(edt1.getText().toString());
    cantidad = cantidad + aumento;
    txtResultado.setText("Cantidad : "+cantidad);
    }

    public void retirar(View v){
        double retiro = Double.parseDouble(edt1.getText().toString());
        cantidad = cantidad - retiro;
        txtResultado.setText("Cantidad : "+cantidad);
    }
}
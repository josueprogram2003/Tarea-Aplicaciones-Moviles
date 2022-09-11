package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Calculadora extends AppCompatActivity {
    private double resultado;
    private EditText txt1, txt2;
    private Button btnAtras;
    private TextView r;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculadora);
        btnAtras = findViewById(R.id.btnAtras);
        txt1 = findViewById(R.id.txtn1);
        txt2 = findViewById(R.id.txtn2);
        r = findViewById(R.id.textView4);
    }
    public void retroceder (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void sumar(View v){
        double n1,n2;
        n1=Double.parseDouble(txt1.getText().toString());
        n2=Double.parseDouble(txt2.getText().toString());
        resultado=n1+n2;
        r.setText("El resultado es: "+ resultado);
    }

    public void restar(View v){
        double n1,n2;
        n1=Double.parseDouble(txt1.getText().toString());
        n2=Double.parseDouble(txt2.getText().toString());
        resultado=n1-n2;
        r.setText("El resultado es: "+ resultado);
    }

    public void multiplicar(View v){
        double n1,n2;
        n1=Double.parseDouble(txt1.getText().toString());
        n2=Double.parseDouble(txt2.getText().toString());
        resultado=n1*n2;
        r.setText("El resultado es: "+ resultado);
    }

    public void division(View v){
        double n1,n2;
        n1=Double.parseDouble(txt1.getText().toString());
        n2=Double.parseDouble(txt2.getText().toString());
        resultado=n1/n2;
        r.setText("El resultado es: "+ resultado);
    }

}
package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button btn1,btn2,btn3,btn4;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
    }

    public void CargarFactorial(View view) {
        Intent intent = new Intent(this, Factorial.class);
        startActivity(intent);
    }

    public void CargarPromedio(View view) {
        Intent intent = new Intent(this, Promedio.class);
        startActivity(intent);
    }

    public void CargarCalculadora(View view) {
        Intent intent = new Intent(this, Calculadora.class);
        startActivity(intent);
    }


    public void CargarCajero(View view) {
        Intent intent = new Intent(this, Cajero.class);
        startActivity(intent);
    }

}
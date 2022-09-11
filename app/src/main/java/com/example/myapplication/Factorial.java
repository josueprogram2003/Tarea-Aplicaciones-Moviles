package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class Factorial extends AppCompatActivity {
    private EditText txtn;
    private TextView txtResultado;
    private Button btnAtras, btnFactorial;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_factorial);
        btnAtras = findViewById(R.id.btnAtras);
        btnFactorial = findViewById(R.id.btnFactorial);
        txtn =findViewById(R.id.txtn);
        txtResultado = findViewById(R.id.txtResultado);
    }



    public void retroceder (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void factorial(View v){
        int numero = Integer.parseInt(txtn.getText().toString());
        int valor=1;
        for (int i = 1; i <= numero ; i++) {
            valor = valor*i;
        }
        txtResultado.setText("EL FACTORIAL ES: " +valor);
    }
}
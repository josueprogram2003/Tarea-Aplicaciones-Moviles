package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.Arrays;

public class Promedio extends AppCompatActivity {
    private Button btnAtras,btnpromedio;
    private EditText txtn;
    private TextView txtresultado;
    private double array[] = new double [10];
    private int cont=0;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_promedio);
        btnAtras = findViewById(R.id.btnAtras);
        btnpromedio = findViewById(R.id.btnpromedio);
        txtn = findViewById(R.id.editTextNumber);
        txtresultado = findViewById(R.id.txtResultado);

    }

    public void retroceder (View view){
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }

    public void sacarPromedio (View view){
        int numero = Integer.parseInt(txtn.getText().toString());
        array[cont]=numero;
        if(cont == 9 ){
            double resultado = 0;
            for (int i = 0; i <= array.length; i++) {
                if (i == array.length) {
                    txtresultado.setText("El Promedio  es: " + resultado/array.length);
                    Toast.makeText(getApplicationContext(),"El resultado es: " + resultado, Toast.LENGTH_LONG).show();
                }else{
                    resultado = resultado + array[i];
                }
            }

        }else{
            cont++;
        }
    }

}
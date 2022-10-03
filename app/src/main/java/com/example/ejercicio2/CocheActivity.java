package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;

public class CocheActivity extends AppCompatActivity {

    private Button btnCancelar;
    private Button btnCrear;
    private EditText txtMarca;
    private EditText txtModelo;
    private EditText txtColor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_coche);

        inicializarVariables();
    }

    private void inicializarVariables() {
        btnCancelar = findViewById(R.id.btnCancelarCoche);
        btnCrear = findViewById(R.id.btnCrearCoche);
        txtMarca = findViewById(R.id.txtMarcaCoche);
        txtModelo = findViewById(R.id.txtModeloCoche);
        txtColor =findViewById(R.id.txtColorCoche);
    }

}
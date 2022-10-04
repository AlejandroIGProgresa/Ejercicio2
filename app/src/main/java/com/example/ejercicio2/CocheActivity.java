package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejercicio2.modelos.Coche;

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

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent();
                Coche coche = new Coche(txtMarca.getText().toString(), txtModelo.getText().toString(), txtColor.getText().toString());
                bundle.putSerializable("COCHE", coche);
                intent.putExtras(bundle);
                setResult(RESULT_OK, intent);
                finish();

            }
        });

        btnCancelar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                finish();
            }
        });
    }

    private void inicializarVariables() {
        btnCancelar = findViewById(R.id.btnCancelarCoche);
        btnCrear = findViewById(R.id.btnCrearCoche);
        txtMarca = findViewById(R.id.txtMarcaCoche);
        txtModelo = findViewById(R.id.txtModeloCoche);
        txtColor = findViewById(R.id.txtColorCoche);
    }

}
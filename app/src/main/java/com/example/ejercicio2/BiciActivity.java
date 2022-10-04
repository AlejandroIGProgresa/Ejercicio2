package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejercicio2.modelos.Bici;
import com.example.ejercicio2.modelos.Coche;

public class BiciActivity extends AppCompatActivity {

    private Button btnCancelar;
    private Button btnCrear;
    private EditText txtMarca;
    private EditText txtPulgadas;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bici);

        inicializarVariables();



        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent();
                Bici bici = new Bici(txtMarca.getText().toString(), Integer.parseInt(txtPulgadas.getText().toString()));
                bundle.putSerializable("BICI", bici);
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
        btnCancelar = findViewById(R.id.btnCancelarBici);
        btnCrear = findViewById(R.id.btnCrearBici);
        txtMarca = findViewById(R.id.txtMarcaBici);
        txtPulgadas = findViewById(R.id.txtPulgadasBici);
    }
}
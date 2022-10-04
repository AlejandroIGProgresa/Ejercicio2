package com.example.ejercicio2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.example.ejercicio2.modelos.Coche;
import com.example.ejercicio2.modelos.Moto;

public class MotoActivity extends AppCompatActivity {

    private Button btnCancelar;
    private Button btnCrear;
    private EditText txtMarca;
    private EditText txtModelo;
    private EditText txtCc;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_moto);

        inicializarVariables();

        btnCrear.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Bundle bundle = new Bundle();
                Intent intent = new Intent();
                Moto moto = new Moto(txtMarca.getText().toString(), txtModelo.getText().toString(), Integer.parseInt(txtCc.getText().toString()));
                bundle.putSerializable("MOTO", moto);
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
        btnCancelar = findViewById(R.id.btnCancelarMoto);
        btnCrear = findViewById(R.id.btnCrearMoto);
        txtMarca = findViewById(R.id.txtMarcaMoto);
        txtModelo = findViewById(R.id.txtModeloMoto);
        txtCc = findViewById(R.id.txtCcMoto);
    }


}
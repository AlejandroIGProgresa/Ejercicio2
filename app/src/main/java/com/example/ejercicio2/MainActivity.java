package com.example.ejercicio2;

import androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.example.ejercicio2.modelos.Bici;
import com.example.ejercicio2.modelos.Coche;
import com.example.ejercicio2.modelos.Moto;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button btnCoches;
    private Button btnMotos;
    private Button btnBicis;
    private TextView lblCoches;
    private TextView lblMotos;
    private TextView lblBicis;

    private int cochesCont;
    private int motosCont;
    private int bicisCont;

    private ActivityResultLauncher<Intent> launcherCoches;
    private ActivityResultLauncher<Intent> launcherMotos;
    private ActivityResultLauncher<Intent> launcherBicis;


    private static ArrayList<Coche> coches = new ArrayList<>();
    private static ArrayList<Moto> motos = new ArrayList<>();
    private static ArrayList<Bici> bicis = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        inicializarVariables();
        inicializarLaunchers();

        lblCoches.setText("Número de coches: " + coches.size());
        lblMotos.setText("Número de motos: " + motos.size());
        lblBicis.setText("Número de bicis: " + bicis.size());

        btnCoches.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, CocheActivity.class);
                launcherCoches.launch(i);
            }
        });

        btnMotos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, MotoActivity.class);
                launcherMotos.launch(i);
            }
        });

        btnBicis.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, BiciActivity.class);
                launcherBicis.launch(i);
            }
        });
    }

    private void inicializarLaunchers() {
        launcherCoches = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {

                    }
                }
        );


        launcherMotos = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {

                    }
                }
        );


        launcherBicis = registerForActivityResult(
                new ActivityResultContracts.StartActivityForResult(),
                new ActivityResultCallback<ActivityResult>() {
                    @Override
                    public void onActivityResult(ActivityResult result) {

                    }
                }
        );
    }

    private void inicializarVariables() {
        btnBicis = findViewById(R.id.btnBicisMain);
        btnCoches = findViewById(R.id.btnCochesMain);
        btnMotos = findViewById(R.id.btnMotosMain);
        lblBicis = findViewById(R.id.lblBicisText);
        lblCoches = findViewById(R.id.lblCochesMain);
        lblMotos = findViewById(R.id.lblMotosMain);
    }




}
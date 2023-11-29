package com.example.tabuadaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button botaoFacil;
    private Button botaoMedio;
    private Button botaoDificil;
    private Button botaoGenio;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        botaoFacil = findViewById(R.id.button);
        botaoMedio = findViewById(R.id.button2);
        botaoDificil = findViewById(R.id.button3);
        botaoGenio = findViewById(R.id.button4);

        botaoFacil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navegarParaCalculo(1);
            }
        });
        botaoMedio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navegarParaCalculo(2);
            }
        });
        botaoDificil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navegarParaCalculo(3);
            }
        });
        botaoGenio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                navegarParaCalculo(4);
            }
        });
    }
        private void navegarParaCalculo(int dificuldade){
            Intent Intent = new Intent(MainActivity.this, calculo.class);
            Intent.putExtra("dificuldade", dificuldade);
            startActivity(Intent);
        }
}

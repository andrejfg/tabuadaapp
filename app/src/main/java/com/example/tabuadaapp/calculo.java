package com.example.tabuadaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class calculo extends AppCompatActivity {

    private Button botaoResultado;
    private Calcular calcular;
    private TextView operacao;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_calculo);

        Intent intent = getIntent();

        int dificuldade = intent.getIntExtra("dificuldade", 0);
        calcular = new Calcular(dificuldade);

        operacao = findViewById(R.id.textView4);
        operacao.setText(calcular.toString());

        botaoResultado = findViewById(R.id.button5);

        botaoResultado.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                TextInputEditText resultado = findViewById(R.id.resultado);
                int resultado_valor = Integer.parseInt(String.valueOf(resultado.getText()));
                int correto_valor = calcular.getResultado();
                Intent Intent = new Intent(calculo.this, resultado.class);
                Intent.putExtra("resultado", resultado_valor);
                Intent.putExtra("correto", correto_valor);
                Intent.putExtra("dificuldade", dificuldade);
                startActivity(Intent);
            }
        });


    }
}
package com.example.tabuadaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.google.android.material.textfield.TextInputEditText;

public class resultado extends AppCompatActivity {

    private Button jogarNovamente;
    private Button voltarAoInicio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_resultado);

        Intent intent = getIntent();

        int correto = intent.getIntExtra("correto", 0);
        int resultado = intent.getIntExtra("resultado", 0);
        int dificuldade = intent.getIntExtra("dificuldade", 0);

        TextView correto_text = findViewById(R.id.textView6);
        correto_text.setText(String.valueOf(correto));
        TextView resultado_text = findViewById(R.id.textView7);
        resultado_text.setText(String.valueOf(resultado));

        if (correto == resultado){
            int pontuacao = Pontuacao.getInstance().getValorCompartilhado();
            Pontuacao.getInstance().setValorCompartilhado(pontuacao + dificuldade);
        }

        TextView pontuacao_text = findViewById(R.id.textView10);
        pontuacao_text.setText(String.valueOf(Pontuacao.getInstance().getValorCompartilhado()));

        jogarNovamente = findViewById(R.id.button6);
        voltarAoInicio = findViewById(R.id.button7);

        jogarNovamente.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(resultado.this, calculo.class);
                Intent.putExtra("dificuldade", dificuldade);
                startActivity(Intent);
            }
        });

        voltarAoInicio.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent Intent = new Intent(resultado.this, MainActivity.class);
                startActivity(Intent);
            }
        });

    }
}
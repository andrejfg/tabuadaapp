package com.example.tabuadaapp;

public class Pontuacao {
    private static Pontuacao instance;
    private int valorCompartilhado;

    private Pontuacao() {
        // Inicialize os valores padrão, se necessário
        valorCompartilhado = 0;
    }

    public static synchronized Pontuacao getInstance() {
        if (instance == null) {
            instance = new Pontuacao();
        }
        return instance;
    }

    public int getValorCompartilhado() {
        return valorCompartilhado;
    }

    public void setValorCompartilhado(int novoValor) {
        valorCompartilhado = novoValor;
    }
}

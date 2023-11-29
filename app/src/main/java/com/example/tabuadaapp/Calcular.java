package com.example.tabuadaapp;

import java.util.Random;
public class Calcular {
    private int dificuldade;
    private int valor1;
    private int valor2;
    private int operacao;
    private int resultado;

    public Calcular(int dificuldade) {

        Random rand = new Random();

        this.operacao = rand.nextInt(3); // 0 = somar, 1 =  diminuir, 2 = multiplicar
        this.dificuldade = dificuldade;

        this.valor1 = rand.nextInt((int) Math.pow(10, dificuldade)); //gera um valor entre 0 e 9
        this.valor2 = rand.nextInt((int) Math.pow(10, dificuldade));
        switch (this.operacao){
            case 0:
                this.resultado = this.getValor1() + this.getValor2();
                break;
            case 1:
                this.resultado = this.getValor1() - this.getValor2();
                break;
            case 2:
                this.resultado = this.getValor1() * this.getValor2();
                break;
        }
    }


    public int getDificuldade() {
        return dificuldade;
    }

    public int getValor1() {
        return valor1;
    }

    public int getValor2() {
        return valor2;
    }

    public int getOperacao() {
        return operacao;
    }

    public int getResultado() {
        return resultado;
    }

    public String toString(){
        String op;
        switch (this.getOperacao()){
            case 0:
                op = " + ";
                break;
            case 1:
                op = " - ";
                break;
            case 2:
                op = " x ";
                break;
            default:
                op = "erro";
        }
        return this.getValor1() + op + this.getValor2();

    }

    public boolean calcular(int resposta){
        boolean resultadoDaResposta = getResultado() == resposta;

        if(resultadoDaResposta){
            System.out.println("Resposta correta");
        }else{
            System.out.println("Respota errada");
        }

        return resultadoDaResposta;
    }
}

package com.example.mariano.din.modelo;

public class Versiculo {
    private int numero;
    private String textoes;
    private String textoar;

    public Versiculo(int numero, String textoes, String textoar) {
        this.numero = numero;
        this.textoes = textoes;
        this.textoar = textoar;
    }



    public Versiculo(String textoes) {
        this.textoes = textoes;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getTextoes() {
        return textoes;
    }

    public void setTextoes(String textoes) {
        this.textoes = textoes;
    }

    public String getTextoar() { return textoar; }

    public void setTextoar(String textoar) { this.textoar = textoar; }
}

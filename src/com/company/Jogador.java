package com.company;

public class Jogador {

    // Atributos
    private String nome;
    private int cardA;
    private int cardV;
    private boolean expulso;

    // Métodos Públicos
    public void receberCardA(int cardA) {
        this.setCardA(this.getCardA() + 1);
    }

    public void receberCardV() {
        this.setCardV(this.getCardV() + 1);
        expulso = true;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getCardA() {
        return cardA;
    }

    public void setCardA(int cardA) {
        cardA = cardA;
    }

    public int getCardV() {
        return cardV;
    }

    public void setCardV(int cardV) {
        cardV = cardV;
    }

    public boolean isExpulso() {
        return expulso;
    }

    public void setExpulso(boolean expulso) {
        this.expulso = expulso;
    }
}

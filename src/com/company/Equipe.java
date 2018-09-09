package com.company;

public class Equipe {
    // Atributos
    private String nome;
    private String chave;
    private int vitorias;
    private int empates;
    private int derrotas;
    private int golsP;
    private int golsC;
    private int golsS;
    private int pts;
    private int overall;

    // Métodos Públicos
    public void status() {
        System.out.println(this.getNome());
        System.out.println("W: " + this.getVitorias());
        System.out.println("D: " + this.getEmpates());
        System.out.println("L: " + this.getDerrotas());
        System.out.println("GF: " + this.getGolsP());
        System.out.println("GA: " + this.getGolsC());
        System.out.println("GD: " + this.getGolsS());
        System.out.println("PTS: " + this.getPts());
    }
    public void ganharJogo() {
        this.setVitorias(this.getVitorias() + 1);
        this.setPts(this.getPts() + 3);
    }
    public void empatarJogo() {
        this.setEmpates(this.getEmpates() + 1);
        this.setPts(this.getPts() + 1);
    }
    public void perderJogo() {
        this.setDerrotas(this.getDerrotas() + 1);
    }

    public Equipe(String nome, String chave,int vitorias, int empates, int derrotas, int golsP, int golsC, int pts, int overall) {
        this.nome = nome;
        this.chave = chave;
        this.vitorias = vitorias;
        this.empates = empates;
        this.derrotas = derrotas;
        this.golsP = golsP;
        this.golsC = golsC;
        this.golsS = golsP - golsC;
        this.overall = overall;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public int getVitorias() {
        return vitorias;
    }

    public void setVitorias(int vitorias) {
        this.vitorias = vitorias;
    }

    public int getEmpates() {
        return empates;
    }

    public void setEmpates(int empates) {
        this.empates = empates;
    }

    public int getDerrotas() {
        return derrotas;
    }

    public void setDerrotas(int derrotas) {
        this.derrotas = derrotas;
    }

    public int getGolsP() {
        return golsP;
    }

    public void setGolsP(int golsP) {
        this.golsP = golsP;
    }

    public int getGolsC() {
        return golsC;
    }

    public void setGolsC(int golsC) {
        this.golsC = golsC;
    }

    public int getGolsS() {
        return golsS;
    }

    public void setGolsS(int golsS) {
        this.golsS = golsS;
    }

    public int getPts() {
        return pts;
    }

    public void setPts(int pts) {
        this.pts = pts;
    }

    public int getOverall() {
        return overall;
    }

    public void setOverall(int overall) {
        this.overall = overall;
    }
}


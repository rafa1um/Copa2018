package com.company;

import java.util.Random;

public class Partida {

    private int placar1 = 0;
    private int placar2 = 0;
    private int prorroga1 = -1;
    private int prorroga2 = -1;
    private int penalti1 = 0;
    private int penalti2 = 0;
    private Equipe equipe1;
    private Equipe equipe2;
    private static int indice;

    public void partidaSimples(Equipe time1, Equipe time2) {
        this.equipe1 = time1;
        this.equipe2 = time2;
        try {

            if (!(this.equipe1.getChave().equals(this.equipe2.getChave()) && this.equipe1 != this.equipe2)) {
                throw new IllegalArgumentException("Partida inválida na fase de grupos!");
            }

            // System.out.println("Prorrogação : " + this.equipe1.getNome() + " Vs. " + this.equipe2.getNome());

            /* --------- Randomização do time vencedor de acordo com seu overall ---------- */

            Random aleatorio = new Random();
            for (int i = 0; i < 90; i++) {
                int g1 = aleatorio.nextInt(this.equipe1.getOverall() / 10);
                int g2 = aleatorio.nextInt(this.equipe2.getOverall() / 10);
                if (g1 < g2) {
                    g1 = aleatorio.nextInt(this.equipe1.getOverall() / 10);
                    g2 = aleatorio.nextInt(this.equipe1.getOverall() / 10) + 6;
                    if (g1 == g2) {
                        this.placar2 = this.placar2 + 1;
                        this.equipe2.setGolsP(this.equipe2.getGolsP() + 1);
                        this.equipe1.setGolsC(this.equipe1.getGolsC() - 1);
                    }
                } else if (g1 > g2) {
                    g1 = aleatorio.nextInt(this.equipe1.getOverall() / 10) + 6;
                    g2 = aleatorio.nextInt(this.equipe1.getOverall() / 10);
                    if (g1 == g2) {
                        this.placar1 = this.placar1 + 1;
                        this.equipe1.setGolsP(this.equipe1.getGolsP() + 1);
                        this.equipe2.setGolsC(this.equipe2.getGolsC() - 1);
                    }
                }
            }

            /* -------------------- Fim random --------------------*/

           // System.out.println(this.equipe1.getNome() + " | " + this.placar1 + " X " + this.placar2 + " | " + this.equipe2.getNome());

            if (this.placar1 > this.placar2) {
                this.equipe1.setPts(this.equipe1.getPts() + 3);
                this.equipe1.setVitorias(this.equipe1.getVitorias() + 1);
                this.equipe2.setDerrotas(this.equipe2.getDerrotas() + 1);
            } else if (this.placar1 < this.placar2) {
                this.equipe1.setPts(this.equipe2.getPts() + 3);
                this.equipe2.setVitorias(this.equipe2.getVitorias() + 1);
                this.equipe1.setDerrotas(this.equipe1.getDerrotas() + 1);
            } else {
                this.equipe1.setPts(this.equipe1.getPts() + 1);
                this.equipe2.setPts(this.equipe2.getPts() + 1);
                this.equipe1.setEmpates(this.equipe1.getEmpates() + 1);
                this.equipe2.setEmpates(this.equipe2.getEmpates() + 1);
            }
            this.equipe1.setGolsS(this.equipe1.getGolsP() - this.equipe1.getGolsC());
            this.equipe2.setGolsS(this.equipe2.getGolsP() - this.equipe2.getGolsC());

        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }

    }

    public void partidaCompleta(Equipe time1, Equipe time2) {
        this.equipe1 = time1;
        this.equipe2 = time2;
        try {

            if (!(this.equipe1.getChave().equals(this.equipe2.getChave()) && this.equipe1 != this.equipe2)) {
                throw new IllegalArgumentException("Partida inválida na fase de grupos!");
            }

           // System.out.println(this.equipe1.getNome() + " Vs. " + this.equipe2.getNome());

            /* --------- Randomização do time vencedor de acordo com seu overall ---------- */

            Random aleatorio = new Random();
            for (int i = 0; i < 90; i++) {
                int g1 = aleatorio.nextInt(this.equipe1.getOverall() / 10);
                int g2 = aleatorio.nextInt(this.equipe2.getOverall() / 10);
                if (g1 < g2) {
                    g1 = aleatorio.nextInt(this.equipe1.getOverall() / 10);
                    g2 = aleatorio.nextInt(this.equipe1.getOverall() / 10) + 6;
                    if (g1 == g2) {
                        this.placar2 = this.placar2 + 1;
                        this.equipe2.setGolsP(this.equipe2.getGolsP() + 1);
                        this.equipe1.setGolsC(this.equipe1.getGolsC() - 1);
                    }
                } else if (g1 > g2) {
                    g1 = aleatorio.nextInt(this.equipe1.getOverall() / 10) + 6;
                    g2 = aleatorio.nextInt(this.equipe1.getOverall() / 10);
                    if (g1 == g2) {
                        this.placar1 = this.placar1 + 1;
                        this.equipe1.setGolsP(this.equipe1.getGolsP() + 1);
                        this.equipe2.setGolsC(this.equipe2.getGolsC() - 1);
                    }
                }
            }

            /* -------------------- Fim random --------------------*/

//            System.out.println(this.equipe1.getNome() + " | " + this.placar1 + " X " + this.placar2 + " | " + this.equipe2.getNome());

            if (this.placar1 > this.placar2) {
                System.out.println(this.equipe1.getNome() + " Ganhou!!\n");
            } else if (this.placar1 < this.placar2) {
                System.out.println(this.equipe2.getNome() + " Ganhou!!\n");
            } else {
                System.out.println("Empate!!");
                partidaProrrogada();
            }
            this.equipe1.setGolsS(this.equipe1.getGolsP() - this.equipe1.getGolsC());
            this.equipe2.setGolsS(this.equipe2.getGolsP() - this.equipe2.getGolsC());

        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }

    }


    public void partidaProrrogada() {
        this.prorroga1 = 0;
        this.prorroga2 = 0;
        try {

            if (!(this.equipe1.getChave().equals(this.equipe2.getChave()) && this.equipe1 != this.equipe2)) {
                throw new IllegalArgumentException("Partida inválida na fase de grupos!");
            }

           // System.out.println("Prorrogação : " + this.equipe1.getNome() + " Vs. " + this.equipe2.getNome());

            /* --------- Randomização do time vencedor de acordo com seu overall ---------- */

            Random aleatorio = new Random();
            for (int i = 0; i < 30; i++) {
                int g1 = aleatorio.nextInt(this.equipe1.getOverall() / 10);
                int g2 = aleatorio.nextInt(this.equipe2.getOverall() / 10);
                if (g1 < g2) {
                    g1 = aleatorio.nextInt(this.equipe1.getOverall() / 10);
                    g2 = aleatorio.nextInt(this.equipe1.getOverall() / 10) + 6;
                    if (g1 == g2) {
                        this.prorroga2 = this.prorroga2 + 1;
                        this.equipe2.setGolsP(this.equipe2.getGolsP() + 1);
                        this.equipe1.setGolsC(this.equipe1.getGolsC() - 1);
                    }
                } else if (g1 > g2) {
                    g1 = aleatorio.nextInt(this.equipe1.getOverall() / 10) + 6;
                    g2 = aleatorio.nextInt(this.equipe1.getOverall() / 10);
                    if (g1 == g2) {
                        this.prorroga1 = this.prorroga1 + 1;
                        this.equipe1.setGolsP(this.equipe1.getGolsP() + 1);
                        this.equipe2.setGolsC(this.equipe2.getGolsC() - 1);
                    }
                }
            }

            /* -------------------- Fim random --------------------*/

//            System.out.println(this.equipe1.getNome() + " | " + this.prorroga1 + " X " + this.prorroga2 + " | " + this.equipe2.getNome());

            if (this.prorroga1 > this.prorroga2) {
                System.out.println(this.equipe1.getNome() + " Ganhou!!\n");
            } else if (this.prorroga1 < this.prorroga2) {
                System.out.println(this.equipe2.getNome() + " Ganhou!!\n");
            } else {
                disputaPenaltis();
            }
            this.equipe1.setGolsS(this.equipe1.getGolsP() - this.equipe1.getGolsC());
            this.equipe2.setGolsS(this.equipe2.getGolsP() - this.equipe2.getGolsC());

        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }

    }

    public void disputaPenaltis() {

        try {

            if (!(this.equipe1.getChave().equals(this.equipe2.getChave()) && this.equipe1 != this.equipe2)) {
                throw new IllegalArgumentException("Partida inválida na fase de grupos!");
            }

           // System.out.println("Disputa por penaltis : " + this.equipe1.getNome() + " Vs. " + this.equipe2.getNome());

            /* --------- Randomização do time vencedor de acordo com seu overall ---------- */

            Random aleatorio = new Random();
            int g1 = aleatorio.nextInt(5);
            int g2 = aleatorio.nextInt(5);
            if (g1 != g2) {
                this.penalti1 = g1;
                this.penalti2 = g2;
            } else {
                while (this.penalti1 == this.penalti2){
                    g1 = aleatorio.nextInt(2);
                    g2 = aleatorio.nextInt(2);
                    this.penalti1 = this.penalti1 + g1;
                    this.penalti2 = this.penalti2 + g2;
                }
            }


            /* -------------------- Fim random --------------------*/

       //     System.out.println(this.equipe1.getNome() + " | " + this.penalti1 + " X " + this.penalti2 + " | " + this.equipe2.getNome());

        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }

    }

    public Equipe getEquipe1() {
        return equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public int getProrroga1() {
        return prorroga1;
    }

    public void setProrroga1(int prorroga1) {
        this.prorroga1 = prorroga1;
    }

    public int getProrroga2() {
        return prorroga2;
    }

    public void setProrroga2(int prorroga2) {
        this.prorroga2 = prorroga2;
    }

    public int getPlacar1() {
        return placar1;
    }

    public void setPlacar1(int placar1) {
        this.placar1 = placar1;
    }

    public int getPlacar2() {
        return placar2;
    }

    public void setPlacar2(int placar2) {
        this.placar2 = placar2;
    }

    public int getIndice() {
        return indice;
    }

    public void setIndice(int ind) {
        indice = ind;
    }

    public int getPenalti1() {
        return penalti1;
    }

    public void setPenalti1(int penalti1) {
        this.penalti1 = penalti1;
    }

    public int getPenalti2() {
        return penalti2;
    }

    public void setPenalti2(int penalti2) {
        this.penalti2 = penalti2;
    }

}


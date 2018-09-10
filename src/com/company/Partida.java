package com.company;

import java.util.Random;

public class Partida {

    private int placar1 = 0;
    private int placar2 = 0;
    private int penalti1 = 0;
    private int penalti2 = 0;
    private static int indice;

    public void partidaSimples(Equipe equipe1, Equipe equipe2) {

        try {

            if (!(equipe1.getChave().equals(equipe2.getChave()) && equipe1 != equipe2)) {
                throw new IllegalArgumentException("Partida inválida na fase de grupos!");
            }

            System.out.println(equipe1.getNome() + " Vs. " + equipe2.getNome());

            /* --------- Randomização do time vencedor de acordo com seu overall ---------- */

            Random aleatorio = new Random();
            for (int i = 0; i < 90; i++) {
                int g1 = aleatorio.nextInt(equipe1.getOverall() / 10);
                int g2 = aleatorio.nextInt(equipe2.getOverall() / 10);
                if (g1 < g2) {
                    g1 = aleatorio.nextInt(equipe1.getOverall() / 10);
                    g2 = aleatorio.nextInt(equipe1.getOverall() / 10) + 6;
                    if (g1 == g2) {
                        this.placar2 = this.placar2 + 1;
                        equipe2.setGolsP(equipe2.getGolsP() + 1);
                        equipe1.setGolsC(equipe1.getGolsC() - 1);
                    }
                } else if (g1 > g2) {
                    g1 = aleatorio.nextInt(equipe1.getOverall() / 10) + 6;
                    g2 = aleatorio.nextInt(equipe1.getOverall() / 10);
                    if (g1 == g2) {
                        this.placar1 = this.placar1 + 1;
                        equipe1.setGolsP(equipe1.getGolsP() + 1);
                        equipe2.setGolsC(equipe2.getGolsC() - 1);
                    }
                }
            }

            /* -------------------- Fim random --------------------*/

            System.out.println(equipe1.getNome() + " | " + this.placar1 + " X " + this.placar2 + " | " + equipe2.getNome());

            if (this.placar1 > this.placar2) {
                System.out.println(equipe1.getNome() + " Ganhou!!\n");
                equipe1.setPts(equipe1.getPts() + 3);
                equipe1.setVitorias(equipe1.getVitorias() + 1);
                equipe2.setDerrotas(equipe2.getDerrotas() + 1);
            } else if (this.placar1 < this.placar2) {
                System.out.println(equipe2.getNome() + " Ganhou!!\n");
                equipe1.setPts(equipe2.getPts() + 3);
                equipe2.setVitorias(equipe2.getVitorias() + 1);
                equipe1.setDerrotas(equipe1.getDerrotas() + 1);
            } else {
                System.out.println("Empate!!\n");
                equipe1.setPts(equipe1.getPts() + 1);
                equipe2.setPts(equipe2.getPts() + 1);
                equipe1.setEmpates(equipe1.getEmpates() + 1);
                equipe2.setEmpates(equipe2.getEmpates() + 1);
            }
            equipe1.setGolsS(equipe1.getGolsP() - equipe1.getGolsC());
            equipe2.setGolsS(equipe2.getGolsP() - equipe2.getGolsC());

        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }

    }

    public void partidaCompleta(Equipe equipe1, Equipe equipe2) {

        try {

            if (!(equipe1.getChave().equals(equipe2.getChave()) && equipe1 != equipe2)) {
                throw new IllegalArgumentException("Partida inválida na fase de grupos!");
            }

            System.out.println(equipe1.getNome() + " Vs. " + equipe2.getNome());

            /* --------- Randomização do time vencedor de acordo com seu overall ---------- */

            Random aleatorio = new Random();
            for (int i = 0; i < 90; i++) {
                int g1 = aleatorio.nextInt(equipe1.getOverall() / 10);
                int g2 = aleatorio.nextInt(equipe2.getOverall() / 10);
                if (g1 < g2) {
                    g1 = aleatorio.nextInt(equipe1.getOverall() / 10);
                    g2 = aleatorio.nextInt(equipe1.getOverall() / 10) + 6;
                    if (g1 == g2) {
                        this.placar2 = this.placar2 + 1;
                        equipe2.setGolsP(equipe2.getGolsP() + 1);
                        equipe1.setGolsC(equipe1.getGolsC() - 1);
                    }
                } else if (g1 > g2) {
                    g1 = aleatorio.nextInt(equipe1.getOverall() / 10) + 6;
                    g2 = aleatorio.nextInt(equipe1.getOverall() / 10);
                    if (g1 == g2) {
                        this.placar1 = this.placar1 + 1;
                        equipe1.setGolsP(equipe1.getGolsP() + 1);
                        equipe2.setGolsC(equipe2.getGolsC() - 1);
                    }
                }
            }

            /* -------------------- Fim random --------------------*/

            System.out.println(equipe1.getNome() + " | " + this.placar1 + " X " + this.placar2 + " | " + equipe2.getNome());

            if (this.placar1 > this.placar2) {
                System.out.println(equipe1.getNome() + " Ganhou!!\n");
            } else if (this.placar1 < this.placar2) {
                System.out.println(equipe2.getNome() + " Ganhou!!\n");
            } else {
                System.out.println("Empate!!");
                partidaProrrogada(equipe1, equipe2);
            }
            equipe1.setGolsS(equipe1.getGolsP() - equipe1.getGolsC());
            equipe2.setGolsS(equipe2.getGolsP() - equipe2.getGolsC());

        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }

    }


    public void partidaProrrogada(Equipe equipe1, Equipe equipe2) {

        try {

            if (!(equipe1.getChave().equals(equipe2.getChave()) && equipe1 != equipe2)) {
                throw new IllegalArgumentException("Partida inválida na fase de grupos!");
            }

            System.out.println("Prorrogação : " + equipe1.getNome() + " Vs. " + equipe2.getNome());

            /* --------- Randomização do time vencedor de acordo com seu overall ---------- */

            Random aleatorio = new Random();
            for (int i = 0; i < 30; i++) {
                int g1 = aleatorio.nextInt(equipe1.getOverall() / 10);
                int g2 = aleatorio.nextInt(equipe2.getOverall() / 10);
                if (g1 < g2) {
                    g1 = aleatorio.nextInt(equipe1.getOverall() / 10);
                    g2 = aleatorio.nextInt(equipe1.getOverall() / 10) + 6;
                    if (g1 == g2) {
                        this.placar2 = this.placar2 + 1;
                        equipe2.setGolsP(equipe2.getGolsP() + 1);
                        equipe1.setGolsC(equipe1.getGolsC() - 1);
                    }
                } else if (g1 > g2) {
                    g1 = aleatorio.nextInt(equipe1.getOverall() / 10) + 6;
                    g2 = aleatorio.nextInt(equipe1.getOverall() / 10);
                    if (g1 == g2) {
                        this.placar1 = this.placar1 + 1;
                        equipe1.setGolsP(equipe1.getGolsP() + 1);
                        equipe2.setGolsC(equipe2.getGolsC() - 1);
                    }
                }
            }

            /* -------------------- Fim random --------------------*/

            System.out.println(equipe1.getNome() + " | " + this.placar1 + " X " + this.placar2 + " | " + equipe2.getNome());

            if (this.placar1 > this.placar2) {
                System.out.println(equipe1.getNome() + " Ganhou!!\n");
            } else if (this.placar1 < this.placar2) {
                System.out.println(equipe2.getNome() + " Ganhou!!\n");
            } else {
                disputaPenaltis(equipe1, equipe2);
            }
            equipe1.setGolsS(equipe1.getGolsP() - equipe1.getGolsC());
            equipe2.setGolsS(equipe2.getGolsP() - equipe2.getGolsC());

        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }

    }

    public void disputaPenaltis(Equipe equipe1, Equipe equipe2) {

        try {

            if (!(equipe1.getChave().equals(equipe2.getChave()) && equipe1 != equipe2)) {
                throw new IllegalArgumentException("Partida inválida na fase de grupos!");
            }

            System.out.println("Disputa por penaltis : " + equipe1.getNome() + " Vs. " + equipe2.getNome());

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

            System.out.println(equipe1.getNome() + " | " + this.penalti1 + " X " + this.penalti2 + " | " + equipe2.getNome());

            if (this.penalti1 > this.penalti2) {
                System.out.println(equipe1.getNome() + " Ganhou!!\n");
            } else {
                System.out.println(equipe2.getNome() + " Ganhou!!\n");
            }

        } catch (IllegalArgumentException erro) {
            System.out.println(erro.getMessage());
        }

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


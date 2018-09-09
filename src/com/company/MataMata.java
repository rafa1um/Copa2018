package com.company;

import java.util.Random;

public class MataMata extends FaseGrupo {

    private Equipe equipe1;
    private Equipe equipe2;
    private int placar1;
    private int placar2;

    public void mata_mata(Equipe equipe1, Equipe equipe2) {
        if(equipe1.getChave().equals(equipe2.getChave()) && equipe1 != equipe2) {
            this.equipe1 = equipe1;
            this.equipe2 = equipe2;
            System.out.println(this.equipe1.getNome() + " @ " + this.equipe2.getNome());

            /* --------- Randomização do time vencedor de acordo com seu overall ---------- */

            Random aleatorio = new Random();
            for (int i = 0; i < 90; i++) {
                int g1 = aleatorio.nextInt(this.equipe1.getOverall()/10);
                int g2 = aleatorio.nextInt(this.equipe2.getOverall()/10);

                if (g1 < g2) {
                    g1 = aleatorio.nextInt(26);
                    g2 = aleatorio.nextInt(20) + 6;
                    if (g1 == g2) {
                        this.placar2 = this.placar2 + 1;
                    }
                } else if (g1 > g2) {
                    g1 = aleatorio.nextInt(20) + 6;
                    g2 = aleatorio.nextInt(26);
                    if (g1 == g2) {
                        this.placar1 = this.placar1 + 1;
                    }
                }
            }

            /* -------------------- Fim random --------------------*/

            System.out.println(this.equipe1.getNome() + " " + this.placar1 + " @ " + this.placar2 + " " + this.equipe2.getNome());

            if(this.placar1 > this.placar2) {
                System.out.println(this.equipe1.getNome() + " Ganhou!!");
            } else if (this.placar1 < this.placar2){
                System.out.println(this.equipe2.getNome() + " Ganhou!!");
            } else {
                System.out.println("Empate!!");
                System.out.println("\nVAI TER PENALTI, FILHO DA PUTAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA!!!");
            }
        }
        else {
            System.out.println("Partida inválida!!");
        }
    }


    public Equipe getEquipe1() {
        return equipe1;
    }

    public void setEquipe1(Equipe equipe1) {
        this.equipe1 = equipe1;
    }

    public Equipe getEquipe2() {
        return equipe2;
    }

    public void setEquipe2(Equipe equipe2) {
        this.equipe2 = equipe2;
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
}

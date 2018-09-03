package com.company;

import java.util.Random;

public class FaseGrupo {
    // Atributos
    private Equipe equipe1;
    private Equipe equipe2;
    private int placar1;
    private int placar2;


    // Métodos Públicos

    public void fase_grupo(Equipe e1, Equipe e2) {
        if(e1.getChave().equals(e2.getChave()) && e1 != e2) {
            this.equipe1 = e1;
            this.equipe2 = e2;
            System.out.println(this.equipe1.getNome() + " @ " + this.equipe2.getNome());

            /* --------- Randomização do time vencedor de acordo com seu overall ---------- */

            Random aleatorio = new Random();
            int g1 = aleatorio.nextInt(7);
            int g2 = aleatorio.nextInt(7);
            if(g1 < g2) {
                g1 = aleatorio.nextInt(10);
                g2 = aleatorio.nextInt(4) + 6;
                if(g1 > g2) {
                    this.placar1 = this.placar1 + 1;
                } else {
                    this.placar2 = this.placar2 + 1;
                }
            }
            else if(g1 > g2) {
                g1 = aleatorio.nextInt(4) + 6;
                g2 = aleatorio.nextInt(10);
                if(g1 > g2) {
                    this.placar1 = this.placar1 + 1;
                } else {
                    this.placar2 = this.placar2 + 1;
                }
            } else {
                g2 = aleatorio.nextInt(4) + 6;
                g1 = aleatorio.nextInt(10);
                if(g1 < g2) {
                    this.placar1 = this.placar1 + 1;
                } else {
                    this.placar2 = this.placar2 + 1;
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

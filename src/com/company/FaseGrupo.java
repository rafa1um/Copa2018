package com.company;

import java.util.Random;

public class FaseGrupo implements Partida {

    private Equipe equipe1;
    private Equipe equipe2;
    private int placar1;
    private int placar2;

    public void fase_grupo (Equipe[] grupo1) {

        for (int j = 0; j < 2; j = j + 2) {

            try {

                if (!(grupo1[j].getChave().equals(grupo1[j+1].getChave()) && grupo1[j] != grupo1[j+1])) {
                    throw new IllegalArgumentException("Partida inválida na fase de grupos!");
                }

                this.equipe1 = grupo1[j];
                this.equipe2 = grupo1[j + 1];
                System.out.println(this.equipe1.getNome() + " @ " + this.equipe2.getNome());

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
                        }
                    } else if (g1 > g2) {
                        g1 = aleatorio.nextInt(this.equipe1.getOverall() / 10) + 6;
                        g2 = aleatorio.nextInt(this.equipe1.getOverall() / 10);
                        if (g1 == g2) {
                            this.placar1 = this.placar1 + 1;
                        }
                    }
                }

                /* -------------------- Fim random --------------------*/

                System.out.println(this.equipe1.getNome() + " " + this.placar1 + " @ " + this.placar2 + " " + this.equipe2.getNome());

                if(this.placar1 > this.placar2) {
                    System.out.println(this.equipe1.getNome() + " Ganhou!!");
                    this.equipe1.setPts(this.equipe1.getPts() + 3);
                } else if (this.placar1 < this.placar2){
                    System.out.println(this.equipe2.getNome() + " Ganhou!!");
                    this.equipe1.setPts(this.equipe2.getPts() + 3);
                } else {
                    System.out.println("Empate!!");
                    this.equipe1.setPts(this.equipe1.getPts() + 1);
                    this.equipe2.setPts(this.equipe2.getPts() + 1);
                }

            } catch (IllegalArgumentException erro) {
                System.out.println(erro.getMessage());
            }

        }

    }
}


package com.company;

import java.util.Random;

public final class Partida {

    protected static void partidaSimples(Equipe equipe1, Equipe equipe2) {

        int placar1 = 0;
        int placar2 = 0;

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
                        placar2 = placar2 + 1;
                        equipe2.setGolsP(equipe2.getGolsP() + 1);
                        equipe1.setGolsC(equipe1.getGolsC() - 1);
                    }
                } else if (g1 > g2) {
                    g1 = aleatorio.nextInt(equipe1.getOverall() / 10) + 6;
                    g2 = aleatorio.nextInt(equipe1.getOverall() / 10);
                    if (g1 == g2) {
                        placar1 = placar1 + 1;
                        equipe1.setGolsP(equipe1.getGolsP() + 1);
                        equipe2.setGolsC(equipe2.getGolsC() - 1);
                    }
                }
            }

            /* -------------------- Fim random --------------------*/

            System.out.println(equipe1.getNome() + " | " + placar1 + " X " + placar2 + " | " + equipe2.getNome());

            if (placar1 > placar2) {
                System.out.println(equipe1.getNome() + " Ganhou!!\n");
                equipe1.setPts(equipe1.getPts() + 3);
                equipe1.setVitorias(equipe1.getVitorias() + 1);
                equipe2.setDerrotas(equipe2.getDerrotas() + 1);
            } else if (placar1 < placar2) {
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

}

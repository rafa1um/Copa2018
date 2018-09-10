package com.company;


import java.util.LinkedList;

public class FaseGrupo {

    protected static void fase_grupo(Equipe[] grupo, int rodada, LinkedList<Partida> partidas) {

        Partida partida1 = new Partida();
        Partida partida2 = new Partida();

        System.out.println("Rodada " + rodada + " || Grupo " + grupo[0].getChave());

        switch (rodada) {
            case 1:
                partida1.partidaSimples(grupo[1], grupo[2]);
                partida2.partidaSimples(grupo[0], grupo[3]);
                partidas.addFirst(partida1);
                partidas.addFirst(partida2);
                break;
            case 2:
                partida1.partidaSimples(grupo[0], grupo[2]);
                partida2.partidaSimples(grupo[3], grupo[1]);
                partidas.addFirst(partida1);
                partidas.addFirst(partida2);
                break;
            case 3:
                partida1.partidaSimples(grupo[1], grupo[0]);
                partida2.partidaSimples(grupo[2], grupo[3]);
                partidas.addFirst(partida1);
                partidas.addFirst(partida2);
                break;
        }

    }

}


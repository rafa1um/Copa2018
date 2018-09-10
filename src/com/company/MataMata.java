package com.company;

public class MataMata extends FaseGrupo {

    protected static void mata_mata(Equipe[] grupo, int rodada) {

        Partida partida1 = new Partida();
        Partida partida2 = new Partida();

        switch (rodada) {
            case 1:
                partida1.partidaCompleta(grupo[1], grupo[2]);
                partida2.partidaCompleta(grupo[0], grupo[3]);
                break;
            case 2:
                partida1.partidaCompleta(grupo[0], grupo[2]);
                partida2.partidaCompleta(grupo[3], grupo[1]);
                break;
            case 3:
                partida1.partidaCompleta(grupo[1], grupo[0]);
                partida2.partidaCompleta(grupo[2], grupo[3]);
                break;
        }

    }
}

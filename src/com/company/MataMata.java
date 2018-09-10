package com.company;

import static com.company.Partida.partidaCompleta;
import static com.company.Partida.partidaSimples;

public class MataMata extends FaseGrupo {

    protected static void mata_mata(Equipe[] grupo, int rodada) {

        switch (rodada) {
            case 1:
                partidaCompleta(grupo[1], grupo[2]);
                partidaCompleta(grupo[0], grupo[3]);
                break;
            case 2:
                partidaCompleta(grupo[0], grupo[2]);
                partidaSimples(grupo[3], grupo[1]);
                break;
            case 3:
                partidaCompleta(grupo[1], grupo[0]);
                partidaCompleta(grupo[2], grupo[3]);
                break;
        }

    }
}

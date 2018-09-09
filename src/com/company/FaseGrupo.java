package com.company;

import java.util.Random;

import static com.company.Partida.partidaSimples;

public class FaseGrupo {

    public void fase_grupo(Equipe[] grupo, int rodada) {
        switch (rodada) {
            case 1:
                partidaSimples(grupo[1], grupo[2]);
                partidaSimples(grupo[0], grupo[3]);
                break;
            case 2:
                partidaSimples(grupo[0], grupo[2]);
                partidaSimples(grupo[3], grupo[1]);
                break;
            case 3:
                partidaSimples(grupo[1], grupo[0]);
                partidaSimples(grupo[2], grupo[3]);
                break;
        }


        System.out.println("Fim da rodada " + rodada + "!\n");

    }

}


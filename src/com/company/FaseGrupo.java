package com.company;


import java.util.LinkedList;

import static com.company.Menu.menu;

public class FaseGrupo {

    protected static void fase_grupo(Equipe[] grupo, int rodada, LinkedList<Partida> partidas) { // Passagem de determinado grupo pela classe Main;

        Partida partida1 = new Partida(); // Instancia a classe Partida para o primeiro jogo;
        Partida partida2 = new Partida(); // Instancia a classe Partida para o segundo jogo;

        System.out.println("\nRodada " + rodada + " || Grupo " + grupo[0].getChave());

        switch (rodada) {
            case 1:
                partida1.partidaSimples(grupo[1], grupo[2]); // Chama o método partida simples passando os times de determinado grupo;
                partida2.partidaSimples(grupo[0], grupo[3]);
                partidas.addFirst(partida1); // Guarda a primeira partida do dia na lista;
                partidas.addFirst(partida2); // Guarda a segunda partida do dia na lista;
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

        menu(partidas, grupo); // Chama o método menu da classe Menu;

    }

}


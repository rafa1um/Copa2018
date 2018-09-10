package com.company;
import java.util.LinkedList;
import java.util.Scanner;

import static com.company.Tabela.tabelaGrupo;

public final class Menu {
    protected static void menu(LinkedList<Partida> partidas, Equipe[] grupo) {
        Scanner inputNum = new Scanner(System.in);

        System.out.println("\n ========== MENU ========== ");
        System.out.println("|  1 - Relatório do Dia    |");
        System.out.println("|  2 - Pontuação Geral     |");
        System.out.println("|  3 - Continuar           |");
        System.out.println("|  4 - Finalizar Programa  |");
        System.out.println(" ==========================\n");

        System.out.println("Escolha uma opção: ");
        int n = inputNum.nextInt();

        switch (n) {
            case 1:
                imprimirRelatorio(partidas);
                menu(partidas, grupo);
                break;

            case 2:
                tabelaGrupo(grupo);
                menu(partidas, grupo);
                break;

            case 3:
                break;

            case 4:
                System.exit(0);
        }
    }

    protected static void imprimirRelatorio(LinkedList<Partida> partidas) {

        Partida partida1 = partidas.get(1);
        Equipe equipe1;
        Equipe equipe2;

        // Partida 1
        equipe1 = partida1.getEquipe1();
        equipe2 = partida1.getEquipe2();
        System.out.println(equipe1.getNome() + " Vs. " + equipe2.getNome());
        System.out.println(equipe1.getNome() + " | " + partida1.getPlacar1() + " X " + partida1.getPlacar2() + " | " + equipe2.getNome());

        if (partida1.getPlacar1() > partida1.getPlacar2()) {
            System.out.println(equipe1.getNome() + " Ganhou!!\n");
        } else if (partida1.getPlacar1() < partida1.getPlacar2()) {
            System.out.println(equipe2.getNome() + " Ganhou!!\n");
        } else {
            System.out.println("Empate!!");
            if (partida1.getProrroga1() != -1 && partida1.getProrroga2() != -1) {
                System.out.println("|| Prorrogacao ||");
                System.out.println(equipe1.getNome() + " | " + partida1.getProrroga1() + " X " + partida1.getProrroga2() + " | " + equipe2.getNome());
                if (partida1.getProrroga1() > partida1.getProrroga2()) {
                    System.out.println(equipe1.getNome() + " Ganhou!!\n");
                } else if (partida1.getProrroga1() < partida1.getProrroga2()) {
                    System.out.println(equipe2.getNome() + " Ganhou!!\n");
                } else {
                    System.out.println("Empate!!");
                    System.out.println("|| Disputa de Penaltis ||");
                    System.out.println(equipe1.getNome() + " | " + partida1.getPenalti1() + " X " + partida1.getPenalti2() + " | " + equipe2.getNome());
                    if (partida1.getPenalti1() > partida1.getPenalti2()) {
                        System.out.println(equipe1.getNome() + " Ganhou!!\n");
                    } else {
                        System.out.println(equipe2.getNome() + " Ganhou!!\n");
                    }
                }
            }
            System.out.printf("\n");
        }

        // Partida 2
        partida1 = partidas.get(0);
        equipe1 = partida1.getEquipe1();
        equipe2 = partida1.getEquipe2();

        System.out.println(equipe1.getNome() + " Vs. " + equipe2.getNome());
        System.out.println(equipe1.getNome() + " | " + partida1.getPlacar1() + " X " + partida1.getPlacar2() + " | " + equipe2.getNome());

        if (partida1.getPlacar1() > partida1.getPlacar2()) {
            System.out.println(equipe1.getNome() + " Ganhou!!\n");
        } else if (partida1.getPlacar1() < partida1.getPlacar2()) {
            System.out.println(equipe2.getNome() + " Ganhou!!\n");
        } else {
            System.out.println("Empate!!");
            if (partida1.getProrroga1() != -1 && partida1.getProrroga2() != -1) {
                System.out.println("|| Prorrogacao ||");
                System.out.println(equipe1.getNome() + " | " + partida1.getProrroga1() + " X " + partida1.getProrroga2() + " | " + equipe2.getNome());
                if (partida1.getProrroga1() > partida1.getProrroga2()) {
                    System.out.println(equipe1.getNome() + " Ganhou!!\n");
                } else if (partida1.getProrroga1() < partida1.getProrroga2()) {
                    System.out.println(equipe2.getNome() + " Ganhou!!\n");
                } else {
                    System.out.println("Empate!!");
                    System.out.println("|| Disputa de Penaltis ||");
                    System.out.println(equipe1.getNome() + " | " + partida1.getPenalti1() + " X " + partida1.getPenalti2() + " | " + equipe2.getNome());
                    if (partida1.getPenalti1() > partida1.getPenalti2()) {
                        System.out.println(equipe1.getNome() + " Ganhou!!\n");
                    } else {
                        System.out.println(equipe2.getNome() + " Ganhou!!\n");
                    }
                }
            }
        }
    }
}
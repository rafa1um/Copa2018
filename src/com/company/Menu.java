package com.company;
import java.util.Scanner;

public final class Menu {
    protected static void menu() {
        Scanner inputNum = new Scanner(System.in);

        System.out.println(" ========== MENU ========== ");
        System.out.println("|  1 - Relatório de Dia    |");
        System.out.println("|  2 - Pontuação Geral     |");
        System.out.println("|  3 - Continuar           |");
        System.out.println("|  4 - Finalizar Programa  |");
        System.out.println(" ==========================\n");

        System.out.println("Escolha uma opção: ");
        int n = inputNum.nextInt();

        switch (n) {
            case 1:
                break;

            case 2:
                break;

            case 3:
                break;

            case 4:
                System.exit(0);
        }
    }
}
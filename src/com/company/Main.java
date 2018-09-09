package com.company;
import java.util.Scanner;

import static com.company.FaseGrupo.fase_grupo;

public class Main {

    public static void main(String[] args) {
        Scanner inputNum = new Scanner(System.in);
	    Equipe a[] = new Equipe[4];
        Equipe b[] = new Equipe[4];
        Equipe c[] = new Equipe[4];
        Equipe d[] = new Equipe[4];
        Equipe e[] = new Equipe[4];
        Equipe f[] = new Equipe[4];
        Equipe g[] = new Equipe[4];
        Equipe h[] = new Equipe[4];

        // Grupo A
	    a[0] = new Equipe("Uruguai", "A",0, 0, 0, 0, 0, 0, 627);
        a[1] = new Equipe("Russia", "A",0, 0, 0, 0, 0, 0, 410);
        a[2] = new Equipe("Arábia Saudita", "A", 0, 0, 0, 0, 0, 0, 355);
        a[3] = new Equipe("Egito", "A", 0, 0, 0, 0, 0, 0, 355);

        // Grupo B
        b[0] = new Equipe("Espanha", "B", 0, 0, 0, 0, 0, 0, 580);
        b[1] = new Equipe("Portugal", "B", 0, 0, 0, 0, 0, 0, 599);
        b[2] = new Equipe("Irã", "B", 0, 0, 0, 0, 0, 0, 471);
        b[3] = new Equipe("Marrocos", "B", 0, 0, 0, 0, 0, 0, 418);

        // Grupo C
        c[0] = new Equipe("França", "C", 0, 0, 0, 0, 0, 0, 726);
        c[1] = new Equipe("Dinamarca", "C", 0, 0, 0, 0, 0, 0, 580);
        c[2] = new Equipe("Peru", "C", 0, 0, 0, 0, 0, 0, 535);
        c[3] = new Equipe("Austrália", "C", 0, 0, 0, 0, 0, 0, 431);

        // Grupo D
        d[0] = new Equipe("Croácia", "D", 0, 0, 0, 0, 0, 0, 643);
        d[1] = new Equipe("Argentina", "D", 0, 0, 0, 0, 0, 0, 574);
        d[2] = new Equipe("Nigéria", "D", 0, 0, 0, 0, 0, 0, 410);
        d[3] = new Equipe("Islandia", "D", 0, 0, 0, 0, 0, 0, 471);

        // Grupo E
        e[0] = new Equipe("Brasil", "E", 0, 0, 0, 0, 0, 0, 657);
        e[1] = new Equipe("Suíça", "E", 0, 0, 0, 0, 0, 0, 597);
        e[2] = new Equipe("Sérvia", "E", 0, 0, 0, 0, 0, 0, 459);
        e[3] = new Equipe("Costa Rica", "E", 0, 0, 0, 0, 0, 0, 471);

        // Grupo F
        f[0] = new Equipe("Suécia", "F", 0, 0, 0, 0, 0, 0, 565);
        f[1] = new Equipe("México", "F", 0, 0, 0, 0, 0, 0, 560);
        f[2] = new Equipe("Coréia do Sul", "F", 0, 0, 0, 0, 0, 0, 387);
        f[3] = new Equipe("Alemanha", "F", 0, 0, 0, 0, 0, 0, 561);

        // Grupo G
        g[0] = new Equipe("Bélgica", "G", 0, 0, 0, 0, 0, 0, 723);
        g[1] = new Equipe("Inglaterra", "G", 0, 0, 0, 0, 0, 0, 615);
        g[2] = new Equipe("Tunísia", "G", 0, 0, 0, 0, 0, 0, 498);
        g[3] = new Equipe("Panamá", "G", 0, 0, 0, 0, 0, 0, 343);

        // Grupo H
        h[0] = new Equipe("Colômbia", "H", 0, 0, 0, 0, 0, 0, 563);
        h[1] = new Equipe("Japão", "H", 0, 0, 0, 0, 0, 0, 392);
        h[2] = new Equipe("Senegal", "H", 0, 0, 0, 0, 0, 0, 498);
        h[3] = new Equipe("Polônia", "H", 0, 0, 0, 0, 0, 0, 538);

        System.out.println(" ========= MENU ========= ");
        System.out.println("|  1 - Pontuação Geral   |");
        System.out.println("|  2 - Cartões           |");
        System.out.println("|  3 - Suspensões        |");
        System.out.println("|  4 - Relatório do Dia  |");
        System.out.println("|  5 - Sair              |");
        System.out.println(" ========================\n");

        System.out.println("Escolha uma opção: ");
        //int n = inputNum.nextInt();

        //System.out.println(n);

        // Fase de grupos

        //Rodada 1
        fase_grupo(a,1);
        fase_grupo(b,1);
        fase_grupo(c,1);
        fase_grupo(d,1);
        fase_grupo(e,1);
        fase_grupo(f,1);
        fase_grupo(g,1);
        fase_grupo(h,1);
        System.out.println("Fim da rodada " + 1 + "\n");

        //MataMata q = new MataMata();
        //q.mata_mata(e[3], e[3]);
    }

}

package com.company;
import java.util.Scanner;

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
	    a[0] = new Equipe("Uruguai", "A",0, 0, 0, 0, 0, 0);
        a[1] = new Equipe("Russia", "A",0, 0, 0, 0, 0, 0);
        a[2] = new Equipe("Arábia Saudita", "A", 0, 0, 0, 0, 0, 0);
        a[3] = new Equipe("Egito", "A", 0, 0, 0, 0, 0, 0);

        // Grupo B
        b[0] = new Equipe("Espanha", "B", 0, 0, 0, 0, 0, 0);
        b[1] = new Equipe("Portugal", "B", 0, 0, 0, 0, 0, 0);
        b[2] = new Equipe("Irã", "B", 0, 0, 0, 0, 0, 0);
        b[3] = new Equipe("Marrocos", "B", 0, 0, 0, 0, 0, 0);

        // Grupo C
        c[0] = new Equipe("França", "C", 0, 0, 0, 0, 0, 0);
        c[1] = new Equipe("Dinamarca", "C", 0, 0, 0, 0, 0, 0);
        c[2] = new Equipe("Peru", "C", 0, 0, 0, 0, 0, 0);
        c[3] = new Equipe("Austrália", "C", 0, 0, 0, 0, 0, 0);

        // Grupo D
        d[0] = new Equipe("Croácia", "D", 0, 0, 0, 0, 0, 0);
        d[1] = new Equipe("Argentina", "D", 0, 0, 0, 0, 0, 0);
        d[2] = new Equipe("Nigéria", "D", 0, 0, 0, 0, 0, 0);
        d[3] = new Equipe("Islandia", "D", 0, 0, 0, 0, 0, 0);

        // Grupo E
        e[0] = new Equipe("Brasil", "E", 0, 0, 0, 0, 0, 0);
        e[1] = new Equipe("Suíça", "E", 0, 0, 0, 0, 0, 0);
        e[2] = new Equipe("Sérvia", "E", 0, 0, 0, 0, 0, 0);
        e[3] = new Equipe("Costa Rica", "E", 0, 0, 0, 0, 0, 0);

        // Grupo F
        f[0] = new Equipe("Suécia", "F", 0, 0, 0, 0, 0, 0);
        f[1] = new Equipe("México", "F", 0, 0, 0, 0, 0, 0);
        f[2] = new Equipe("Coréia do Sul", "F", 0, 0, 0, 0, 0, 0);
        f[3] = new Equipe("Alemanha", "F", 0, 0, 0, 0, 0, 0);

        // Grupo G
        g[0] = new Equipe("Bélgica", "G", 0, 0, 0, 0, 0, 0);
        g[1] = new Equipe("Inglaterra", "G", 0, 0, 0, 0, 0, 0);
        g[2] = new Equipe("Tunísia", "G", 0, 0, 0, 0, 0, 0);
        g[3] = new Equipe("Panamá", "G", 0, 0, 0, 0, 0, 0);

        // Grupo H
        h[0] = new Equipe("Colômbia", "H", 0, 0, 0, 0, 0, 0);
        h[1] = new Equipe("Japão", "H", 0, 0, 0, 0, 0, 0);
        h[2] = new Equipe("Senegal", "H", 0, 0, 0, 0, 0, 0);
        h[3] = new Equipe("Polônia", "H", 0, 0, 0, 0, 0, 0);

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

        FaseGrupo fg = new FaseGrupo();
        fg.fase_grupo(e[0], e[3]);
    }

}

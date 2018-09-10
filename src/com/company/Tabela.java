package com.company;

import java.util.Iterator;
import java.util.LinkedList;

public final class Tabela {

    protected static final void tabelaGrupo(Equipe[] grupo) {

        final Object[][] table = new String[5][];
        table[0] = new String[]{"Grupo " + grupo[0].getChave(), "P", "V", "E", "GP", "GC", "SG"};
        insertSort(grupo);
        for (int i = 1; i < 5; i++) {
            table[i] = new String[]{grupo[i-1].getNome(), String.valueOf(grupo[i-1].getPts()),
                    String.valueOf(grupo[i-1].getVitorias()), String.valueOf(grupo[i-1].getEmpates()),
                    String.valueOf(grupo[i-1].getGolsP()), String.valueOf(grupo[i-1].getGolsC())
                    , String.valueOf(grupo[i-1].getGolsS())};
        }
        for (final Object[] row : table) {
            System.out.format("%15s%15s%15s%15s%15s%15s%15s\n", row);
        }
        System.out.printf("\n");
    }
    protected static final void insertSort(Equipe[] grupo) {
        Equipe temp;
        for (int i = 1; i < grupo.length; i++) {
            for (int j = i; j > 0; j--) {
                if (grupo[j].getPts() > grupo[j - 1].getPts()) {
                    temp = grupo[j];
                    grupo[j] = grupo[j - 1];
                    grupo[j - 1] = temp;
                }
            }
        }
    }
}

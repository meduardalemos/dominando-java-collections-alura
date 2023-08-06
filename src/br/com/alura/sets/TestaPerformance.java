package br.com.alura.sets;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;

public class TestaPerformance {
    public static void main(String[] args) {

        Collection<Integer> numeros = new HashSet<>();

        long inicioInsercao = System.currentTimeMillis();

        for (int i = 1; i <= 100000; i++) {
            numeros.add(i);
        }

        long fimInsercao = System.currentTimeMillis();
        long tempoInsercao = fimInsercao-inicioInsercao;
        System.out.println("Tempo de inserção: " + tempoInsercao);

        long inicioBusca = System.currentTimeMillis();

        for (Integer numero: numeros) {
            numeros.contains(numero);
        }

        long fimBusca = System.currentTimeMillis();
        long tempoBusca = fimBusca-inicioBusca;
        System.out.println("Tempo de busca: " + tempoBusca);

    }
}

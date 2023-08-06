package br.com.alura.map;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Exercicio {

    public static void main(String[] args) {

        Map<Integer, String> pessoas = new HashMap<>();

        pessoas.put(21, "Leonardo Cordeiro");
        pessoas.put(27, "Fabio Pimentel");
        pessoas.put(19, "Silvio Matos");
        pessoas.put(23, "Romulo Henrique");

        System.out.println("Imprimindo por chave: ");
        pessoas.keySet().forEach(key -> {
            System.out.println(key);
        });

        System.out.println("Imprimindo por valor: ");
        pessoas.values().forEach(value -> {
            System.out.println(value);
        });

        System.out.println("Imprimindo por associação: ");
        Set<Map.Entry<Integer, String>> associacoes = pessoas.entrySet();
        for (Map.Entry<Integer, String> associacao : associacoes){
            System.out.println(associacao.getKey() + " - " + associacao.getValue());
        }

    }
}

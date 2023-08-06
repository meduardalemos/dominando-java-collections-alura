package br.com.alura.outrossets;

import java.util.*;

public class TestandoRecibos {
    public static void main(String[] args) {

        System.out.println("Imprimindo recibos: ");

        Recibo rec1 = new Recibo("Alimentação", 500);
        Recibo rec2 = new Recibo("Aluguel", 2500);
        Recibo rec3 = new Recibo("Funcionários", 1000);

        Set<Recibo> recibosAgosto = new TreeSet<>
                (Comparator.comparing(Recibo::getValor));
        recibosAgosto.add(rec1);
        recibosAgosto.add(rec2);
        recibosAgosto.add(rec3);

        System.out.println(recibosAgosto);

        System.out.println("Imprimindo vogais: ");

        Set<String> conjunto = new HashSet<>();
        conjunto.add("A");
        conjunto.add("A");
        conjunto.add("E");
        conjunto.add("I");
        conjunto.add("I");
        conjunto.add("O");
        conjunto.add("U");

        conjunto.forEach(letra -> {
            System.out.println(letra);
        });

        System.out.println("Imprimindo numerais: ");

        Set<Integer> numerais = new HashSet<>();
        numerais.add(1);
        numerais.add(2);
        numerais.add(3);
        numerais.add(4);
        numerais.add(5);

        Iterator<Integer> iterator = numerais.iterator();
        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

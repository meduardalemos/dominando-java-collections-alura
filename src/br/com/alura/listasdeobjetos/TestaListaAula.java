package br.com.alura.listasdeobjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {
    public static void main(String[] args) {
        Aula aula01 = new Aula("Revisitando as ArrayList", 21);
        Aula aula02 = new Aula("Listas de objetos", 20);
        Aula aula03 = new Aula("Relacionamento de listas e objetos", 15);

        ArrayList<Aula> aulas = new ArrayList<>();
        aulas.add(aula01);
        aulas.add(aula02);
        aulas.add(aula03);

        System.out.println(aulas);

        Collections.sort(aulas);
        System.out.println(aulas);

        aulas.sort(Comparator.comparing(Aula::getDuracao));
        System.out.println(aulas);
    }
}

package br.com.alura.arraylist;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {
    public static void main(String[] args) {
        String curso01 = "Orientação a objetos com Java";
        String curso02 = "Projetos ágeis com Scrum";
        String curso03 = "Versionamento com Git";
        String curso04 = "Dominando Java Collections";

        ArrayList<String> cursos = new ArrayList<>();
        cursos.add(curso01);
        cursos.add(curso02);
        cursos.add(curso03);

        System.out.println(cursos);

        cursos.remove(1);
        System.out.println("Removendo o segundo item da lista");
        System.out.println(cursos);

        System.out.println("O primeiro curso da lista é: " + cursos.get(0));

        cursos.add(curso04);
        Collections.sort(cursos);
        System.out.println(cursos);




    }
}

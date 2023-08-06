package br.com.alura.listasdeobjetos;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {
    public static void main(String[] args) {
        Curso formacaoJava = new Curso("Formação em Java", "Paulo Silveira");
        formacaoJava.adiciona(new Aula("Orientação a objetos", 35));
        formacaoJava.adiciona(new Aula("Trabalhando com listas", 25));
        formacaoJava.adiciona(new Aula("Entender a linguagem Java", 15));

        List<Aula> aulasImutaveis = formacaoJava.getAulas();
        List<Aula> aulas = new ArrayList<>(aulasImutaveis);

        //Collections.sort(aulas);
        //System.out.println(aulasImutaveis);
        System.out.println(aulas);
        //System.out.println(formacaoJava);
        Collections.singletonList(aulas);
        System.out.println(aulas.get(1));
    }
}

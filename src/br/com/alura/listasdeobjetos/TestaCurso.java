package br.com.alura.listasdeobjetos;

public class TestaCurso {
    public static void main(String[] args) {
        Curso formacaoJava = new Curso("Formação em Java", "Paulo Silveira");
        formacaoJava.adiciona(new Aula("Orientação a objetos", 35));
        formacaoJava.adiciona(new Aula("Trabalhando com listas", 25));
        formacaoJava.adiciona(new Aula("Entender a linguagem Java", 15));

        System.out.println(formacaoJava.getAulas());


    }

}

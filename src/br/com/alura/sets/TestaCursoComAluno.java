package br.com.alura.sets;

import br.com.alura.listasdeobjetos.Curso;

import java.util.Collections;
import java.util.Set;

public class TestaCursoComAluno {

    public static void main(String[] args) {

        Curso javaColecoes = new Curso("Java Coleções", "Paulo Silveira");

        Aluno a1 = new Aluno("Rodrigo Turini", 1001);
        Aluno a2 = new Aluno("Guilherme Silveira", 1002);
        Aluno a3 = new Aluno("Maurício Aniche", 1003);

        javaColecoes.matricula(a1);
        javaColecoes.matricula(a2);
        javaColecoes.matricula(a3);

        System.out.println(javaColecoes.getAlunos());

//        Set<Aluno> alunos = javaColecoes.getAlunos();
//        Set<Aluno> alunosSincronizados = Collections.synchronizedSet(alunos);
//        System.out.println(alunosSincronizados);

        System.out.println(javaColecoes.buscaMatriculado(1002));
    }
}

package br.com.alura.listasdeobjetos;

import br.com.alura.sets.Aluno;

import java.util.*;

public class Curso {
    private String titulo;
    private String instrutor;
    private List<Aula> aulas = new LinkedList<>();
    private int cargaHoraria;
    private Set<Aluno> alunos = new HashSet<>();
    private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

    public Curso(String titulo, String instrutor) {
        this.titulo = titulo;
        this.instrutor = instrutor;
    }

    public String getTitulo() {
        return titulo;
    }

    public String getInstrutor() {
        return instrutor;
    }

    public List<Aula> getAulas() {
        return Collections.unmodifiableList(aulas);
    }

    public int getCargaHoraria() {
        return cargaHoraria;
    }

    public Set<Aluno> getAlunos(){
        return Collections.unmodifiableSet(alunos);
    }

    public void adiciona(Aula aula){
        aulas.add(aula);
        cargaHoraria += aula.getDuracao();
    }

    @Override
    public String toString() {
        return "Curso: " + titulo + " (" + cargaHoraria + " horas) - Aulas " + this.getAulas();
    }

    public void matricula(Aluno aluno){
        this.alunos.add(aluno);
        this.matriculaParaAluno.put(aluno.getNumeroMatricula(), aluno);
    }

    public boolean estaMatriculado(Aluno aluno){
        return this.alunos.contains(aluno);
    }

    public Aluno buscaMatriculado(Integer matricula){
        return matriculaParaAluno.get(matricula);
    }

}

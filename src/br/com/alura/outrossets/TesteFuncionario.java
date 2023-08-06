package br.com.alura.outrossets;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class TesteFuncionario {
    public static void main(String[] args) {

        Funcionario f1 = new Funcionario("Paulo", 32);
        Funcionario f2 = new Funcionario("João", 29);
        Funcionario f3 = new Funcionario("Thiago", 45);

        Set<Funcionario> funcionarios = new TreeSet<>(new OrdenaPorIdade());
        funcionarios.add(f1);
        funcionarios.add(f2);
        funcionarios.add(f3);

        Iterator<Funcionario> iterator = funcionarios.iterator();

        while(iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}

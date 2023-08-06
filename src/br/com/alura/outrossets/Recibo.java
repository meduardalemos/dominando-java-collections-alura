package br.com.alura.outrossets;

public class Recibo {
    private String nome;
    private double valor;

    public Recibo(String nome, double valor) {
        this.nome = nome;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return this.nome + "(R$ " + this.valor + ")";
    }
}

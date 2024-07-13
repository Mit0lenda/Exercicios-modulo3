package br.com.alura.exercicios.Vendaval;

public class Produto implements Vendaval{
    private String nome;
    private double precoUnitario;

    public Produto(String nome, double precoUnitario ) {
        this.nome = nome;
        this.precoUnitario = precoUnitario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(double precoUnitario) {
        this.precoUnitario = precoUnitario;
    }

    @Override
    public double precoTotal(int quantidade) {
        return precoUnitario * quantidade;
    }

    @Override
    public void aplicarDesconto(double desconto) {
        precoUnitario -= precoUnitario * (desconto / 100.0);
    }
}

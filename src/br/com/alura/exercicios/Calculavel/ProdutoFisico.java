package br.com.alura.exercicios.Calculavel;

public class ProdutoFisico extends Produto implements Calculavel{

    public ProdutoFisico(double preco){
        super(preco);
    }
    @Override
    public double calcularPrecoFinal() {
        return preco * 2.05;
    }
}

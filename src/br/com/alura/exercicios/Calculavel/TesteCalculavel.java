package br.com.alura.exercicios.Calculavel;

public class TesteCalculavel {
    public static void main(String[] args) {
        Livro meuLivro = new Livro(100,"Autor Exemplo");
        System.out.println("Preço Final do livro: R$" + meuLivro.calcularPrecoFinal());

        ProdutoFisico meuProduto = new ProdutoFisico(100);
        System.out.println("Preço Final do Produto Fisico: " + meuProduto.calcularPrecoFinal());
    }
}

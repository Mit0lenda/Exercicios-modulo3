package br.com.alura.exercicios.Vendaval;

public class TesteVendavel {
    public static void main(String[] args) {
        Produto produto = new Produto("Notebook",2500.0);
        System.out.println("Preço total do produto(Quantidade 3):R$" +  produto.precoTotal(3));
        produto.aplicarDesconto(10);
        System.out.println("Aplicando o desconto de 10% fica R$" + produto.getPrecoUnitario());

        Servico servico = new Servico("Desenvolvimento de Software",150.0);
        System.out.println("Preço total do serviço(quantidade 5):R$" +  servico.precoTotal(5));
        servico.aplicarDesconto(15);
        System.out.println("Preço do serviço após desconto de 15%:R$" +  servico.getPrecoHora());


    }
}

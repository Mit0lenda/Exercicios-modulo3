package br.com.alura.produto;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {

        ArrayList<Produto> lista = new ArrayList<Produto>();

        Produto produto = new Produto("arroz",5,1.00);
        Produto produto2 = new Produto("sabão",6,10.00);
        ProdutoPerecivel produtoPerecivel = new ProdutoPerecivel("Produto A",2,12.75,"2024-11-30");
        lista.add(produto);
        lista.add(produto2);
        lista.add(produtoPerecivel);

        for (Produto Produto : lista) {
            System.out.println(Produto);
        }

        System.out.println("Tamanho da lista: " + lista.size());
        System.out.println("Produto na posição 0: " + lista.get(2).getNome());
    }
}

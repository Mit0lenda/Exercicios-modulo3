package br.com.alura.listas.arrayPessoa;

import java.util.ArrayList;

public class principal {
    public static void main(String[] args) {

        ArrayList<pessoa> lista = new ArrayList<pessoa>();

        lista.add(new pessoa("nicollas",21));
        lista.add(new pessoa("Vinicius",22));

        for (pessoa pessoa : lista){
            System.out.println(pessoa);
        }

        System.out.println("Total de pessoas: "+lista.size());

        pessoa pessoa = lista.get(1);
        System.out.println("Pessoa na posição 1:" + pessoa);
   }
}

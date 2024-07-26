package br.com.alura.listas.arrayPessoa;

public class pessoa {

    private String nome;
    private int idade;

    public  pessoa (String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }
    @Override
    public String toString() {
        return  "nome=" + nome + '\'' + ", idade=" + idade;
    }
}

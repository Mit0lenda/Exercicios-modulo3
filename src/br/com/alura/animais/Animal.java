package br.com.alura.animais;

public class Animal {
  private String nome;

    public Animal(String nome) {
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public void fazBarulho(){
        System.out.println("Animal faz Barulho...");
    }

    @Override
    public String toString() {
        return  "nome='" + nome;
    }
}

package br.com.alura.animais;

public class Cachorro extends Animal {

    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public void fazBarulho() {
        System.out.println("Cachorro faz barulho");
    }
    // Método específico da classe Cachorro
    public void abanarRabo() {
        System.out.println("O cachorro está abanando o rabo");
    }
}

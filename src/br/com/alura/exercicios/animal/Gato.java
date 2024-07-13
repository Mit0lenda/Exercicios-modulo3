package br.com.alura.exercicios;

public class Gato extends Animal {
    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Miauuuu...");
    }
    public void arranharMoveis() {
        System.out.println("Arranhando moveis...Crec crec");
    }
}

package br.com.alura.exercicios.animal;

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

package br.com.alura.exercicios.animal;

public class Cachorro extends Animal {
    public Cachorro(String rex) {

    }

    @Override
    public void emitirSom() {
        super.emitirSom();
        System.out.println("Au au au");
    }
    public void abanarRabo(){
        System.out.println("Abanando Rabo");
    }
}

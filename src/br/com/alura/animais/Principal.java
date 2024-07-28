package br.com.alura.animais;

public class Principal {
    public static void main(String[] args) {

        Cachorro meucachorro = new Cachorro("Max");
        Animal meuAnimal = (Animal) meucachorro;

        meuAnimal.fazBarulho();
        if (meuAnimal instanceof Cachorro){
            ((Cachorro) meuAnimal).abanarRabo();
        }
    }
}

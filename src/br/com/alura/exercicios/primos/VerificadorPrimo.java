package br.com.alura.exercicios.primos;

public class VerificadorPrimo extends NumerosPrimos{
    public void verificarSeEhPrimo(int numero){
        if (verificarPrimaridade(numero)){
            System.out.println( numero + " é Primo.");
        } else {
            System.out.println(numero + "não é primo.");
        }
    }

}

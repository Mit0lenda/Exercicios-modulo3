package br.com.alura.exercicios.primos;

public class NumerosPrimos {
    public boolean verificarPrimaridade(int numero){
        if (numero <= 1){
            return false;
        }
        for (int i = 2; i * i <=numero; i++){
            if (numero % i == 0){
                return false;
            }
        }
        return true;
    }
    public void listarPrimos(int limiteSuperior){
        System.out.println("Numeros Primos até " + limiteSuperior + ":" );
        for (int i = 2; i <= limiteSuperior; i++){
            if (verificarPrimaridade(i)){
                System.out.println( i + "");
            }
        }
        System.out.println();
    }
}

package br.com.alura.exercicios.primos;

public class TestePrimo {
    public static void main(String[] args) {

        VerificadorPrimo vericador = new VerificadorPrimo();
        vericador.verificarSeEhPrimo(17);

        GeradorPrimo gerador = new GeradorPrimo();
        int proximoPrimo = gerador.gerarProximoPrimo(17);
        System.out.println("O próximo primo após 17 é: " + proximoPrimo);

        NumerosPrimos numerosPrimos = new NumerosPrimos();
        numerosPrimos.listarPrimos(30);
    }
}

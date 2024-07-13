package br.com.alura.exercicios.ConversorTemperatura;

public class TesteTemperatura {
    public static void main(String[] args) {
        ConversorTemperaturaPadrao temperatura = new ConversorTemperaturaPadrao();
        temperatura.celsiusParaFahrenheit(25);
        temperatura.fahrenheitParaCelsius(77);
    }
}

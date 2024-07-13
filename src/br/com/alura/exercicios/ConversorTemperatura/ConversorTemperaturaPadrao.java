package br.com.alura.exercicios.ConversorTemperatura;

public class ConversorTemperaturaPadrao implements ConversorTemperatura {
    @Override
    public void celsiusParaFahrenheit(double celsius) {
        double fahrenheit = celsius * 9/5 + 32;
        System.out.println("Transformando "+celsius + " Para " + fahrenheit);
    }
    public void fahrenheitParaCelsius(double fahrenheit) {
        double celsius = (fahrenheit - 32) * 5/9;
        System.out.println("Transformando "+fahrenheit+ " Para " + celsius);
    }
}

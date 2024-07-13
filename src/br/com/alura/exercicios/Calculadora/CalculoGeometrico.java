package br.com.alura.exercicios.Calculadora;

public class CalculoGeometrico implements CalculadoraSalaRetangular {
    @Override
    public void area(double altura, double largura) {
            double area = largura * altura;
            System.out.println("A area do retangulo " + altura + " por " + largura + " é: " + area);
        }

    @Override
    public void perimetro(double altura, double largura) {
        double perimetro = (largura + altura)*2;
        System.out.println("O perimetro é: " + perimetro);
    }
}

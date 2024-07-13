package br.com.alura.exercicios;public class Carro {
    private String modelo;
    private  double precoAno1;
    private  double precoAno2;
    private  double precoAno3;

    public void definirModelo(String modelo){
        this.modelo = modelo;
    }

    public void definirPrecoAno(double precoAno1, double precoAno2, double precoAno3){
        this.precoAno1 = precoAno1;
        this.precoAno2 = precoAno2;
        this.precoAno3 = precoAno3;
    }
    public void exibirMensagem(){
        System.out.println("Modelo: " + this.modelo);
        System.out.println("Preço no Ano 1 : " + this.precoAno1);
        System.out.println("Preço no Ano 2 : " + this.precoAno2);
        System.out.println("Preço no Ano 3 : " + this.precoAno3);
        System.out.println("Menor Preço: " + menorPreco());
        System.out.println("Maior Preço: " + maiorPreco());
    }

    private double menorPreco(){
        double menor = precoAno1;
        if (precoAno2 < menor){
            menor = precoAno2;
        }
        if (precoAno3 < menor) {
            menor = precoAno3;
        }
        return menor;
    }
    private double maiorPreco(){
        double maior = precoAno1;
        if (precoAno2 > maior){
            maior = precoAno2;
        }
        if (precoAno3 > maior) {
            maior = precoAno3;
        }
        return maior;
    }
}

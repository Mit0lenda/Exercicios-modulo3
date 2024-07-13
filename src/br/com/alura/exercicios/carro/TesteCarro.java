package br.com.alura.exercicios.carro;

public class TesteCarro {
    public static void main(String[] args) {
        ModeloCarro meuModelo = new ModeloCarro();
        meuModelo.definirModelo("Sedan");
        meuModelo.definirPrecoAno(2000,3000,4000);
        meuModelo.exibirMensagem();
    }
}

package br.com.alura.exercicios.banco;

public class TesteBanco {
    public static void main(String[] args) {
        ContaBancaria minhaConta = new ContaBancaria();
        minhaConta.depositar(2000);
        minhaConta.consultarSaldo();

        ContaCorrente corrente = new ContaCorrente();
        corrente.depositar(2000);
        corrente.cobrarTarifaMensal();
        corrente.consultarSaldo();
        corrente.sacar(20);
        corrente.consultarSaldo();


    }
}

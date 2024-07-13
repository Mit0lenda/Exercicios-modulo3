package br.com.alura.exercicios.banco;

public class ContaCorrente extends ContaBancaria {
    private double tarifa = 50;
    public void cobrarTarifaMensal(){
        System.out.println("A tariva é mensal: R$" + tarifa);
        saldo -= tarifa;
        consultarSaldo();
    }
}

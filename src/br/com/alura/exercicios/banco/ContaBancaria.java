package br.com.alura.exercicios;

public class ContaBancaria {
    public double saldo ;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double sacar) {
        if (sacar > saldo){
            System.out.println("Insuficiente para sacar!");
        }else {
            saldo -= sacar;
            System.out.println("Saque realizado com sucesso.No valor de R$" + sacar + " Saldo atual: " + saldo);
        }
    }

    public void consultarSaldo() {
        System.out.println("Saldo: " + saldo);
    }

}

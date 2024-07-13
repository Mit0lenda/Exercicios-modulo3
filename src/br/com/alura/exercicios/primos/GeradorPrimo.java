package br.com.alura.exercicios.primos;

public class GeradorPrimo extends NumerosPrimos{
    public int gerarProximoPrimo(int ultimoPrimoConhecido){
        int proximoNumero = ultimoPrimoConhecido + 1;
        while (!verificarPrimaridade(proximoNumero)){
            proximoNumero++;
        }
        return proximoNumero;
    }

}

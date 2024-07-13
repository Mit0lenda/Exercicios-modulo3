package br.com.alura.exercicios.Tabuada;

public class TabuadaMultiplacacao implements Tabuada {
    @Override
    public void mostrarTabuada(int num) {
        System.out.println("tabuada: " + num);
        for (int i = 1; i < 11; i++) {
            System.out.println(num +" x " + i + " = " + (num * i));
        }
    }
}

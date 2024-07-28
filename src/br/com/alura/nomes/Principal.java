package br.com.alura.nomes;

import java.util.ArrayList;

public class Principal {
    public static void main(String[] args) {
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Nicollas");
        lista.add("João");
        lista.add("Vinicius");
        lista.add("Eduardo");
        for (String elementos : lista){
            System.out.println(elementos);
        }
    }
}

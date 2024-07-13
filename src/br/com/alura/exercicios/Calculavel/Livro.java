// Classe Livro, que implementa a interface Calculavel
package br.com.alura.exercicios.Calculavel;

public class Livro extends Produto implements Calculavel {
    private String autor;

    // Construtor
    public Livro(double preco, String autor) {
        super(preco);
        this.autor = autor;
    }

    // Implementação do método calcularPrecoFinal
    @Override
    public double calcularPrecoFinal() {
        // Aplicando desconto de 10% no preço do livro
        return preco * 0.9;
    }

    // Getter e Setter para autor
    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }
}
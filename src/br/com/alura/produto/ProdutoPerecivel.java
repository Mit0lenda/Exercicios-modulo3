package br.com.alura.produto;

public class ProdutoPerecivel extends Produto{

    private String dataDaValidade;

    public ProdutoPerecivel(String nome, int quantidade, double preco,String dataDaValidade) {
        super(nome, quantidade, preco);
        this.dataDaValidade = dataDaValidade;
    }

    public String getDataDaValidade() {
        return dataDaValidade;
    }

    public void setDataDaValidade(String dataDaValidade) {
        this.dataDaValidade = dataDaValidade;
    }

    @Override
    public String toString() {
        return super.toString() + " dataDaValidade=" + dataDaValidade ;
    }
}

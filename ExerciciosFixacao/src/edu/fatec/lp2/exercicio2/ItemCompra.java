package edu.fatec.lp2.exercicio2;

public class ItemCompra {
    private int quantidade;
    private Produto produto;
    private double desconto;
    private double descontoMaximo = 10.0;

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public edu.fatec.lp2.exercicio2.Produto getProduto() {
        return produto;
    }

    public void setProduto(edu.fatec.lp2.exercicio2.Produto produto) {
        this.produto = produto;
    }

    public double getDesconto() {
        return desconto;
    }

    public void setDesconto(double desconto) {
        this.desconto = desconto;
    }
    // Calcula o desconto //
    public double calcularPreco() {
        double precoTotal = produto.getPreco() * quantidade;
        double descontoAplicado = precoTotal * (desconto / 100);

        if (descontoAplicado > descontoMaximo) {
            descontoAplicado = descontoMaximo;
        }

        return precoTotal - descontoAplicado;
    }
}

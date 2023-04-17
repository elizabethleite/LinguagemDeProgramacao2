package edu.fatec.lp2.exercicio2;

import java.util.ArrayList;
import java.util.List;
public class ListaCompra implements ICalculavel{
    private List<ItemCompra> itens = new ArrayList<>();
    private int limite;

    public List<edu.fatec.lp2.exercicio2.ItemCompra> getItens() {
        return itens;
    }

    public void setItens(List<edu.fatec.lp2.exercicio2.ItemCompra> itens) {
        this.itens = itens;
    }

    public int getLimite() {
        return limite;
    }

    public void setLimite(int limite) {
        this.limite = limite;
    }

    public void adicionarItemCompra(ItemCompra item) {
        if (itens.size() < limite) {
            itens.add(item);
        } else {
            throw new RuntimeException("Limite de itens de compra excedido");
        }
    }

    @Override
    public double calcularPreco() {
        double precoTotal = 0.0;

        for (ItemCompra item : itens) {
            precoTotal += item.calcularPreco();
        }

        return precoTotal;
    }

}

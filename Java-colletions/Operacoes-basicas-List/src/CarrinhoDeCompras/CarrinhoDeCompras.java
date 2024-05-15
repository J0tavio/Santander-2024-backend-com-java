package CarrinhoDeCompras;

import java.util.ArrayList;
import java.util.List;

public class CarrinhoDeCompras {
    private List<Item> itemCarrinho;

    public CarrinhoDeCompras() {
        this.itemCarrinho = new ArrayList<>();
    }

    public void adicionarItem(String nome, double preco, int quantidade) {
        this.itemCarrinho.add(new Item(nome, preco, quantidade));
    }

    public void removerItem(String nome) {
        List<Item> itemCarrinhoParaRemover = new ArrayList<>();
        for (Item i : itemCarrinho) {
            if (i.getNome().equalsIgnoreCase(nome)) {
                itemCarrinhoParaRemover.add(i);
            }
        }
        itemCarrinho.removeAll(itemCarrinhoParaRemover);
    }

    public double calcularValorTotal() {
        List<Item> itemCarrinhoParaCalcular = new ArrayList<>();
        for (Item i : itemCarrinho) {

        }
    }

    public void exibirItens() {

    }


}

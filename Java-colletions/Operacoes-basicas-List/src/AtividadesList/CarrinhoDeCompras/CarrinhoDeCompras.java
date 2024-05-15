package AtividadesList.CarrinhoDeCompras;

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
        double valorTotal = 0;
        for (Item i : itemCarrinho) {
            double valorItem = i.getPreco() * i.getQuantidade();
            valorTotal += valorItem;
        }
        return valorTotal;
    }

    public void exibirItens() {
        System.out.println(this.itemCarrinho);
    }

    public static void main(String[] args) {
        CarrinhoDeCompras carrinhoDeCompras = new CarrinhoDeCompras();

        carrinhoDeCompras.adicionarItem("peixe", 2, 5);
        carrinhoDeCompras.adicionarItem("peixe", 2, 2);
        carrinhoDeCompras.adicionarItem("Queijo", 4, 2);
        carrinhoDeCompras.adicionarItem("Calango", 4, 7);
        carrinhoDeCompras.exibirItens();
        carrinhoDeCompras.removerItem("calango");
        carrinhoDeCompras.exibirItens();
        System.out.println("Valor total das compras: " + carrinhoDeCompras.calcularValorTotal());
    }

}

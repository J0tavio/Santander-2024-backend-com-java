package Ordenacao.EstoqueProdutosComPreco;

import java.util.HashMap;
import java.util.Map;

public class EstoqueProdutos {
    private Map<Long, Produto> produtoMap;

    public EstoqueProdutos() {
        this.produtoMap = new HashMap<>();
    }

    public void adicionarProduto(long cod, String nome, int quantidade, double preco) {
        this.produtoMap.put(cod, new Produto(nome, preco, quantidade));
    }

    public void exibirProdutos() {
        System.out.println(this.produtoMap);
    }

    public double calcularValorTotalEstoque() {
        double valorTotal = 0;
        if (!this.produtoMap.isEmpty()) {
            for (Produto p : this.produtoMap.values()) {
                valorTotal += p.getQuantidade() * p.getPreco();
            }
            return valorTotal;
        } else {
            throw new RuntimeException("Estoque Vazio!");
        }

    }

    public Produto obterProdutoMaisCaro() {
        Produto produtoMaisCaro = null;
        double maiorPreco = Double.MIN_VALUE;
        if (!this.produtoMap.isEmpty()) {
            for (Produto p : this.produtoMap.values()) {
                if (p.getPreco() > maiorPreco) {
                    produtoMaisCaro = p;
                    maiorPreco = p.getPreco();
                }
            }
            return produtoMaisCaro;
        } else {
            throw new RuntimeException("Estoque Vazio!");
        }

    }

    public Produto obterProdutoMaisBarato() {
        Produto produtoMaisBarato = null;
        double menorPreco = Double.MAX_VALUE;
        if (!this.produtoMap.isEmpty()) {
            for (Produto p : this.produtoMap.values()) {
                if (p.getPreco() < menorPreco) {
                    produtoMaisBarato = p;
                    menorPreco = p.getPreco();
                }
            }
            return produtoMaisBarato;
        } else {
            throw new RuntimeException("Estoque Vazio!");
        }

    }

    public Produto obterProdutoMaiorQuantidadeValorTotalNoEstoque() {
        Produto produtoMaiorQuantidadeValorEstoque = null;
        double maiorValorTotalProdutoEstoque = 0d;
        if (!this.produtoMap.isEmpty()) {
            for (Map.Entry<Long, Produto> entry : this.produtoMap.entrySet()) {
                double valorProdutoEmEstoque = entry.getValue().getPreco() * entry.getValue().getQuantidade();
                if (valorProdutoEmEstoque > maiorValorTotalProdutoEstoque) {
                    maiorValorTotalProdutoEstoque = valorProdutoEmEstoque;
                    produtoMaiorQuantidadeValorEstoque = entry.getValue();
                }
            }
            return produtoMaiorQuantidadeValorEstoque;
        } else {
            throw new RuntimeException("Estoque Vazio!");
        }
    }

    public static void main(String[] args) {
        EstoqueProdutos produto = new EstoqueProdutos();

        produto.adicionarProduto(1, "Salmão", 10, 70.50);
        produto.adicionarProduto(2, "Tilápia", 40, 25);
        produto.adicionarProduto(3, "Calango", 40, 10);
        produto.adicionarProduto(4, "Fígado", 100, 6.50);
        produto.adicionarProduto(5, "Farinha", 12, 2.50);
        produto.exibirProdutos();

        System.out.println("Valor total do estoque: " + produto.calcularValorTotalEstoque());
        System.out.println("Produto com maior valor de estoque: " + produto.obterProdutoMaiorQuantidadeValorTotalNoEstoque());
        System.out.println("Produto mais caro: " + produto.obterProdutoMaisCaro());
        System.out.println("Produto mais barato: " + produto.obterProdutoMaisBarato());
    }
}

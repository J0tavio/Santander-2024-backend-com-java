package Ordenacao.CadastroProdutos;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class CadastroProdutos {
    Set<Produto> produtoSet;

    public CadastroProdutos() {
        this.produtoSet = new HashSet<>();
    }

    public void adicionarProduto(long codigo, String nome, double preco, int quantidade) {
        this.produtoSet.add(new Produto(nome, codigo, preco, quantidade));
    }

    public Set<Produto> exibirProdutosPorNome() {
        Set<Produto> produtosPorNome = new TreeSet<>(this.produtoSet);
        return produtosPorNome;
    }

    public Set<Produto> exibirProdutosPorPreco() {
        Set<Produto> produtosPorPreco = new TreeSet<>(new ComparatorPorPreco());
        produtosPorPreco.addAll(this.produtoSet);
        return produtosPorPreco;
    }

    public static void main(String[] args) {
        CadastroProdutos cadastroProdutos = new CadastroProdutos();

        cadastroProdutos.adicionarProduto(444, "Peixe", 4.50, 8);
        cadastroProdutos.adicionarProduto(445, "Picanha", 4.50, 5);
        cadastroProdutos.adicionarProduto(446, "Salmão", 45.50, 4);
        cadastroProdutos.adicionarProduto(447, "Agua", 5.50, 6);
        cadastroProdutos.adicionarProduto(448, "Bacalhau", 8.50, 1);
        cadastroProdutos.adicionarProduto(449, "Manteiga", 5.55, 4);


        System.out.println(cadastroProdutos.exibirProdutosPorNome());
        System.out.println("\n" + cadastroProdutos.exibirProdutosPorPreco());
    }
}



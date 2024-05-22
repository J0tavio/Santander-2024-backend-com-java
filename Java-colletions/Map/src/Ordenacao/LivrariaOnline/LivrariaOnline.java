package Ordenacao.LivrariaOnline;

import java.util.*;

public class LivrariaOnline {
    Map<String, Livro> livroMap;

    public LivrariaOnline() {
        this.livroMap = new HashMap<>();
    }

    public void adicionarLivro(String link, Livro livro) {
        this.livroMap.put(link, livro);
    }

    public void removerLivro(String titulo) {
        List<String> livrosRemover = new ArrayList<>();
        for (Map.Entry<String, Livro> entry : this.livroMap.entrySet()) {
            if (entry.getValue().getTitulo().equalsIgnoreCase(titulo)) {
                livrosRemover.add(entry.getValue().getTitulo());
            }
        }
        for (String chave : livrosRemover) {
            this.livroMap.remove(chave);
        }
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorPreco() {
        List<Map.Entry<String, Livro>> ordenarPorPreco = new ArrayList<>(this.livroMap.entrySet());
        ordenarPorPreco.sort(new ComparatorPorPreco());
        Map<String, Livro> livrosOrdenadosPorPreco = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : ordenarPorPreco) {
            livrosOrdenadosPorPreco.put(entry.getKey(), entry.getValue());
        }

        return livrosOrdenadosPorPreco;
    }

    public Map<String, Livro> exibirLivrosOrdenadosPorAutor() {
        List<Map.Entry<String, Livro>> ordenarPorAutor = new ArrayList<>(this.livroMap.entrySet());
        ordenarPorAutor.sort(new ComparatorPorAutor());
        Map<String, Livro> ordenadosPorAutor = new LinkedHashMap<>();

        for (Map.Entry<String, Livro> entry : ordenarPorAutor) {
            ordenadosPorAutor.put(entry.getKey(), entry.getValue());
        }

        return ordenadosPorAutor;
    }

    public Map<String, Livro> pesquisarLivrosPorAutor(String autor) {
        Map<String, Livro> pesquisaPorAutor = new LinkedHashMap<>();
        for (Map.Entry<String, Livro> entry : this.livroMap.entrySet()) {
            Livro livro = entry.getValue();
            if (livro.getAutor().equalsIgnoreCase(autor)) {
                pesquisaPorAutor.put(entry.getKey(), livro);
            }
        }
        return pesquisaPorAutor;
    }

    public List<Livro> obterLivroMaisCaro() {
        List<Livro> livroMaisCaro = new ArrayList<>();
        double precoMaisAlto = Double.MIN_VALUE;

        for (Livro l : this.livroMap.values()) {
            if (l.getPreco() > precoMaisAlto) {
                precoMaisAlto = l.getPreco();
            }
        }

        for (Map.Entry<String, Livro> entry : this.livroMap.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisAlto) {
                Livro livroMaiorPreco = this.livroMap.get(entry.getKey());
                livroMaisCaro.add(livroMaiorPreco);
            }
        }
        return livroMaisCaro;
    }

    public List<Livro> exibirLivroMaisBarato() {
        List<Livro> livroMaisBarato = new ArrayList<>();
        double precoMaisBaixo = Double.MAX_VALUE;

        for (Livro l : this.livroMap.values()) {
            if (l.getPreco() < precoMaisBaixo) {
                precoMaisBaixo = l.getPreco();
            }
        }

        for (Map.Entry<String, Livro> entry : this.livroMap.entrySet()) {
            if (entry.getValue().getPreco() == precoMaisBaixo) {
                Livro livroMenorPreco = this.livroMap.get(entry.getKey());
                livroMaisBarato.add(livroMenorPreco);
            }
        }
        return livroMaisBarato;
    }

    public static void main(String[] args) {
        LivrariaOnline livro = new LivrariaOnline();

        livro.adicionarLivro("link1", new Livro("Livro1", "autor1", 4d));
        livro.adicionarLivro("link2", new Livro("Livro2", "autor2", 5d));
        livro.adicionarLivro("link3", new Livro("Livro3", "autor3", 1d));
        livro.adicionarLivro("link4", new Livro("Livro4", "autor1", 40d));
        livro.adicionarLivro("link5", new Livro("Livro5", "autor5", 80d));
        livro.adicionarLivro("link6", new Livro("Livro6", "autor6", 50d));


        System.out.println(livro.exibirLivrosOrdenadosPorPreco());
        System.out.println("Livro mais barato: " + livro.exibirLivroMaisBarato());
        System.out.println("Pesquisar por autor: " + livro.pesquisarLivrosPorAutor("Autor1"));
        System.out.println("Livro mais caro: " + livro.obterLivroMaisCaro());
        System.out.println("Ordenados por autor: " + livro.exibirLivrosOrdenadosPorAutor());
        livro.removerLivro("livro6");
        System.out.println(livro.exibirLivrosOrdenadosPorPreco());

    }
}

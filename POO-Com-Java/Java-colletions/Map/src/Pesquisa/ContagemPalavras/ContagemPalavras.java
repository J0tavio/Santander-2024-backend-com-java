package Pesquisa.ContagemPalavras;

import java.util.HashMap;
import java.util.Map;

public class ContagemPalavras {
    Map<String, Integer> palavras;

    public ContagemPalavras() {
        this.palavras = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, Integer contagem) {
        this.palavras.put(palavra, contagem);
    }

    public void removerPalavra(String palavra) {
        if (!this.palavras.isEmpty()) {
            this.palavras.remove(palavra);
        } else {
            throw new RuntimeException("Contagem vazia!");
        }
    }

    public void exibirContagemPalavras() {
        System.out.println(this.palavras);
    }

    public String encontrarPalavraMaisFrequente() {
        String palavraMaisFrequente = null;
        Integer maiorFrequencia = 0;
        if (!this.palavras.isEmpty()) {
            for (Map.Entry<String, Integer> entry : this.palavras.entrySet()) {
                if (entry.getValue() > maiorFrequencia) {
                    maiorFrequencia = entry.getValue();
                    palavraMaisFrequente = entry.getKey();
                }
            }
            return palavraMaisFrequente;
        } else {
            throw new RuntimeException("Contagem vazia!");
        }
    }

    public static void main(String[] args) {
        ContagemPalavras palavras = new ContagemPalavras();

        palavras.adicionarPalavra("Carro", 10);
        palavras.adicionarPalavra("Prato", 5);
        palavras.adicionarPalavra("Pimenta", 8);
        palavras.adicionarPalavra("Lago", 4);

        palavras.exibirContagemPalavras();
        palavras.removerPalavra("Carro");
        palavras.exibirContagemPalavras();

        System.out.println("Palavra mais frequente: " + palavras.encontrarPalavraMaisFrequente());

    }
}

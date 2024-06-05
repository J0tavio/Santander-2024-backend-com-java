package OperacoesBasicas.Dicionario;

import java.util.HashMap;
import java.util.Map;

public class Dicionario {
    private Map<String, String> dicionarioMap;

    public Dicionario() {
        this.dicionarioMap = new HashMap<>();
    }

    public void adicionarPalavra(String palavra, String definicao) {
        this.dicionarioMap.put(palavra, definicao);
    }

    public void removerPalavra(String palavra) {
        if (!this.dicionarioMap.isEmpty()) {
            this.dicionarioMap.remove(palavra);
        } else {
            throw new RuntimeException("O map está vazio!");
        }
    }

    public void exibirPalavras() {
        if (!this.dicionarioMap.isEmpty()) {
            System.out.println(this.dicionarioMap);
        } else {
            throw new RuntimeException("O map está vazio!");
        }
    }

    public String pesquisarPorPalavra(String palavra) {
        if (!this.dicionarioMap.isEmpty()) {
            return this.dicionarioMap.get(palavra);
        } else {
            throw new RuntimeException("O map está vazio!");
        }
    }

    public static void main(String[] args) {
        Dicionario dicionario = new Dicionario();

        dicionario.adicionarPalavra("Carro", "Dirigir");
        dicionario.adicionarPalavra("Moto", "Pilotar");
        dicionario.adicionarPalavra("Avião", "Pilotar");
        dicionario.adicionarPalavra("Peixe", "Comer");
        dicionario.adicionarPalavra("Sapo", "Pular");
        dicionario.adicionarPalavra("Cachorro", "Latir");
        dicionario.exibirPalavras();

        dicionario.removerPalavra("Sapo");
        dicionario.exibirPalavras();

        System.out.println(dicionario.pesquisarPorPalavra("Carro"));

    }
}

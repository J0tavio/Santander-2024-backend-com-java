package org.example;

import java.time.LocalDate;

public class Pessoa {
    private String documento;
    private String nome;
    private LocalDate nascimento;
    private DadosLocalizacao endereco;

    public Pessoa(final String nome, final String documento, final LocalDate nascimento) {
        this.documento = documento;
        this.nome = nome;
        this.nascimento = nascimento;
    }


    public void adicionarDadosDeEndereco(DadosLocalizacao dadosLocalizacao) {
        this.endereco = dadosLocalizacao;
    }

    public String getDocumento() {
        return documento;
    }

    public String getNome() {
        return nome;
    }

    public LocalDate getNascimento() {
        return nascimento;
    }

    public DadosLocalizacao getEndereco() {
        return endereco;
    }
}

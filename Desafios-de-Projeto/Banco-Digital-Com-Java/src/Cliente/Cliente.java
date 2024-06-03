package Cliente;

import BancoDigital.Conta;

public class Cliente {
    private String nome;
    private String cpf;
    private Conta tipoConta;

    public Cliente(String nome, String cpf, Conta tipoConta) {
        this.nome = nome;
        this.cpf = cpf;
        this.tipoConta = tipoConta;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    @Override
    public String toString() {
        return "Cliente " +
                "nome: '" + nome +
                ", cpf: " + cpf +
                ", tipoConta: " + tipoConta;
    }
}

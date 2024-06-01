package BancoDigital2.Contas;

import BancoDigital2.Cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public abstract class Conta {
    private static final int AGENCIA_PADRAO = 1;
    private static int SEQUENCIAL = 1;

    protected int agencia;
    protected int numero;
    protected double saldo;
    protected Cliente cliente;

    public Conta() {
        this.agencia = AGENCIA_PADRAO;
        this.numero = SEQUENCIAL++;
    }

    public void sacar(double valor) {
        this.saldo -= valor;
    }

    public void despositar(double valor) {
        this.saldo += valor;
    }

    public void transferir(double valor, Conta contaDestiono) {
        this.sacar(valor);
        contaDestiono.despositar(valor);
    }

    protected void informacoes() {
        System.out.println(String.format("Titular: %s", this.cliente.getNome()));
        System.out.println(String.format("CPF: %s", this.cliente.getCpf()));
        System.out.println(String.format("Agência: %d", this.agencia));
        System.out.println(String.format("Número: %d", this.numero));
        System.out.println(String.format("Saldo: %.2f", this.saldo));
    }

    @Override
    public String toString() {
        return "Conta{" +
                "agencia=" + agencia +
                ", numero=" + numero +
                ", saldo=" + saldo;
    }
}

package BancoDigital;

import Cliente.Cliente;

public class ContaCorrente extends Conta {
    private String nome = "Conta Corrente";

    @Override
    public void imprimirInfosComuns() {
        System.out.println(" ==Extrato Conta Corrente== ");
        super.imprimirInfosComuns();
    }

    public String getNome() {
        return nome;
    }
}

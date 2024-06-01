package BancoDigital;

import Cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    private List<Conta> contasList;
    private List<Cliente> clienteList;

    public Banco() {
        this.contasList = new ArrayList<>();
    }

    public void adicionarContaCorrente(Cliente cliente) {
        this.contasList.add(new ContaCorrente(cliente));
    }

    public void adicionarContaPoupanca(Cliente cliente) {
        this.contasList.add(new ContaCorrente(cliente));
    }

    public void removerConta(String cpf) {
        List<Conta> contaRemover = new ArrayList<>();
        if (!this.contasList.isEmpty()) {
            for (Conta c : this.contasList) {
                if (c.cliente.getCpf().equalsIgnoreCase(cpf)) {
                    contaRemover.add(c);
                }
            }
        }
        this.contasList.removeAll(contaRemover);
    }


//    public void adicionarCliente(String nome, String cpf) {
//        this.clienteList.add(new Cliente(nome, cpf));
//    }
//
//    public void removerCliente(String cpf) {
//        List<Cliente> clienteRemover = new ArrayList<>();
//        if (!this.clienteList.isEmpty()) {
//            for (Cliente c : this.clienteList) {
//                if (c.getCpf().equalsIgnoreCase(cpf)) {
//                    clienteRemover.add(c);
//                }
//            }
//        }
//        this.clienteList.removeAll(clienteRemover);
//    }
//
//    public void listarClientes() {
//        System.out.println(this.clienteList);
//    }
}

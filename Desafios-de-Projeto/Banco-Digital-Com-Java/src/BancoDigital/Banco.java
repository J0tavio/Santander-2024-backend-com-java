package BancoDigital;

import Cliente.Cliente;

import java.util.ArrayList;
import java.util.List;

public class Banco {
    private String nome;
    //    private List<Conta> contasList;
    private List<Cliente> clienteList;

    public Banco() {
//        this.contasList = new ArrayList<>();
        this.clienteList = new ArrayList<>();
    }

    public void adicionarCliente(String nome, String cpf, Conta tipoConta) {
        this.clienteList.add(new Cliente(nome, cpf, tipoConta));
    }

    public void removerCliente(String cpf) {
        List<Cliente> clientesRemover = new ArrayList<>();
        if (!this.clienteList.isEmpty()) {
            for (Cliente c : this.clienteList) {
                if (c.getCpf().equalsIgnoreCase(cpf)) {
                    clientesRemover.add(c);
                }
            }
        }
        this.clienteList.removeAll(clientesRemover);
    }

    public void listarClientes() {
        System.out.println(this.clienteList);
    }

}

package BancoDigital2.Contas;

import java.util.ArrayList;
import java.util.List;

import BancoDigital2.Cliente.Cliente;

public class Banco {
    private List<Cliente> clienteList;

    public Banco() {
        this.clienteList = new ArrayList<>();
    }

    public void adicionarCliente(String nome, String cpf) {
        this.clienteList.add(new Cliente(nome, cpf));
    }

    public void removerCliente(String cpf) {
        List<Cliente> clientesRemover = new ArrayList<>();

        for (Cliente c : this.clienteList) {
            if (c.getCpf().equalsIgnoreCase(cpf)) {
                clientesRemover.add(c);
            }
        }
        this.clienteList.removeAll(clientesRemover);
    }

    public void listarClientes() {
        System.out.println(this.clienteList);
    }


}

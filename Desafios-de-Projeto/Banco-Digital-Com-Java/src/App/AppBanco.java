package App;

import BancoDigital.Banco;
import BancoDigital.Conta;
import BancoDigital.ContaCorrente;
import Cliente.Cliente;

public class AppBanco {
    public static void main(String[] args) {
        Banco cliente1 = new Banco();
        ContaCorrente cc = new ContaCorrente();
        cliente1.adicionarCliente("João", "1", cc);
        cc.depositar(100);

        cc.imprimirInfosComuns();
        cliente1.listarClientes();



    }
}

package App;

import BancoDigital.Conta;
import BancoDigital.ContaCorrente;
import Cliente.Cliente;

public class AppBanco {
    public static void main(String[] args) {
//        Banco cliente1 = new Banco();
//        cliente1.adicionarContaCorrente(new Cliente("Joao", "1"));
        Cliente cliente1 = new Cliente("Joao", "1");
        Cliente cliente2 = new Cliente("Pedro", "2");

        Conta cc = new ContaCorrente(cliente1);
        cc.depositar(5000);



        Conta cc2 = new ContaCorrente(cliente2);
        cc.transferir(200, cc2);
        cc2.imprimirExtrato();
        cc.imprimirExtrato();



    }
}

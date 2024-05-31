package App;

import BancoDigital.Conta;
import BancoDigital.ContaCorrente;
import BancoDigital.ContaPoupanca;
import Cliente.Cliente;

public class AppBanco {
    public static void main(String[] args) {
        Cliente joao = new Cliente();
        joao.setNome("João");
        Conta cc = new ContaCorrente(joao);
        Conta cp = new ContaPoupanca(joao);

        cc.depositar(500);
        cc.transferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}

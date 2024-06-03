package BancoDigital;

public class ContaPoupanca extends Conta {
    private String nome = "Conta Poupança";

    @Override
    public void imprimirInfosComuns() {
        System.out.println(" ==Extrato Conta Poupança== ");
        super.imprimirInfosComuns();
    }

    public String getNome() {
        return nome;
    }
}

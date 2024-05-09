import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner = new Scanner(System.in);
        String angencia, nomeCliente;
        int numero;
        double saldo;

        System.out.println("Por favor, digite seu nome !");
        nomeCliente = scanner.nextLine();
        System.out.println("Por favor, digite o número da Agência !");
        angencia = scanner.nextLine();
        System.out.println("Por favor, digite o número da conta !");
        numero = scanner.nextInt();
        System.out.println("Por favor, digite seu Saldo !");
        saldo = scanner.nextDouble();

        System.out.println("Olá " + nomeCliente
                + ", obrigado por criar uma conta em nosso banco, sua agência é " + angencia
                + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }

}

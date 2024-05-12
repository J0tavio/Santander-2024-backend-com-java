import java.util.Scanner;

public class ControleSimplesDeSaques {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double limiteDiario = scanner.nextDouble();
        double saque = scanner.nextDouble();

        if (saque > 0 && saque <= limiteDiario) {
            limiteDiario -= saque;
            System.out.println("Saque realizado. Limite restante: " + limiteDiario);
            saque = 0;
            for (int i = 0; saque <= limiteDiario; i++) {
                saque = scanner.nextDouble();

                if (saque == 0) {
                    System.out.println("Transacoes encerradas.");
                    break;
                } else if (saque >= limiteDiario) {
                    limiteDiario -= saque;
                    System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
                    break;
                }
                limiteDiario -= saque;
                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
                saque = 0;
            }
        } else {
            System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
        }
        scanner.close();
    }
}

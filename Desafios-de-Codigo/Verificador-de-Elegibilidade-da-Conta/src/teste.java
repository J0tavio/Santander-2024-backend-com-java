//import java.util.Scanner;
//
//public class teste {
//
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//
//        double limiteDiario = scanner.nextDouble();
//
//        for (double i = 0; i < limiteDiario; i++) {
//            double saque = scanner.nextDouble();
//            if (saque == 0) {
//                System.out.println("Transacoes encerradas.");
//                i = limiteDiario;
//            } else if (saque > limiteDiario) {
//                System.out.println("Limite diario de saque atingido. Transacoes encerradas.");
//                i = limiteDiario;
//            } else {
//                limiteDiario -= saque;
//                System.out.println("Saque realizado. Limite restante: " + limiteDiario);
//            }
//        }
//        scanner.close();
//    }
//}

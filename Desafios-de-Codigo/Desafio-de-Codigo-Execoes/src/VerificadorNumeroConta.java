import java.util.Scanner;
//Renomear para Desafio-de-Codigo-Execoes
public class VerificadorNumeroConta {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String numero = scanner.next();


        try {
            verificarNumeroConta(numero);
        } catch (IllegalArgumentException exception) {
            System.out.println("Numero de conta invalido. Digite exatamente 8 digitos.");
        }

    }

    private static void verificarNumeroConta(String numeroConta) throws IllegalArgumentException {

        if (numeroConta.length() == 8) {
            System.out.println("Numero de conta valido.");
        } else {
            throw new IllegalArgumentException();
        }


    }
}



public class Operadores {
  public static void main(String[] args) {
    // Quando há uma String na frente de um número o resto dos números serão Strings

    // Exemplo

    String concatenacao;
    concatenacao = 1 + 1 + "1" + 1 + 1;

    System.out.println(concatenacao); // 111

    // Operador ternário. Exeplos usando if-else e usando o operador ternário
    int a = 10;
    int b = 70;
    String resultado;

    // if (a == b) {
    //   System.out.println("verdadeiro");
    // } else {
    //   System.out.println("Falso");
    // }

    resultado = a == b ? "verdadeiro" : "falso";
    System.out.println(resultado);

  }
}

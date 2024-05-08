public class ExemploBreakContinue {
  public static void main(String[] args) {
    // uso do break
    for (int numero = 1; numero <= 5; numero++) {
      if (numero == 3)
        break;

      System.out.println(numero);

    } // Quando a variável numero chegar em 3 ela irá parar a execução. Console será
      // 1, 2

    // uso do continue

    for (int numero = 1; numero <= 5; numero++) {
      if (numero == 3)
        continue;

      System.out.println(numero);

    } // Quando a variável numero chegar em 3 ela irá continuar sem executar o número
      // 3. Console será 1, 2, 4, 5
  }
}

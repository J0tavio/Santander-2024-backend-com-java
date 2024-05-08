public class FormatadorCepExemplo {
  public static void main(String[] args) {
    // String cepFormatado = formatarCep("40028922"); <- O uso dessa forma, você será
    // forçado a usar um try catch para realizar um tratamento

    try {
      String cepFormatado = formatarCep("40028922");
      System.out.println(cepFormatado);
    } catch (CepInvalidoException e) {
      System.out.println("O cep não corresponde ao formato");
      e.printStackTrace();
    }
  }

  static String formatarCep(String cep) throws CepInvalidoException {
    if (cep.length() != 8)
      throw new CepInvalidoException();

    // simulando um cep formatado
    return "40.028-922";
  }
}

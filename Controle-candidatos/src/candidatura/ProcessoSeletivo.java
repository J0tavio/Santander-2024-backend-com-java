package candidatura;

import java.util.concurrent.ThreadLocalRandom;

public class ProcessoSeletivo {
  public static void main(String[] args) {
    selecaoCandidatos();
    System.out.println("");
    imprimirSelecionados();
  }

  static void imprimirSelecionados() {
    String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO" };
    System.out.println("Imprimindo o índicie dos candidatos");
    for (int i = 0; i < candidatos.length; i++) {
      System.out.println("posição: " + i + " candidato " + candidatos[i]);
    }
    // Usando foreach
    System.out.println("forma abreviada");
    for (String i : candidatos) {
      System.out.println("Candidato: " + i);
    }
  }

  static void selecaoCandidatos() {
    String[] candidatos = { "FELIPE", "MARCIA", "JULIA", "PAULO", "AUGUSTO", "MONICA", "FABRICIO", "MIRELA", "DANIELA",
        "JORGE" };

    int candidatosSelecionados = 0;
    int candidatoAtual = 0;
    double salarioBase = 2000.0;

    while (candidatosSelecionados < 5 && candidatoAtual < candidatos.length) {
      String candidato = candidatos[candidatoAtual];
      double salarioPretendido = valorPretendido();

      System.out.println("O candidato " + candidato + " Solicitou esse valor de salário " + salarioPretendido);
      if (salarioBase >= salarioPretendido) {
        System.out.println("O candidato " + candidato + " foi selecionado para a vaga");
        candidatosSelecionados++;
      }
      candidatoAtual++;
    }
  }

  static double valorPretendido() {
    return ThreadLocalRandom.current().nextDouble(1800, 2200);
  }

  static void analisarCandidato(double salarioPretendido) {
    double salarioBase = 2000.0;
    if (salarioBase > salarioPretendido) {
      System.out.println("Ligar para o candidato");
    } else if (salarioBase == salarioPretendido) {
      System.out.println("Ligar para candidato oferecendo outra proposta");
    } else {
      System.out.println("Aguardando resultado dos demais candidatos");
    }
  }
}

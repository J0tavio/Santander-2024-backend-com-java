package Desafios.D7EncontrarOSegundoNúmeroMaiorDaLista;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class SegundoMaior {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        Optional<Integer> segundoMaior = numeros.stream()
                .distinct() // Remove duplicatas
                .sorted(Comparator.reverseOrder()) // Ordena em ordem decrescente
                .skip(1) // Pula o primeiro elemento (o maior)
                .findFirst(); // Pega o próximo elemento (o segundo maior)

        if (segundoMaior.isPresent()) {
            System.out.println("O segundo maior: " + segundoMaior.get());
        } else {
            System.out.println("Não há segundo maior!");
        }
    }
}

package Desafios.D9VerificarSeTodosOsNúmerosDaListaSãoDistintos;

import java.util.Arrays;
import java.util.List;

public class NumerosDistintos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10);

        boolean numerosDistintos = numeros.stream()
                .distinct() // Remove duplicatas
                .count() == numeros.size(); // Compara com o tamanho original

        System.out.println("Há números distintos? " + numerosDistintos);
    }
}

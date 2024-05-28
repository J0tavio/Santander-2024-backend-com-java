package Desafios.D4RemovaTodosOsValoresÍmpares;

import java.util.Arrays;
import java.util.List;

public class RemoverImpares {
    public static void main(String[] args) {
        // Esse Array é imutável
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> numerosPares = numeros.stream().sorted().filter(n -> n % 2 == 0).toList();
        System.out.println(numerosPares);

        // numeros.stream().filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
    }
}

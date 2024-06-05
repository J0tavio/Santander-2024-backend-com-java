package Desafios.D16AgrupeOsNúmerosEmParesEÍmpares;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgruparImparesPares {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        List<Integer> listaPares = numeros.stream().sorted().filter(n -> n % 2 == 0).toList();
        System.out.println("Lista pares: " + listaPares);

        List<Integer> listaImpares = numeros.stream().sorted().filter(n -> n % 2 != 0).toList();
        System.out.println("Lista ímpares: " + listaImpares + "\n");

        // Outra forma utilizando o Map
        Map<Boolean, List<Integer>> grupos = numeros.stream().sorted()
                .collect(Collectors.partitioningBy(c -> c % 2 == 0));
        System.out.println("Lógica feita com o Map");
        System.out.println("Lista pares: " + grupos.get(true));
        System.out.println("Lista ímpares: " + grupos.get(false));
    }
}

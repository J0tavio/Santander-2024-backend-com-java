package Desafios.D10AgrupeOsValoresÍmparesMúltiplosDe3OuDe5;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class AgrupeMutiplosImpares3E5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        Map<Boolean, List<Integer>> numerosMultiplos = numeros.stream().filter(n -> n % 2 != 0)
                .collect(Collectors.partitioningBy(c -> c % 3 == 0 || c % 5 == 0)); //dividi o stream em dois grupos, com base no predicado fornecido

        System.out.println("Múltiplos de 3 ou 5: " + numerosMultiplos.get(true));
        System.out.println("Outros ímpares: " + numerosMultiplos.get(false));
    }
}

package Desafios.D18VerifiqueSeTodosOsNúmerosDaListaSãoIguais;

import java.util.Arrays;
import java.util.List;

public class NumerosIguais {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(2, 2, 2);

        boolean iguais = numeros.stream()
                .distinct()
                .count() == 1;

        System.out.println("Todos os números são iguais? " + iguais);

        // Outra alternativa

        boolean todosIguais = numeros.stream()
                .allMatch(n -> n.equals(numeros.getFirst()));
        System.out.println("Todos os números são iguais? " + todosIguais);
    }
}

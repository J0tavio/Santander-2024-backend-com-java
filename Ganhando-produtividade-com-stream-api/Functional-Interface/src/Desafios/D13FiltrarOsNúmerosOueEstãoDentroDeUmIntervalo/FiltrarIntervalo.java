package Desafios.D13FiltrarOsNúmerosOueEstãoDentroDeUmIntervalo;

import java.util.Arrays;
import java.util.List;

public class FiltrarIntervalo {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        numeros.stream().sorted()
                .filter(n -> n < 10 && n > 5)
                .forEach(System.out::println);
    }
}

package Desafios.D19EncontreASomaDosNúmerosDivisíveisPor3E5;

import java.util.Arrays;
import java.util.List;

public class SomoDivisiveis {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 15, 30);

        int soma = numeros.stream().filter(n -> n % 3 == 0 && n % 5 == 0)
                .reduce(0, Integer::sum);
        System.out.println(soma);
    }
}

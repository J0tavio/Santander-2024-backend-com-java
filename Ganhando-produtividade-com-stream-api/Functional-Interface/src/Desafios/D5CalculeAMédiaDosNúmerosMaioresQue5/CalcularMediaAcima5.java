package Desafios.D5CalculeAMédiaDosNúmerosMaioresQue5;

import java.util.Arrays;
import java.util.List;

public class CalcularMediaAcima5 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

//        double soma = numeros.stream().filter(n -> n > 5).reduce(0, Integer::sum);
//        double media = soma / 5;
//        System.out.println(media);

        double soma = numeros.stream().filter(n -> n > 5).reduce(0, Integer::sum);
        long contar = numeros.stream().filter(n -> n > 5).count();
        double media = soma / contar;

        System.out.println(media);

    }
}

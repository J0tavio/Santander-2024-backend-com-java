package Desafios.D11EncontreASomaDosQuadradosDeTodosOsNúmerosDaLista;

import java.util.Arrays;
import java.util.List;

public class SomaQuadrados {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);


        int numerosQuadrados = numeros.stream()
                .mapToInt(n -> n * n) // Calcula o quadrado de cada número
                .sum(); // Soma os quadrados

        System.out.println(numerosQuadrados);
    }
}

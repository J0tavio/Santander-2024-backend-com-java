package Desafios.D8SomarOsDígitosDeTodosOsNúmerosDaLista;

import java.util.Arrays;
import java.util.List;

public class SomarTodosOsDigitos {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3);

        int soma = numeros.stream()
                .map(String::valueOf)// Converte cada número para string
                .flatMap(str -> str.chars().mapToObj(c -> c - '0')) // Separa os dígitos
                .mapToInt(Integer::intValue)// Converte os caracteres em inteiros
                .sum();// Soma os dígitos

        System.out.println(soma);
    }
}

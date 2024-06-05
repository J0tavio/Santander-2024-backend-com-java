package Desafios.D6VerificarSeAListaContémAlgumNúmeroMaiorQue10;

import java.util.Arrays;
import java.util.List;

public class VerificarMaior10 {
    public static void main(String[] args) {
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 5, 4, 3, 11);

        numeros.stream().filter(n -> n > 10).forEach(System.out::println);

        //Outra forma

        boolean numeroMaior10 = numeros.stream().anyMatch(n -> n > 10);
        System.out.println("algum número maior que 10 ?: " + numeroMaior10);
    }
}

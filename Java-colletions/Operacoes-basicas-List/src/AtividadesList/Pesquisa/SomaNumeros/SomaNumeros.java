package AtividadesList.Pesquisa.SomaNumeros;

import java.util.ArrayList;
import java.util.List;

public class SomaNumeros {
    List<Integer> numerosInteiros;

    public SomaNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosInteiros.add(numero);
    }

    public int calcularSoma() {
        int soma = 0;

        if (!numerosInteiros.isEmpty()) {
            for (Integer i : numerosInteiros) {
                soma += i;
            }
            return soma;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Integer encontrarMaiorNumero() {
        Integer maiorNumero = 0;

        if (!numerosInteiros.isEmpty()) {
            for (Integer i : numerosInteiros) {
                if (i > maiorNumero) {
                    maiorNumero = i;
                }
            }
            return maiorNumero;
        } else {
            throw new RuntimeException("A lista está vazia!");
        }
    }

    public Integer encontrarMenorNumero() {
        Integer menorNumero = numerosInteiros.get(0);

        if (!numerosInteiros.isEmpty()) {
            for (Integer i : numerosInteiros) {
                if (i < menorNumero) {
                    menorNumero = i;
                }
            }
        }
        return menorNumero;
    }

    public void exibirNumeros() {
        System.out.println(numerosInteiros);
    }

    public static void main(String[] args) {
        SomaNumeros somaNumeros = new SomaNumeros();

        somaNumeros.adicionarNumero(4);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(8);
        somaNumeros.adicionarNumero(5);
        somaNumeros.adicionarNumero(10);
        somaNumeros.adicionarNumero(10);

        somaNumeros.exibirNumeros();
        System.out.println(somaNumeros.encontrarMaiorNumero());
        System.out.println(somaNumeros.encontrarMenorNumero());
        System.out.println(somaNumeros.calcularSoma());

    }
}

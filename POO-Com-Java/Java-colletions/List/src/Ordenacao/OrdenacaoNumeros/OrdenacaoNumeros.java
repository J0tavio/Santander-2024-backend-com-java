package Ordenacao.OrdenacaoNumeros;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class OrdenacaoNumeros {
    private List<Integer> numerosInteiros;

    public OrdenacaoNumeros() {
        this.numerosInteiros = new ArrayList<>();
    }

    public void adicionarNumero(int numero) {
        this.numerosInteiros.add(numero);
    }

    public List<Integer> ordenarAscendente() {
        List<Integer> numerosOrdenarAscendente = new ArrayList<>(this.numerosInteiros);
        Collections.sort(numerosOrdenarAscendente);
        return numerosOrdenarAscendente;
    }

    public List<Integer> ordenarDescendente() {
        List<Integer> numerosOrdenarDescendente = new ArrayList<>(this.numerosInteiros);
        numerosOrdenarDescendente.sort(Collections.reverseOrder());
        return numerosOrdenarDescendente;
    }

    public void mostrarLista() {
        System.out.println(numerosInteiros);
    }

    public static void main(String[] args) {
        OrdenacaoNumeros ordenacaoNumeros = new OrdenacaoNumeros();

        ordenacaoNumeros.adicionarNumero(14);
        ordenacaoNumeros.adicionarNumero(45);
        ordenacaoNumeros.adicionarNumero(20);
        ordenacaoNumeros.adicionarNumero(4);

        System.out.println(ordenacaoNumeros.ordenarDescendente());
        System.out.println(ordenacaoNumeros.ordenarAscendente());
        ordenacaoNumeros.mostrarLista();
    }


}

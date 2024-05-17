package OperacoesBasicas.PalavrasUnicas;

import java.util.HashSet;
import java.util.Set;

public class ConjuntoPalavrasUnicas {
    private Set<String> conjuntoPalavrasUnicas;

    public ConjuntoPalavrasUnicas() {
        this.conjuntoPalavrasUnicas = new HashSet<>();
    }

    public void adicionarPalavra(String palavra) {
        this.conjuntoPalavrasUnicas.add(new String(palavra));
    }

    public void removerPalavra(String palavra) {
        String conjuntoPalavrasUnicasParaRemover = null;
        for (String s : this.conjuntoPalavrasUnicas) {
            if (s.equalsIgnoreCase(palavra)) {
                conjuntoPalavrasUnicasParaRemover = s;
                break;
            }
        }
        this.conjuntoPalavrasUnicas.remove(conjuntoPalavrasUnicasParaRemover);
    }

    public boolean verificarPalavra(String palavra) {
        return this.conjuntoPalavrasUnicas.contains(palavra);
    }

    public void exibirPalavrasUnicas() {
        System.out.println(this.conjuntoPalavrasUnicas);
    }

    public static void main(String[] args) {
        ConjuntoPalavrasUnicas conjuntoPalavrasUnicas = new ConjuntoPalavrasUnicas();

        conjuntoPalavrasUnicas.adicionarPalavra("Água");
        conjuntoPalavrasUnicas.adicionarPalavra("Terra");
        conjuntoPalavrasUnicas.adicionarPalavra("Fogo");
        conjuntoPalavrasUnicas.adicionarPalavra("Ar");
        conjuntoPalavrasUnicas.exibirPalavrasUnicas();


        System.out.println("A palavra 'Sapo' está no Set?: " + conjuntoPalavrasUnicas.verificarPalavra("Sapo"));
        System.out.println("A palavra 'Água' está no Set?: " + conjuntoPalavrasUnicas.verificarPalavra("Água"));

        conjuntoPalavrasUnicas.removerPalavra("Fogo");

        conjuntoPalavrasUnicas.exibirPalavrasUnicas();

    }
}

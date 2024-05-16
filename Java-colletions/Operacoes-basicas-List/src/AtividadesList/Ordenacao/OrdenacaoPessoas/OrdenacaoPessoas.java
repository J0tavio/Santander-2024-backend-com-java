package AtividadesList.Ordenacao.OrdenacaoPessoas;

import java.util.*;

public class OrdenacaoPessoas {
    private List<Pessoa> pessoaList;

    public OrdenacaoPessoas() {
        this.pessoaList = new ArrayList<>();
    }

    public void adicionarPessoa(String nome, int idade, double altura) {
        this.pessoaList.add(new Pessoa(nome, idade, altura));
    }

    public List<Pessoa> ordenarPorIdade() {
        List<Pessoa> pessoasOrdenarPorIdade = new ArrayList<>(pessoaList);
        Collections.sort(pessoasOrdenarPorIdade);
        return pessoasOrdenarPorIdade;
    }

    public List<Pessoa> ordenarPorAltura() {
        List<Pessoa> pessoasOrdenarPorAltura = new ArrayList<>(pessoaList);
        Collections.sort(pessoasOrdenarPorAltura, new ComparatorPorAltura());
        return pessoasOrdenarPorAltura;
    }

    public static void main(String[] args) {
        OrdenacaoPessoas ordenacaoPessoas = new OrdenacaoPessoas();

        ordenacaoPessoas.adicionarPessoa("João", 19, 1.72);
        ordenacaoPessoas.adicionarPessoa("Maria", 14, 1.66);
        ordenacaoPessoas.adicionarPessoa("Carlos", 70, 1.92);
        ordenacaoPessoas.adicionarPessoa("Leonardo", 20, 1.69);

        System.out.println(ordenacaoPessoas.ordenarPorIdade());
        System.out.println(ordenacaoPessoas.ordenarPorAltura());
        System.out.println(ordenacaoPessoas.pessoaList);
    }
}



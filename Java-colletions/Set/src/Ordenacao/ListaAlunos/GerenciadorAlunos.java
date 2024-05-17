package Ordenacao.ListaAlunos;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class GerenciadorAlunos {
    Set<Aluno> alunoSet;

    public GerenciadorAlunos() {
        this.alunoSet = new HashSet<>();
    }

    public void adicionarAluno(String nome, long matricula, double nota) {
        this.alunoSet.add(new Aluno(nome, matricula, nota));
    }

    public void removerAluno(long matricula) {
        Aluno alunoRemover = null;
        for (Aluno a : this.alunoSet) {
            if (a.getMatricula() == matricula) {
                alunoRemover = a;
                break;
            }
        }
        this.alunoSet.remove(alunoRemover);
    }

    public Set<Aluno> exibirAlunosPorNome() {
        Set<Aluno> alunosPorNome = new TreeSet<>(this.alunoSet);
        return alunosPorNome;
    }

    public Set<Aluno> exibirAlunosPorNota() {
        Set<Aluno> alunosPorNota = new TreeSet<>(new CompararAlunoPorNota());
        alunosPorNota.addAll(this.alunoSet);
        return alunosPorNota;
    }

    public void exibirAlunos() {
        System.out.println(this.alunoSet);
    }

    public static void main(String[] args) {
        GerenciadorAlunos aluno = new GerenciadorAlunos();

        aluno.adicionarAluno("João", 4, 7.5);
        aluno.adicionarAluno("Maria", 5, 8.5);
        aluno.adicionarAluno("Carlos", 6, 10);
        aluno.adicionarAluno("Roberto", 7, 7.5);
        aluno.exibirAlunos();

        System.out.println(aluno.exibirAlunosPorNome());
        System.out.println(aluno.exibirAlunosPorNota());

        aluno.removerAluno(6);

        aluno.exibirAlunos();

    }
}

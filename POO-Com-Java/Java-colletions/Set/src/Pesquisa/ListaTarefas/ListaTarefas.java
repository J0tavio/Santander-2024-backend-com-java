package Pesquisa.ListaTarefas;

import java.util.HashSet;
import java.util.Set;

public class ListaTarefas {
    Set<Tarefa> tarefaSet;

    public ListaTarefas() {
        this.tarefaSet = new HashSet<>();
    }

    public void adicionarTarefa(String descricao) {
        this.tarefaSet.add(new Tarefa(descricao));
    }

    public void removerTarefa(String descricao) {
        Tarefa tarefaRemover = null;
        for (Tarefa t : this.tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                tarefaRemover = t;
            }
        }
        this.tarefaSet.remove(tarefaRemover);
    }

    public void exibirTarefas() {
        System.out.println(this.tarefaSet);
    }

    public void contarTarefas() {
        System.out.println("\nQuantidade de tarefa(s): " + this.tarefaSet.size() + "\n");
    }

    public void obterTarefasConcluidas() {
        Set<Tarefa> tarefasConcluidas = new HashSet<>();
        for (Tarefa t : this.tarefaSet) {
            if (t.isConcluida()) {
                tarefasConcluidas.add(t);
            }
        }
        System.out.println("\nTarefas concluídas: " + tarefasConcluidas + "\n");
    }


    public void obterTarefasPendentes() {
        Set<Tarefa> tarefasPendentes = new HashSet<>();
        for (Tarefa t : this.tarefaSet) {
            if (!t.isConcluida()) {
                tarefasPendentes.add(t);
            }
        }
        System.out.println("\nTarefas pendentes: " + tarefasPendentes + "\n");
    }

    public Tarefa marcarTarefaConcluida(String descricao) {
        Tarefa tarefaConcluida = null;
        for (Tarefa t : this.tarefaSet) {
            if (t.getDescricao().equalsIgnoreCase(descricao)) {
                t.setConcluida(true);
                tarefaConcluida = t;
            }
        }
        return tarefaConcluida;
    }

// COMENTEI ESSE MÉTODO, POIS O OBJETO TAREFA JÁ INICIA PENDENTE.
//    public Tarefa marcarTarefaPendente(String descricao) {
//        Tarefa tarefaPendente = null;
//        for (Tarefa t : this.tarefaSet) {
//            if (t.getDescricao().equalsIgnoreCase(descricao)) {
//                t.setConcluida(false);
//                tarefaPendente = t;
//            }
//        }
//        return tarefaPendente;
//    }

    public void limparListaTarefas() {
        tarefaSet.clear();
    }

    public static void main(String[] args) {
        ListaTarefas listaTarefas = new ListaTarefas();

        listaTarefas.adicionarTarefa("Jogar lixo");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Estudar");
        listaTarefas.adicionarTarefa("Academia");
        listaTarefas.adicionarTarefa("Lavar os pratos");
        listaTarefas.adicionarTarefa("Passear com o cachorro");
        listaTarefas.adicionarTarefa("Comprar tomate");
        listaTarefas.exibirTarefas();

        listaTarefas.contarTarefas();

        listaTarefas.removerTarefa("Comprar tomate");
        listaTarefas.exibirTarefas();

        listaTarefas.marcarTarefaConcluida("Jogar lixo");
        listaTarefas.marcarTarefaConcluida("Lavar os pratos");
        listaTarefas.obterTarefasConcluidas();
        listaTarefas.obterTarefasPendentes();

        listaTarefas.limparListaTarefas();
        listaTarefas.exibirTarefas();


    }
}

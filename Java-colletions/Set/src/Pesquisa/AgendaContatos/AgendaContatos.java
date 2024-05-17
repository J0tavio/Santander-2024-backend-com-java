package Pesquisa.AgendaContatos;

import java.util.HashSet;
import java.util.Set;

public class AgendaContatos {
    Set<Contato> contatoSet;

    public AgendaContatos() {
        this.contatoSet = new HashSet<>();
    }

    public void adicionarContato(String nome, int numero) {
        this.contatoSet.add(new Contato(nome, numero));
    }

    // Método Novo
    public void removerContatoPorNome(String nome) {
        Contato contatoParaRemover = null;
        for (Contato c : this.contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                contatoParaRemover = c;
                break;
            }
        }
        this.contatoSet.remove(contatoParaRemover);
    }

    public void exibirContatos() {
        System.out.println("Contatos da agenda: " + contatoSet);
    }

    public Set<Contato> pesquisarPorNome(String nome) {
        Set<Contato> contatosPesquisar = new HashSet<>();
        for (Contato c : this.contatoSet) {
            if (c.getNome().startsWith(nome)) {
                contatosPesquisar.add(c);
            }
        }
        return contatosPesquisar;
    }

    public Contato atualizarNumeroContato(String nome, int novoNumero) {
        Contato contatoAtualizado = null;
        for (Contato c : this.contatoSet) {
            if (c.getNome().equalsIgnoreCase(nome)) {
                c.setNumero(novoNumero);
                contatoAtualizado = c;
                break;
            }
        }
        return contatoAtualizado;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João Otávio", 40028922);
        agendaContatos.adicionarContato("Carlos", 50501960);
        agendaContatos.adicionarContato("Fernando Jr", 92345678);
        agendaContatos.adicionarContato("Gabriel", 93224569);
        agendaContatos.adicionarContato("Julia", 90901161);

        agendaContatos.exibirContatos();

        System.out.println("\n" + agendaContatos.pesquisarPorNome("J") + "\n");

        agendaContatos.atualizarNumeroContato("Julia", 70708989);
        agendaContatos.exibirContatos();

        agendaContatos.removerContatoPorNome("Carlos");
        System.out.println(" ");
        agendaContatos.exibirContatos();

    }
}

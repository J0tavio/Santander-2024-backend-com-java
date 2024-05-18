package OperacoesBasicas.AgendaContatos;

import java.util.HashMap;
import java.util.Map;

public class AgendaContatos {
    private Map<String, Integer> contatosMap;

    public AgendaContatos() {
        this.contatosMap = new HashMap<>();
    }

    public void adicionarContato(String nome, Integer telefone) {
        this.contatosMap.put(nome, telefone);
    }

    public void removerContato(String nome) {
        if (!this.contatosMap.isEmpty()) {
            this.contatosMap.remove(nome);
        } else {
            throw new RuntimeException("O map está vazio!");
        }
    }

    public void exibirContatos() {
        System.out.println(this.contatosMap);
    }

    public Integer pesquisarPorNome(String nome) {
//        Integer pesquisaNome = null;
        if (!this.contatosMap.isEmpty()) {
//            pesquisaNome = this.contatosMap.get(nome);
            return this.contatosMap.get(nome);
        } else {
            throw new RuntimeException("O map está vazio");
        }
//        return pesquisaNome;
    }

    public static void main(String[] args) {
        AgendaContatos agendaContatos = new AgendaContatos();

        agendaContatos.adicionarContato("João", 40028922);
        agendaContatos.adicionarContato("Gabriel", 92345678);
        agendaContatos.adicionarContato("Maria", 34461861);
        agendaContatos.adicionarContato("Ângela", 90904545);
        agendaContatos.exibirContatos();

        agendaContatos.removerContato("Ângela");
        agendaContatos.exibirContatos();


        System.out.println(agendaContatos.pesquisarPorNome("João"));


    }

}

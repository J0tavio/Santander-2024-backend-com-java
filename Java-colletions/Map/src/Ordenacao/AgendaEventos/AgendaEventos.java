package Ordenacao.AgendaEventos;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class AgendaEventos {
    private Map<LocalDate, Evento> agendaMap;

    public AgendaEventos() {
        this.agendaMap = new HashMap<>();
    }

    public void adicionarEvento(LocalDate data, String nome, String atracao) {
        this.agendaMap.put(data, new Evento(nome, atracao));
    }

    public void exibirAgenda() {
        System.out.println(this.agendaMap);
    }

    public void obterProximoEvento() {
    }

    public static void main(String[] args) {

    }
}

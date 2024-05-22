package Pesquisa.AgendaEventos;

public class Evento {
    private String nomeEvento;
    private String nomeAtracao;

    public Evento(String nomeAtracao, String nomeEvento) {
        this.nomeAtracao = nomeAtracao;
        this.nomeEvento = nomeEvento;
    }

    public String getNomeEvento() {
        return nomeEvento;
    }

    public String getNomeAtracao() {
        return nomeAtracao;
    }
}

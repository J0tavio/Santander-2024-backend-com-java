package iphone;

import interfaces.AparelhoTelefonico;
import interfaces.NavegadorInternet;
import interfaces.ReprodutorMusical;

public class Iphone implements ReprodutorMusical, NavegadorInternet, AparelhoTelefonico {
    private boolean iphoneLigado = false;

    public boolean ligarIphone() {
        this.iphoneLigado = true;
        System.out.println("Ligando iphone");
        return this.iphoneLigado;
    }

    public boolean desligarIphone() {
        this.iphoneLigado = false;
        System.out.println("Desligando iphone");
        return this.iphoneLigado;
    }

    @Override
    public void ligar() {
        System.out.println("Realizando uma Ligação");
    }

    @Override
    public void atender() {
        System.out.println("Atendendo uma Ligação");
    }

    @Override
    public void inciarCorreioVoz() {
        System.out.println("Gravando mensagem");
    }

    @Override
    public void exibirPagina() {
        System.out.println("Exibindo página na Web");
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("Adicionando nova página da Web");
    }

    @Override
    public void atualizarPagina() {
        System.out.println("Atualizando página da Web");
    }

    @Override
    public void tocar() {
        System.out.println("Tocando música");
    }

    @Override
    public void pausar() {
        System.out.println("Pausando música");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Escolhendo música");
    }

    public boolean isIphoneLigado() {
        return iphoneLigado;
    }

    public void setIphoneLigado(boolean iphoneLigado) {
        this.iphoneLigado = iphoneLigado;
    }
}

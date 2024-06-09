package org.example;

import java.util.logging.Logger;

public class BancoDeDados {
    private static final Logger LOGGER = Logger.getLogger(BancoDeDados.class.getName());

    public static void iniciarConexao() {
        LOGGER.info("Iniciando conexão");
    }

    public static void finalizarConexao() {
        LOGGER.info("Finalizando conexão");
    }

    public static void inserirDados(Pessoa pessoa) {
        // insere pessoa no DB
        LOGGER.info("Inseriu dados");
    }

    public static void removeDados(Pessoa pessoa) {
        // insere pessoa no DB
        LOGGER.info("Removeu dados");
    }
}

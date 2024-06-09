package org.example;

import org.junit.jupiter.api.*;

import java.time.LocalDateTime;

public class ConsultarDadosPessoaTest {

    @BeforeAll
    static void configurarConnexao() {
        BancoDeDados.iniciarConexao();
    }

    @BeforeEach
    void inseriDadosParaTeste() {
        BancoDeDados.inserirDados(new Pessoa("Joao", LocalDateTime.of(2000, 6, 1, 12, 0)));
    }

    @AfterEach
    void removeDadosParaTeste() {
        BancoDeDados.removeDados(new Pessoa("Joao", LocalDateTime.of(2000, 6, 1, 12, 0)));
    }

    @Test
    void validarDadosDeRetorno() {
        Assertions.assertTrue(true);
    }

    @Test
    void validarDadosDeRetorno2() {
        Assertions.assertNull(null);
    }

    @AfterAll
    static void finalizarConexao() {
        BancoDeDados.finalizarConexao();
    }
}

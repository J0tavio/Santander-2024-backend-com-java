package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class PessoaTest {

    @Test
    void deveCalcularIdadeCorretamente() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertEquals(24, jessica.getIdade());
    }

    @Test
    void deveRetornarSeEMaiorDeIdade() {
        Pessoa jessica = new Pessoa("Jessica", LocalDateTime.of(2000, 1, 1, 15, 0, 0));
        Assertions.assertTrue(jessica.eMaiorDeIdade());

        Pessoa joao = new Pessoa("Joao", LocalDateTime.now());
        Assertions.assertFalse(joao.eMaiorDeIdade());
    }
}

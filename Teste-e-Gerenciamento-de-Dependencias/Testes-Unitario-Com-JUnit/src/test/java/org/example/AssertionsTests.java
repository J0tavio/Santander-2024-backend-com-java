package org.example;

import org.junit.jupiter.api.Test;
import java.time.LocalDateTime;
import static org.junit.jupiter.api.Assertions.*;

public class AssertionsTests {

    @Test
    void validarLancamentos() {
        int[] primeiroLancamento = {1, 2, 3, 5, 9};
        int[] segundoLancamento = {1, 2, 3, 5, 9};

        assertArrayEquals(primeiroLancamento, segundoLancamento);
    }

    @Test
    void validarSeObjetoEstaNulo() {
        Pessoa pessoa = null;

        assertNull(pessoa);

        pessoa = new Pessoa("Luciano", LocalDateTime.now());

        assertNotNull(pessoa);
    }
}

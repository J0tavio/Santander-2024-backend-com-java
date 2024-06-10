package org.example.Mockando;

import org.example.MockExemplo.ApiCorreios;
import org.example.MockExemplo.CadastrarPessoa;
import org.example.MockExemplo.DadosLocalizacao;
import org.example.MockExemplo.Pessoa;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

import java.time.LocalDate;

@ExtendWith(MockitoExtension.class)
public class CadastrarPessoaTest {


    @Mock
    private ApiCorreios apiCorreios;

    @InjectMocks
    private CadastrarPessoa cadastrarPessoa;

    @Test
    void validarDadosCadastro() {
        DadosLocalizacao dadosLocalizacao = new DadosLocalizacao("RJ", "Rio de Janeiro", "rua 1", "Hotel", "Copacabana");
        Mockito.when(apiCorreios.buscarComBaseNoCep("4002")).thenReturn(dadosLocalizacao);
        Pessoa pessoa = cadastrarPessoa.cadastrarPessoa("Joao", "150", LocalDate.now(), "4002");

        assertEquals("Joao", pessoa.getNome());
        assertEquals("150", pessoa.getDocumento());
        assertEquals("RJ", pessoa.getEndereco().getUf());
        assertEquals("Hotel", pessoa.getEndereco().getComplemento());
    }
}

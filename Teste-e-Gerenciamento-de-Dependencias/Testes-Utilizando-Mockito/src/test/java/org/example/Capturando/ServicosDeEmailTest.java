package org.example.Capturando;

import org.example.CapturandoArgumentosExemplo.Email;
import org.example.CapturandoArgumentosExemplo.Formato;
import org.example.CapturandoArgumentosExemplo.PlataformaDeEnvio;
import org.example.CapturandoArgumentosExemplo.ServicoEnvioEmail;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.*;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class ServicosDeEmailTest {

    @Mock
    private PlataformaDeEnvio plataformaDeEnvio;
    @InjectMocks
    private ServicoEnvioEmail servicoEnvioEmail;
    @Captor
    private ArgumentCaptor<Email> emailArgumentCaptor;

    @Test
    void validaSeEmailEstaComDadosCorretos() {
        String enderecoEmail = "usuario@test.com";
        String mensagem = "Olá, mundo test mensagem";
        boolean eFormatoHTML = false;

        servicoEnvioEmail.enviaEmail(enderecoEmail, mensagem, eFormatoHTML);

        Mockito.verify(plataformaDeEnvio).enviaEmail(emailArgumentCaptor.capture());

        Email emailCapturado = emailArgumentCaptor.getValue();

        Assertions.assertEquals(enderecoEmail, emailCapturado.getEnderecoEmail());
        Assertions.assertEquals(mensagem, emailCapturado.getMensagem());
        Assertions.assertEquals(Formato.TEXTO, emailCapturado.getFormato());
    }
}

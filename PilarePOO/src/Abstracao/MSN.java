package Abstracao;

public class MSN extends ServicoMensagemInstantanea{

	@Override
	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem pelo MSN");
		salvarHistoricoMensagem();
	}

	@Override
	public void receberMensagem() {
		System.out.println("Recebendo mensagem pelo MSN");
	}

	public void validarConectadoInternet() {
		System.out.println("Verificando internet MSN");

	}

	public void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico de mensagens MSN");
	}

}

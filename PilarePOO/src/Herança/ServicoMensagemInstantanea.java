package Herança;

public class ServicoMensagemInstantanea {

	public void enviarMensagem() {
		validarConectadoInternet();
		System.out.println("Enviando mensagem");
		salvarHistoricoMensagem();
	}

	public void receberMensagem() {
		System.out.println("Recebendo Mensagem");

	}

	public void validarConectadoInternet() {
		System.out.println("Validando internet");
	}

	public void salvarHistoricoMensagem() {
		System.out.println("Salvando histórico de mensagens");
	}
}

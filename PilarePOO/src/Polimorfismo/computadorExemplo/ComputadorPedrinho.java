package Polimorfismos.computadorExemplo;


public class ComputadorPedrinho {

	public static void main(String[] args) {
		ServicoMensagemInstantanea smi = null;

		String appEscolhido = "msn";

		if (appEscolhido.equals("msn")) {
			smi = new MSN();
		} else if (appEscolhido.equals("fbm")) {
			smi = new Facebook();
		} else if (appEscolhido.equals("tlg")) {
			smi = new Telegram();
		}

		smi.enviarMensagem();
		smi.receberMensagem();
	}

}

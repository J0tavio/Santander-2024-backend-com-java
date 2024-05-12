package Abstracao;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		MSN msn = new MSN();
		Facebook fcb = new Facebook();
		Telegram tlg = new Telegram();

		msn.enviarMensagem();
		msn.receberMensagem();

		fcb.enviarMensagem();
		fcb.receberMensagem();

		tlg.enviarMensagem();
		tlg.receberMensagem();
	}

}

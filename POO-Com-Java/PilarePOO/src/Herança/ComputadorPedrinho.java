package Herança;

public class ComputadorPedrinho {

	public static void main(String[] args) {
		MSNMessenger msn = new MSNMessenger();
		FacebookMessenger fcb = new FacebookMessenger();
		Telegram tlg = new Telegram();

		System.out.println("MSN");
		msn.enviarMensagem();
		msn.receberMensagem();

		System.out.println("\nFacebook");
		fcb.enviarMensagem();
		fcb.receberMensagem();

		System.out.println("\nTelegram");
		tlg.enviarMensagem();
		tlg.receberMensagem();

	}

}

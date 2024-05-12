
public abstract class ServicoMensagemInstantanea {

	public abstract void enviarMensagem();

	public abstract void receberMensagem();
	
	//somente os filhos conhecem esse metódo
	protected void validarConectadoInternet() {
		System.out.println("Validando se está conectado a internet");
	}

}

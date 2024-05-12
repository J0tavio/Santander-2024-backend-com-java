package Encapsulamento;

public class Carro extends Veiculo{

	@Override
	public void ligar() {
		System.out.println("Carro ligado");
		confereCambio();
		confereCombustivel();
	}

	private void confereCombustivel() {
		System.out.println("Conferindo combustivel");
	}

	private void confereCambio() {
		System.out.println("Conferindo cambio em b");
	}
}

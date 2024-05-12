package Encapsulamento;

public class Autodromo {
	public static void main(String[] args) {
		Carro jeep = new Carro();
		jeep.ligar();
        // jeep.setChassi("4040");

		Moto Z400 = new Moto();
		// Z400.setChassi("5555");

		Veiculo coringa = jeep;
		jeep.ligar();
	}
}

package pacote;

import java.util.Iterator;

public class SistemaIBGE {

	public static void main(String[] args) {

		/*
		 * for (EstadoBrasileiro i : EstadoBrasileiro.values()) {
		 * System.out.println(i.getSigla() + " - " + i.getNome()); }
		 */

		EstadoBrasileiro eb = EstadoBrasileiro.PIAUI;

		System.out.println(eb.getNome());
		System.out.println(eb.getSigla());
		System.out.println(eb.getIbge());

	}

}

package ejercicio3;

import java.io.IOException;

public class Main {

	public static void main(String[] args) {
		Dividir dividir = new Dividir();
		try {
			dividir.darValorDividendo();
		}
		catch (IOException e) {
			System.out.println(e.getMessage());
		}
		dividir.darValorDivisor();
		dividir.dividir();
	}

}

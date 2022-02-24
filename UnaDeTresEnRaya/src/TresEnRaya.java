import java.io.IOException;
import java.util.Scanner;

public class TresEnRaya {
	private String [][] tresEnRaya;
	private String jugador;
	Scanner teclado = new Scanner(System.in);
	
	TresEnRaya(){
		tresEnRaya = new String [3][3];
	}
	public String elegirJugador(int contador) {
		if ( contador % 2 == 0) {
			jugador = "X";
		}else {
			jugador = "O";
		}
		return jugador;
	}
	public int elegirPosicion() throws IOException {
		System.out.println("¿Que posición quiere elegir?, es del 1 al 9");
		boolean error = false;
		int posicion;
		posicion = teclado.nextInt();
		if ( posicion > 0 && posicion <= 9 ) {
			error = false;
		}else {
			error = true;
		}
		if ( error ) {
			throw new IOException ("Mira que te he dicho que es del 1 al 9, tonto que eres tonto");
		}
		return posicion;
	}

	void darValorALaPosicion() {
		boolean error = true;
		boolean posicionOcupada;
		int posicion = 0;
		int contador = 0;
		String jugador = elegirJugador(contador);
		while (error) {
			try {
				posicion = elegirPosicion() - 1;
				error = false;
			}
			catch (IOException e) {
				System.out.println(e.getMessage());
				error = true;
			}
		}
		if ( posicion == 0 || posicion == 1 || posicion == 2 ) {
			if (tresEnRaya [0][posicion] == "") {
				tresEnRaya[0][posicion] = jugador;
			}else {
				posicionOcupada = true;
				System.out.println("Error posición ocupada");
			}
				
		}else if ( posicion == 3 || posicion == 4 || posicion == 5 ) {
			if (tresEnRaya [0][posicion - 3] == "") {
				tresEnRaya[0][posicion - 3] = jugador;
			}else {
				posicionOcupada = true;
				System.out.println("Error posición ocupada");
			}
				
		}else if ( posicion == 0 || posicion == 1 || posicion == 2 ) {
			if (tresEnRaya [0][posicion - 6] == "") {
				tresEnRaya[0][posicion - 6] = jugador;
			}else {
				posicionOcupada = true;
				System.out.println("Error posición ocupada");
			}
				
		}
		
	
		
		
	}
}

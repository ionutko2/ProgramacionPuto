package ejercicio3;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.io.*;
public class Dividir {
	private int divisor;
	private String dividendo;
	private int dividir;
	private boolean error = false;
	private boolean error1 = false;
	Scanner teclado = new Scanner(System.in);
	
	Dividir(){
		divisor = 0;
		dividendo = "";
		dividir = 0;
	}
	public boolean getError() {
		return error;
	}	
	void darValorDividendo() throws IOException {
		System.out.println("Elija el valor del dividendo");
		dividendo = teclado.nextLine();
		for ( int i = 0 ; i < dividendo.length() && error != true ; i++ ) {
			if ( dividendo.charAt(i) >= '0' && dividendo.charAt(i) <= '9' || dividendo.charAt(0) == '-' && dividendo.length() > 1) {
				error = false;
			}else {
				error = true;
			}
		}
		if ( error == true ) {
			throw new IOException("Si es que te daba con la bara hasta partirte la espalda");
		}
	}
	void darValorDivisor() {
		System.out.println("Elija el valor del divisor");
		try {
			divisor = teclado.nextInt();
		}
		catch (InputMismatchException e1) {
			System.out.println("Si es que te daba con la bara hasta partirte la espaldax2");
			error1 = true;
		}
		
	}
	void dividir(){
		if ( error1 ) {
			dividir = Integer.parseInt(dividendo)/divisor;
			System.out.println(dividir);
			
		}
		else {
			try {
					dividir = Integer.parseInt(dividendo)/divisor;
					System.out.println(dividir);
				}
				catch (ArithmeticException e) {
					System.out.println("A ver alma de cántaro, ¿cómo coño vas a dividir entre cero?");
				}
			
			}
		}
}


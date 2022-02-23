package Siete;

public class Prueba {
	public static void main (String [] args) {
		HeredaAbstracta objetoHA = new HeredaAbstracta();
		//Me ejecuta antes el constructor padre y despues el hijo
		Interfaz interfaz;
		interfaz = new Interfaz();
		// Me da error el segundo argumento
		Abstracta abstracta;
		abstracta = new Abstracta();
		// Me da error el segundo argumento
		Abstracta objetomezcla = new HeredaAbstracta();
		System.out.println();objetomezcla.num1
	}	
}

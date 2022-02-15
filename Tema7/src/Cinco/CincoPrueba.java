package Cinco;

public class CincoPrueba extends Cinco {

	public static void main(String[] args) {
		/* Cinco ejercicio5 = new Cinco();
		 no se puede crear un objeto de una clase abstracta*/
		/* abstract int suma = 0; 
			no se puede crear un atributo con el modificador abstract*/
		 

	}
	int multiplicacion(int i, int j) {
		int multiplicacion;
		multiplicacion = i * j;
		return multiplicacion;
	}
	
	/*int resta(int i, int j) {
		int resta;
		resta = i - j;
		return 0;
		al poner CincoPrueba como una clase heredada de Cinco me obliga 
		a declarar el metodo resta */
	}

}

package Siete;

public class HeredaAbstracta extends Abstracta {
	int num1,num2;

	HeredaAbstracta(){
		System.out.println("Hola");
	}//protected puesto para el ej 12
	protected void resta() {
		// dice que no tiene sentido que en la clase padre e lmetodo sea publico y aqui protected
	}
}

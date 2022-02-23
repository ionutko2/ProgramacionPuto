package Siete;

public abstract class Abstracta {
	int num1,num2; // me deja cualquier tipo de modificador
	
	Abstracta(){
		System.out.println("Buenas");
	}
	void suma(){
		// me permite usar todos los modificadores
	}
	// El public lo he pusto para el ej 12
	public abstract void resta(); // no me permite utilizar el modificador private
}


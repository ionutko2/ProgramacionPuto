package Siete;

public interface Interfaz {
	Interfaz(){
		// Las interfaces no pueden tener constructores
	}
	int num1 = 0,num2 = 0; /* Me obliga a darles un valor inicial
	no me permite utilizar los modificadores de protected y private*/ 
	
	void suma(){
		// aunque no tenga puesto el abstract lo trata com un metodo abtracto
	}
	private abstract void resta(); /* no me permite utilizar el modificador private
	ni el modificador protected*/
}

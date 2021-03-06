package Uno;
import java.util.Scanner;
/**
 * Escribe un programa que pida los datos de una serie de empleados que no son jefes, tantos
como el usuario indique. Tambi?n hay que pedir los datos de una serie de jefes que son, al
mismo tiempo, empleados, tantos como el usuario indique. Una vez insertados todos los
datos, hay que visualizarlos.
De los empleados nos interesa: nombre y sueldo.
De los jefes nos interesa: nombre, sueldo, t?tulo y nombre del departamento del que es jefe.
 * @author ionut
 *
 */
public class Empleado {
	String nombre;
	int sueldo;
	
	Empleado(){
		nombre = "";
		sueldo = 0;
	}
	/**
	 * Pedir los datos del empleado
	 */
	void pedirDatos() {
		Scanner teclado = new Scanner(System.in);
		System.out.println("Escriba el nombre");
		nombre = teclado.nextLine();
		System.out.println("Escriba el sueldo");
		sueldo = teclado.nextInt();
	}
	/**
	 * imprimir los datos del empleado
	 */
	void imprimirDatos() {
		System.out.print("Nombre: " + nombre + " Sueldo: " + sueldo);
	}
}


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
public class Jefe extends Empleado{
	String titulo;
	String departamento;
	Jefe(){
		nombre = "";
		sueldo = 0;
		titulo = "";
		departamento = "";
	}
	/**
	 * Pedir los datos del jefe (que son los datos del empleado a?adiendole t?tulo y departamento
	 */
	void pedirDatos() {
		Scanner teclado = new Scanner(System.in);
		super.pedirDatos();
		System.out.println("Escriba que t?tulo tiene");
		titulo = teclado.nextLine();
		System.out.println("Escriba de que departamento es jefe");
		departamento = teclado.nextLine();
	}
	void imprimirDatos() {
		super.imprimirDatos();
		System.out.println(" T?tulo: " + titulo + " Departamento: " + departamento);
	}
}

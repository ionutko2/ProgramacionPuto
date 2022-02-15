package Seis;

public class Jefe extends Empleado /*No le permite heredarla debido al modificador 
final de la clase Empleado*/ {
	void pedirDatos(){
		/* no me permite crear un método con el mismo nombre 
		de un método de la clase heredada Empleado*/ 
	}
}

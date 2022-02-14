package visibilidad1;
import visibilidad2.EmpleadoEspecial;
/**
 * Ejercicio 2 parte 1
 * Al usar super en el constructor Jefe me aparecen estas tres variables
 * Ejercicio 3 parte 3
 * Al usar nombre_Objeto_tipo_Empleado_Especial solo me aparece una variable
 * @author ionut
 *
 */
public class Jefe extends Empleado{
	EmpleadoEspecial nombre_Objeto_tipo_Empleado_Especial = new EmpleadoEspecial();
	public Jefe(){
		super.direccion = "";
		super.edad = 0;
		super.nombre = "";
		nombre_Objeto_tipo_Empleado_Especial.nombreEs = "";
	}
}
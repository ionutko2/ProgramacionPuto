package Uno;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		Empleado [] empleado;
		Jefe [] jefe;
		int emp, jef;
		System.out.println("�Cu�ntos empleados hay?");
		emp = teclado.nextInt();
		empleado = new Empleado [emp];
		System.out.println("�Cu�tos jefes hay?");
		jef = teclado.nextInt();
		jefe = new Jefe [jef];
		for(int i = 0; i < emp; i++) {
			System.out.println("Datos de empleado:");
			empleado[i] = new Empleado();
			empleado[i].pedirDatos();
		}
		for(int i = 0; i < emp; i++) {
			System.out.println("Datos de jefe:");
			
			jefe[i] = new Jefe();
			jefe[i].pedirDatos();
		}
		for(int i = 0; i < emp; i++) {
			empleado[i].imprimirDatos();
			System.out.println("");
		}
		for(int i = 0; i < emp; i++) {
			jefe[i].imprimirDatos();
		}
	}

}

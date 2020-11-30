package Ejercicios_UD3_Tanda1;

import java.util.Scanner;

public class Ejercicio_3_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		String apellidos;
		Scanner teclado;
		teclado= new Scanner(System.in);
		System.out.print("Introducir nombre: ");
		nombre=teclado.nextLine();
		System.out.print("Introducir apellidos: ");
		apellidos=teclado.nextLine();
		System.out.println("\nSu nombre es: "+nombre);
		System.out.println("Sus apellidos son: "+apellidos);
		System.out.println("Bienvenido "+nombre+" "+apellidos);
		teclado.close();
	}

}

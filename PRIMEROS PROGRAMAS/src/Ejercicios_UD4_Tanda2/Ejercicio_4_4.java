package Ejercicios_UD4_Tanda2;

import java.util.Scanner;

public class Ejercicio_4_4 {
	
	public static String l�nea (int cantidad) {
		int contador;
		String ast= "*";
		for(contador=1; contador<cantidad; contador++) {
			ast+="*";
		}
		return ast;
	}
	
	public static void main(String[] args) {
		int cantidad;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el n� de * de la l�nea: ");
		cantidad=teclado.nextInt();
		System.out.print(l�nea(cantidad));
	}
}

package Ejercicios_UD4_Tanda2;

import java.util.Scanner;

public class Ejercicio_4_4 {
	
	public static String línea (int cantidad) {
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
		System.out.print("Introduzca el nº de * de la línea: ");
		cantidad=teclado.nextInt();
		System.out.print(línea(cantidad));
	}
}

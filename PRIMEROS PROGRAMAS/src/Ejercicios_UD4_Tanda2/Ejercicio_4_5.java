package Ejercicios_UD4_Tanda2;

import java.util.Scanner;

public class Ejercicio_4_5 {

	public static String pintasterisco(int columnas) {
		int contador_c;
		String ast= "*";
		for(contador_c=1; contador_c<columnas; contador_c++) {
			ast+="*";
		}
		return ast;
	}
	
	public static void main(String[] args) {
		int filas, columnas, contador_f;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el número de filas: ");
		filas=teclado.nextInt();
		System.out.print("Introduzca el número de columnas: ");
		columnas=teclado.nextInt();
		for(contador_f=0; contador_f<filas; contador_f++) {
			System.out.println(pintasterisco(columnas));
		}
	}
}

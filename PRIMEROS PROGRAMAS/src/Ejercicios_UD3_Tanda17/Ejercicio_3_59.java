package Ejercicios_UD3_Tanda17;

import java.util.Scanner;

public class Ejercicio_3_59 {

	public static void main(String[] args) {
		int num, filas, columnas=1, contador;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Introduzca el nº de filas: ");
		filas=teclado.nextInt();
		for(num=1; filas>=columnas; columnas++) {
			for(contador=0; contador<columnas; contador++) {
				System.out.print(num+" ");
				num++;
			}
			System.out.println();
		}
	}
}

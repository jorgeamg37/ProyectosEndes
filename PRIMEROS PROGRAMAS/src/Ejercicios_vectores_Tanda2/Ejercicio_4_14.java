/**
 * 
 */
package Ejercicios_vectores_Tanda2;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Jorge Antonio
 * Fecha: 11 ene. 2021
 * @version:
 */
public class Ejercicio_4_14 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 11 ene. 2021
	 * @version:
	 * @param args
	 */
	public static int random () {
		int valor;
		Random numAleatorio= new Random();
		valor=numAleatorio.nextInt(101);
		return valor;
	}
	public static void rellenarArray (int[] Array) {
		for(int posicion=0;posicion<Array.length; posicion++) {
			Array[posicion]=random();
		}
	}
	public static void visualizarArray(int[] Array) {
		int posicion;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca la posición del vector (0-9): ");
		posicion=teclado.nextInt();
		if(posicion>=10||posicion<0) {
			System.out.println("La posición debe estar entre 0 y 9");
		}
		else {
			System.out.println(Array[posicion]);
		}
	}
	public static void main(String[] args) {
		int [] Array=new int [10];
		rellenarArray(Array);
		visualizarArray(Array);
	}

}

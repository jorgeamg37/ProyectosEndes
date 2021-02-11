/**
 * 
 */
package Ejercicios_vectores_Tanda3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Jorge Antonio
 * Fecha: 13 ene. 2021
 * @version:
 */
public class Ejercicio_4_16 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 13 ene. 2021
	 * @version:
	 * @param args
	 */
	public static int random () {
		int valor;
		Random numAleatorio= new Random();
		valor=numAleatorio.nextInt(100)+1;
		return valor;
	}
	public static void rellenarArray (int[] Array) {
		for(int posicion=0;posicion<Array.length; posicion++) {
			Array[posicion]=random();
		}
	}
	public static void visualizarArray(int[] Array) {
		for(int posicion=0;posicion<Array.length; posicion++) {
			System.out.print(Array[posicion]+" ");
		}
		System.out.println();
	}
	public static void borrarElemento (int[] Array) {
		Scanner teclado=new Scanner(System.in);
		int indice;
		System.out.print("¿Qué elemento del Array desea borrar? Indique la posición de este (0-15): ");
		indice=teclado.nextInt();
		if(indice<0||indice>15) {
			System.out.println("La posición debe de estar entre 0 y 15.");
		}
		else {
			for(;indice<Array.length-1;indice++) {
				Array[indice]=Array[indice+1];
			}
			Array[indice]=0;
			for(indice=0;indice<Array.length; indice++) {
				System.out.print(Array[indice]+" ");
			}
		}
	}
	public static void main(String[] args) {
		int [] Array=new int[15];
		rellenarArray(Array);
		visualizarArray(Array);
		borrarElemento(Array);
	}
}
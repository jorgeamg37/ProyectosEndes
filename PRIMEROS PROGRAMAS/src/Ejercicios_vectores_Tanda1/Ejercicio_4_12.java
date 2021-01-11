/**
 * 
 */
package Ejercicios_vectores_Tanda1;

import java.util.*;

/**
 * @author Jorge Antonio
 * Fecha: 11 ene. 2021
 * @version:
 */
public class Ejercicio_4_12 {

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
	public static void main(String[] args) {
		int [] Array=new int[20];
		for(int posicion=0;posicion<Array.length; posicion++) {
			rellenarArray(Array);
			System.out.print(Array[posicion]+" ");
		}
	}
}

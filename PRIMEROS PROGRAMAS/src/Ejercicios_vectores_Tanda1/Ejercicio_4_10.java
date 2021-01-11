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
public class Ejercicio_4_10 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 11 ene. 2021
	 * @version:
	 * @param args
	 */
	public static void leerArray (int[] Array) {
		Random numAleatorio;
		int valor;
		numAleatorio=new Random();
		for(int posicion=0;posicion<Array.length; posicion++) {
			valor=numAleatorio.nextInt(10);
			Array[posicion]=valor;
		}
	}
	public static void visualizarArray(int[] Array) {
		for(int posicion=0;posicion<Array.length; posicion++) {
			System.out.print(Array[posicion]+" ");
		}
	}
	public static void main(String[] args) { 
		int [] Array1=new int [5];
		int [] Array2=new int [5];
		leerArray(Array1);
		visualizarArray(Array1);
		System.out.println();
		leerArray(Array2);
		visualizarArray(Array2);
	}

}

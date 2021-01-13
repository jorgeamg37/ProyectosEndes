/**
 * 
 */
package Ejercicios_vectores_Tanda2;

import java.util.Random;

/**
 * @author Jorge Antonio
 * Fecha: 13 ene. 2021
 * @version:
 */
public class Ejercicio_4_15 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 13 ene. 2021
	 * @version: 1.0
	 * @param args
	 */
	public static int random () {
		int valor;
		Random numAleatorio= new Random();
		valor=numAleatorio.nextInt(2);
		return valor;
	}
	public static void rellenarArray (int[] Moneda) {
		for(int posicion=0;posicion<Moneda.length; posicion++) {
			Moneda[posicion]=random();
		}
	}
	public static int contarCaras (int[] Moneda, int cara) {
		for(int posicion=0;posicion<Moneda.length; posicion++) {
			if(Moneda[posicion]==1) {
				cara++;
			}
		}
		return cara;
	}
	public static void visualizarResultado (int [] Moneda, int cara) {
		System.out.println("Han salido "+contarCaras(Moneda, cara)+" caras y "+(100-contarCaras(Moneda, cara))+" cruces.");
	}
	public static void main(String[] args) {
		int [] Moneda=new int [100];
		int cara=0;
		rellenarArray(Moneda);
		visualizarResultado(Moneda, cara);
	}
}

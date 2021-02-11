/**
 * 
 */
package Prueba2;

import java.util.Random;

/**
 * @author Jorge Antonio
 * Fecha: 8 feb. 2021
 * @version:
 */
public class Ejercicio_2 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 8 feb. 2021
	 * @version: 1.0
	 * @param args
	 */
	public static int random () {
		int valor;
		Random numAleatorio=new Random();
		valor=numAleatorio.nextInt(100);
		return valor;
	}
	public static void CrearVector (int vector []) {
		for(int posicion=0; posicion<vector.length; posicion++) {
			vector[posicion]=random();
		}
	}
	public static void ModificarVector (int vector [], int [] vectorModificado) {
		int posicion1=0, posicion2;
		for(posicion2=0; posicion2<vector.length;) {
			if(vector[posicion2]%2!=0) {
				vectorModificado[posicion1]=vector[posicion2];
				posicion2++;
				posicion1++;
			}
			else {
				posicion2++;
			}
		}
		for(posicion2=9; posicion2>=0;) {
			if(vector[posicion2]%2==0) {
				vectorModificado[posicion1]=vector[posicion2];
				posicion2--;
				posicion1++;
			}
			else {
				posicion2--;
			}
		}
	}
	public static void ImprimirVector (int vector []) {
		for(int posicion1=0; posicion1<vector.length; posicion1++) {
			System.out.print(vector[posicion1]+" ");
		}
	}
	public static void ImprimirVectorModificado (int vectorModificado []) {
		for(int posicion1=0; posicion1<vectorModificado.length; posicion1++) {
			System.out.print(vectorModificado[posicion1]+" ");
		}
	}
	public static void main(String[] args) {
		int [] vector=new int [10];
		int [] vectorModificado=new int[10];
		CrearVector(vector);
		ImprimirVector(vector);
		System.out.println();
		ModificarVector(vector, vectorModificado);
		ImprimirVectorModificado(vectorModificado);
	}
}
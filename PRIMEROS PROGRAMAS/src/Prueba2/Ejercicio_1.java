package Prueba2;

import java.util.*;

/**
 * @author Jorge Antonio
 * Fecha: 8 feb. 2021
 * @version:
 */
public class Ejercicio_1 {

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
	public static void mCrearVector (int vector1 [], int vector2 []) {
		for(int posicion1=0; posicion1<vector1.length; posicion1++) {
			vector1[posicion1]=random();
		}
		for(int posicion2=0; posicion2<vector2.length; posicion2++) {
			vector2[posicion2]=random();
		}
	}
	public static void mImprimirVector (int vector1 [], int vector2 []) {
		for(int posicion1=0; posicion1<vector1.length; posicion1++) {
			System.out.print(vector1[posicion1]+" ");
		}
		System.out.println();
		for(int posicion2=0; posicion2<vector2.length; posicion2++) {
			System.out.print(vector2[posicion2]+" ");
		}
	}
	public static void mMezclarVector (int vector1 [], int vector2[], int vectorMezcla[]) {
		int posicion1=0, posicion2=0, posicion3=0;
		while(posicion3<vectorMezcla.length) {
			vectorMezcla[posicion3]=vector1[posicion1];
			posicion1++;
			posicion3++;
			vectorMezcla[posicion3]=vector2[posicion2];
			posicion2++;
			posicion3++;
		}
	}
	public static void mImprimirVectorMezcla (int vectorMezcla []) {
		System.out.println("Vector mezcla:");
		for(int posicion=0; posicion<vectorMezcla.length; posicion++) {
			System.out.print(vectorMezcla[posicion]+" ");
		}
	}
	public static void main(String[] args) {
		int [] vector1=new int[5];
		int [] vector2=new int[5];
		int [] vectorMezcla=new int[10];
		mCrearVector(vector1, vector2);
		System.out.println("Vectores generados automáticamente:");
		mImprimirVector(vector1, vector2);
		System.out.println();
		mMezclarVector(vector1, vector2, vectorMezcla);
		mImprimirVectorMezcla(vectorMezcla);
	}
}
/**
 * 
 */
package Ejercicios_matrices_Tanda5;

import java.util.Random;

/**
 * @author Jorge Antonio
 * Fecha: 10 feb. 2021
 * @version:
 */
public class Ejercicio_4_34 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 10 feb. 2021
	 * @version: 1.0
	 * @param args
	 */
	public static int random () {
		int valor;
		Random numAleatorio=new Random();
		valor=numAleatorio.nextInt(10);
		return valor;
	}
	public static void rellenarMatriz (int [][] matrizOriginal, int filas, int columnas) {
		for(int contador=0; contador<9; contador++) {
			matrizOriginal[filas][columnas]=random();
			if(columnas==2) {
				columnas=0;
				filas++;
			}
			else {
				columnas++;
			}
		}
	}
	public static void visualizarMatrizOriginal (int [][] matrizOriginal, int filas, int columnas) {
		System.out.println("Matriz Original:");
		for(int contador=0; contador<9; contador++) {
			System.out.print(matrizOriginal[filas][columnas]+" ");
			if(columnas==2) {
				columnas=0;
				filas++;
				System.out.println();
			}
			else {
				columnas++;
			}
		}
	}
	public static void rotarMatriz (int [][] matrizOriginal, int [][] matrizRotada) {
		int filasOr=0, columnasOr=0, filasRot=0, columnasRot=0;
		for(int contador=0; contador<9; contador++) {
			matrizRotada[filasRot][columnasRot]=matrizOriginal[2-filasOr][columnasOr];
			if(columnasOr==2) {
				columnasOr=0;
				filasOr++;
			}
			else {
				columnasOr++;
			}
			if(filasRot==2) {
				filasRot=0;
				columnasRot++;
			}
			else {
				filasRot++;
			}
		}
	}
	public static void visualizarMatrizRotada (int [][] matrizRotada, int filas, int columnas) {
		System.out.println("Matriz Rotada:");
		for(int contador=0; contador<9; contador++) {
			System.out.print(matrizRotada[filas][columnas]+" ");
			if(columnas==2) {
				columnas=0;
				filas++;
				System.out.println();
			}
			else {
				columnas++;
			}
		}
	}
	public static void main(String[] args) {
		int filas=0, columnas=0;
		int [][] matrizOriginal=new int [3] [3];
		int [][] matrizRotada=new int [3] [3];
		rellenarMatriz(matrizOriginal, filas, columnas);
		visualizarMatrizOriginal(matrizOriginal, filas, columnas);
		rotarMatriz(matrizOriginal, matrizRotada);
		visualizarMatrizRotada(matrizRotada, filas, columnas);
	}
}
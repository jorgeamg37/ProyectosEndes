/**
 * 
 */
package Examen_3;

import java.util.Random;

/**
 * @author Jorge Antonio
 * Fecha: 22 feb. 2021
 * @version:
 */
public class Ejercicio_1 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 22 feb. 2021
	 * @version: 1.0
	 * @param args
	 */
	public static int random () {
		int valor;
		Random numAleatorio=new Random();
		valor=numAleatorio.nextInt(10);
		return valor;
	}
	public static void generarMatriz (int [][] Matriz, int filas, int columnas, int num_filas, int num_columnas) {
		filas=0;
		columnas=0;
		for(int contador=0; contador<(num_filas*num_columnas);contador++) {
			Matriz[filas][columnas]=random();
			if(filas==3) {
				filas=0;
				columnas++;
			}
			else {
				filas++;
			}
		}
	}
	public static void generarVector (int [] Vector, int columnas) {
		columnas=0;
		for(int contador=0; contador<Vector.length; contador++) {
			Vector[columnas]=random();
			columnas++;
		}
	}
	public static void visualizarMatriz (int [][] Matriz, int filas, int columnas, int num_filas, int num_columnas) {
		filas=0;
		columnas=0;
		System.out.println("Matriz\n");
		for(int contador=0; contador<(num_filas*num_columnas);contador++) {
			System.out.print(Matriz[filas][columnas]+" ");
			if(columnas==4) {
				columnas=0;
				filas++;
				System.out.println();
			}
			else {
				columnas++;
			}
		}
	}
	public static void visualizarVector (int [] Vector, int columnas) {
		columnas=0;
		System.out.println("\nVector\n");
		for(int contador=0; contador<Vector.length; contador++) {
			System.out.print(Vector[columnas]+" ");
			columnas++;
		}
	}
	public static int [][] generarResultante (int [][] Matriz, int [] Vector, int filas, int columnas, int num_filas, int num_columnas) {
		filas=0;
		columnas=0;
		int [][] Resultante=new int [num_filas][num_columnas+1];
		for(int contador=0; contador<(num_filas*(num_columnas+1));contador++) {
			Resultante[filas][columnas]=Matriz[filas][columnas];
			if(filas==3) {
				if(columnas==4) {
					for(contador=0, filas=0, columnas++; contador<num_filas;contador++) {
						Resultante[filas][columnas]=Vector[contador];
						filas++;
					}
					break;
				}
				else {
					filas=0;
					columnas++;
				}
			}
			else {
				filas++;
			}
		}
		return Resultante;
	}
	public static void visualizarResultante (int [][] Resultante, int filas, int columnas, int num_filas, int num_columnas) {
		filas=0;
		columnas=0;
		System.out.println("\n\nResultante\n");
		for(int contador=0; contador<(num_filas*(num_columnas+1));contador++) {
			System.out.print(Resultante[filas][columnas]+" ");
			if(columnas==5) {
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
		final int num_filas=4, num_columnas=5;
		int [][] Matriz=new int [num_filas][num_columnas];
		int [] Vector=new int [num_filas];
		generarMatriz(Matriz, filas, columnas, num_filas, num_columnas);
		generarVector(Vector, columnas);
		visualizarMatriz(Matriz, filas, columnas, num_filas, num_columnas);
		visualizarVector(Vector, columnas);
		visualizarResultante(generarResultante(Matriz, Vector, filas, columnas, num_filas, num_columnas), filas, columnas, num_filas, num_columnas);
	}
}
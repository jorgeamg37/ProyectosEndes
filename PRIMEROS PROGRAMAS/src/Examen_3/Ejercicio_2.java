/**
 * 
 */
package Examen_3;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Jorge Antonio
 * Fecha: 22 feb. 2021
 * @version: 1.0
 */
public class Ejercicio_2 {

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
	public static void generarMatriz (int [][] Matriz, int filas, int columnas, int m) {
		filas=0;
		columnas=0;
		System.out.println("\nMatriz");
		for(int contador=0; contador<(m*m);contador++) {
			Matriz[filas][columnas]=random();
			if(filas==(m-1)) {
				filas=0;
				columnas++;
			}
			else {
				filas++;
			}
		}
	}
	public static void visualizarMatriz (int [][] Matriz, int filas, int columnas, int m) {
		filas=0;
		columnas=0;
		for(int contador=0; contador<(m*m);contador++) {
			System.out.print(Matriz[filas][columnas]+" ");
			if(columnas==m-1) {
				columnas=0;
				filas++;
				System.out.println();
			}
			else {
				columnas++;
			}
		}
	}
	public static void invertirDiagonal (int [][] Matriz, int filas, int columnas, int m) {
		filas=0;
		columnas=0;
		int num;
		System.out.println("\nMatriz con matriz diagonal invertida");
		for(int contador=0; contador<((m*m)/2);contador++) {
			if(filas==columnas) {
				num=Matriz[filas][columnas];
				Matriz[filas][columnas]=Matriz[(m-1)-filas][(m-1)-columnas];
				Matriz[(m-1)-filas][(m-1)-columnas]=num;
			}
			if(filas==(m-1)) {
				filas=0;
				columnas++;
			}
			else {
				filas++;
			}
		}
	}
	public static void main(String[] args) {
		int m, filas=0, columnas=0;
		Scanner teclado=new Scanner (System.in);
		System.out.print("Introduce el número de filas y columnas (m): ");
		m=teclado.nextInt();
		int [][] Matriz=new int [m][m];
		generarMatriz(Matriz, filas, columnas, m);
		visualizarMatriz(Matriz, filas, columnas, m);
		invertirDiagonal(Matriz, filas, columnas, m);
		visualizarMatriz(Matriz, filas, columnas, m);
	}
}
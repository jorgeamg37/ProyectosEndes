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
public class Ejercicio_4 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 22 feb. 2021
	 * @version: 1.0
	 * @param args
	 */
	public static int random () {
		int valor;
		Random numAleatorio=new Random();
		valor=numAleatorio.nextInt(4);
		return valor;
	}
	public static void generarMatriz (int [][] Matriz, int filas, int columnas, int m) {
		filas=0;
		columnas=0;
		for(int contador=0; contador<(m*m);contador++) {
			Matriz[filas][columnas]=random();
			if(columnas==(m-1)) {
				columnas=0;
				filas++;
			}
			else {
				columnas++;
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
	public static void comprobarDominante (int [][] Matriz, int filas, int columnas, int m) {
		filas=0;
		columnas=0;
		int suma=0, num=0;
		for(int contador=0; contador<(m*m);contador++) {
			if(columnas==(m-1)) {
				if(suma>num) {
					System.out.println("La matriz no es diagonalmente dominante por filas");
					break;
				}
				else if(filas==m-1){
					System.out.println("La matriz es diagonalmente dominante por filas");
				}
				columnas=0;
				filas++;
			}
			else if(filas!=columnas) {
				suma+=Matriz[filas][columnas];
				columnas++;
			}
			else {
				num=Matriz[filas][columnas];
				columnas++;
			}
		}
	}
	public static void main(String[] args) {
		int m=3, filas=0, columnas=0;
		int [][] Matriz=new int [m][m];
		generarMatriz(Matriz, filas, columnas, m);
		visualizarMatriz(Matriz, filas, columnas, m);
		comprobarDominante(Matriz, filas, columnas, m);
	}
}
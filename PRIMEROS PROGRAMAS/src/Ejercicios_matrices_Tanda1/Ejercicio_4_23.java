/**
 * 
 */
package Ejercicios_matrices_Tanda1;

import java.util.Scanner;

/**
 * @author Jorge Antonio
 * Fecha: 27 ene. 2021
 * @version:
 */
public class Ejercicio_4_23 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 27 ene. 2021
	 * @version:
	 * @param args
	 */
	public static void rellenarMatriz(int [][] Matriz, int filas, int columnas) {
		Scanner teclado=new Scanner(System.in);
		int num;
		for(int contador=0; contador<9;contador++) {
			System.out.print("Introduce el número de la posición "+filas+columnas+": ");
			num=teclado.nextInt();
			Matriz [filas][columnas]=num;
			columnas++;
			if(columnas==3) {
				filas++;
				columnas=0;
			}
		}
	}
	public static void comprobarIguales(int [][] Matriz, int filas) {
		for(; filas<3; filas++) {
			if(Matriz [filas][0]==Matriz [filas][1]&&Matriz [filas][1]==Matriz [filas][2]) {
				System.out.println("La fila "+filas+" tiene todos los números iguales");
			}
			else {
				System.out.println("La fila "+filas+" NO tiene todos los números iguales");
			}
		}
	}
	public static void main(String[] args) {
		int filas=0, columnas=0;
		int [][] Matriz=new int [3][3];
		rellenarMatriz(Matriz, filas, columnas);
		comprobarIguales(Matriz, filas);
	}
}

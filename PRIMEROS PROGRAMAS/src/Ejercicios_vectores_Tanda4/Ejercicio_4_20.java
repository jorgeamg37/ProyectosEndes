/**
 * 
 */
package Ejercicios_vectores_Tanda4;

import java.util.*;
import java.util.Scanner;

/**
 * @author Jorge Antonio
 * Fecha: 25 ene. 2021
 * @version:
 */
public class Ejercicio_4_20 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 25 ene. 2021
	 * @version: 1.0
	 * @param args
	 */
	public static void main(String[] args)
	{
		int nume= -1, posicion= -1;
		int []numeros= new int[10];
		Scanner teclado= new Scanner(System.in);
		
		cargarNumeros(numeros);
		System.out.println();
		while (posicion== -1)
		{
			System.out.println("\nIntroduce el numero a buscar");
			nume= teclado.nextInt();
			posicion= buscarNume(numeros,nume);
		}
		System.out.println("El numero "+nume+" esta en la posición "+posicion);
		rotarNumeros(numeros,posicion);
		teclado.close();
	}

	public static void cargarNumeros(int[] numeros)
	{
		for (int i=0;i< numeros.length;i++)
		{
			Random aleatorio= new Random();
			numeros[i]= aleatorio.nextInt(101);
			System.out.print(numeros[i]+" ");
		}
	}
	
	public static int buscarNume(int[] numeros,int nume)
	{
		int posicion= -1;
		for (int i=0;i< numeros.length;i++)
		{
			if (numeros[i]== nume)
				posicion= i;
		}
		if (posicion== -1)
			System.out.print("El número "+nume+" no está en el array");
		return posicion;
	}
	
	public static void rotarNumeros(int[] numeros, int posicion)
	{
		if (posicion >= numeros.length/2)
			rotarDerecha(numeros,posicion);
		else
			rotarIzquierda(numeros,posicion);
		visualizarNumeros(numeros);
	}

	public static void rotarDerecha(int[] numeros, int posicion)
	{
		int aux; 
		while (posicion<= numeros.length-1)
		{
			aux= numeros[numeros.length-1];
			for (int i=numeros.length-1;i> 0;i--)
			{
				numeros[i]= numeros[i-1];
			}
			numeros[0]= aux;
			posicion++;
		}
	}

	public static void rotarIzquierda(int[] numeros, int posicion)
	{
		int aux; 
		while (posicion> 0)
		{
			aux= numeros[0];
			for (int i=0;i< numeros.length-1;i++)
			{
				numeros[i]= numeros[i+1];
			}
			numeros[numeros.length-1]= aux;
			posicion--;
		}
	}

	public static void visualizarNumeros(int[] numeros)
	{
		for (int i=0;i< numeros.length;i++)
		{
			System.out.print(numeros[i]+" ");
		}
	}
	
}

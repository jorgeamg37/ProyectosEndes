package Examen_1;

import java.util.*;
import java.util.Scanner;
public class Ejercicio_3 {

	public static void main(String[] args) {
		Random numAleatorio=new Random();
		int num=numAleatorio.nextInt(100)+1, cantidad, contador=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca la cantidad de números aleatorios a generar: ");
		cantidad=teclado.nextInt();
		for(System.out.print(num);contador<(cantidad-1);contador++) {
			num=numAleatorio.nextInt(100)+1;
			System.out.print(" - "+num);
		}
	}
}

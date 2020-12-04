package Ejercicios_UD3_Tanda17;

import java.util.*;
import java.util.Scanner;

public class Ejercicio_3_56 {

	public static void main(String[] args) {
		int cantidad, contador, cara, uno = 0, dos = 0, tres = 0, cuatro = 0, cinco = 0, seis = 0;
		Scanner teclado=new Scanner(System.in);
		Random numAleatorio;
		numAleatorio=new Random();
		System.out.print("Introduzca la cantidad de veces que quiere tirar el dado: ");
		cantidad=teclado.nextInt();
		for(contador=0;contador<cantidad;contador++) {
			cara=numAleatorio.nextInt(6)+1;
			switch(cara) {
			case 1:
				uno++;
				break;
			case 2:
				dos++;
				break;
			case 3:
				tres++;
				break;
			case 4:
				cuatro++;
				break;
			case 5:
				cinco++;
				break;
			case 6:
				seis++;
				break;
			}
		}
		System.out.println("Cara 1: "+uno+" veces");
		System.out.println("Cara 2: "+dos+" veces");
		System.out.println("Cara 3: "+tres+" veces");
		System.out.println("Cara 4: "+cuatro+" veces");
		System.out.println("Cara 5: "+cinco+" veces");
		System.out.println("Cara 6: "+seis+" veces");
	}

}

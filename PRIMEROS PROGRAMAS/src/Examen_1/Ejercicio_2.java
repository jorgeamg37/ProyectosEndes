package Examen_1;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		int terminos, contador=0;
		double suma=0, sumando, denominador;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el número de términos: ");
		terminos=teclado.nextInt();
		for(denominador=1;contador<terminos;contador++) {
			sumando=(1/denominador);
			suma=(suma*(-1))-sumando;
			denominador++;
		}
		System.out.println("La suma de la serie es: "+Math.abs(suma));
	}
}
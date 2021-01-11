package Examen_2;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		int num_term;
		double exp, num_den= 1, suma=0, den;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el número de términos de la serie: ");
		num_term=teclado.nextInt();
		for(exp=2; num_den<=num_term;) {
			den=(int)Math.pow(num_den, exp);
			suma=(suma*(-1))+(1/den);
			num_den++;
			exp++;
		}
		System.out.println("La suma de la serie es: "+Math.abs(suma));
	}
}
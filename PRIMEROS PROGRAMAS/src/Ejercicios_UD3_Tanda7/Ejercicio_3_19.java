package Ejercicios_UD3_Tanda7;

import java.util.Scanner;

public class Ejercicio_3_19 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca n� a: ");
		a=teclado.nextDouble();
		System.out.print("Introduzca n� b: ");
		b=teclado.nextDouble();
		System.out.print("Introduzca n� c: ");
		c=teclado.nextDouble();
		if(a>b&&a>c)
			System.out.println("El n� mayor es: "+a);
		else {
			if(b>a&&b>c)
				System.out.println("El n� mayor es: "+b);
			else
				System.out.println("El n� mayor es: "+c);}
		teclado.close();
	}

}

package Ejercicios_UD3_Tanda7;

import java.util.Scanner;

public class Ejercicio_3_19 {

	public static void main(String[] args) {
		double a, b, c;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca nº a: ");
		a=teclado.nextDouble();
		System.out.print("Introduzca nº b: ");
		b=teclado.nextDouble();
		System.out.print("Introduzca nº c: ");
		c=teclado.nextDouble();
		if(a>b&&a>c)
			System.out.println("El nº mayor es: "+a);
		else {
			if(b>a&&b>c)
				System.out.println("El nº mayor es: "+b);
			else
				System.out.println("El nº mayor es: "+c);}
		teclado.close();
	}

}

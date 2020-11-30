package Ejercicios_UD3_Tanda7;

import java.util.Scanner;

public class Ejercicio_3_20 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca nº a: ");
		a=teclado.nextInt();
		System.out.print("Introduzca nº b: ");
		b=teclado.nextInt();
		System.out.print("Introduzca nº c: ");
		c=teclado.nextInt();
		if(a==b&&a==c)
				System.out.println("Los tres números son iguales");
		else {
			if(a==b)
				System.out.println("El nº a es igual al nº b");
			else {
				if(a==c)
					System.out.println("El nº a es igual al nº c");
				else {
					if(b==c)
						System.out.println("El nº b es igual al nº c");
					else
						System.out.println("Los tres números son distintos");}}}
		teclado.close();
	}

}

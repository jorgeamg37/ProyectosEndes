package Ejercicios_UD3_Tanda7;

import java.util.Scanner;

public class Ejercicio_3_20 {

	public static void main(String[] args) {
		int a, b, c;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca n� a: ");
		a=teclado.nextInt();
		System.out.print("Introduzca n� b: ");
		b=teclado.nextInt();
		System.out.print("Introduzca n� c: ");
		c=teclado.nextInt();
		if(a==b&&a==c)
				System.out.println("Los tres n�meros son iguales");
		else {
			if(a==b)
				System.out.println("El n� a es igual al n� b");
			else {
				if(a==c)
					System.out.println("El n� a es igual al n� c");
				else {
					if(b==c)
						System.out.println("El n� b es igual al n� c");
					else
						System.out.println("Los tres n�meros son distintos");}}}
		teclado.close();
	}

}

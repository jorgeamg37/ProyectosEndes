package Ejercicios_UD3_Tanda1;

import java.util.Scanner;

public class Ejercicio_3_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a;
		int b;
		int suma_cuadrados;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introducir nº a: ");
		a=teclado.nextInt();
		System.out.print("Introducir nº b: ");
		b=teclado.nextInt();
		suma_cuadrados=(a*a)+(b*b);
		System.out.println("La suma de los cuadrados es: "+suma_cuadrados);
		teclado.close();
	}

}

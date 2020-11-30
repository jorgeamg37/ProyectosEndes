package PrimerTrimestre;

import java.util.Scanner;

public class Bucles_while {

	public static void main(String[] args) {
		int suma=0,n=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introducir nº: ");
		n=teclado.nextInt();
		while(n!=0) {//Mientras se cumpla la condición n!=0, se repite el bucle
			++suma;
			System.out.println("El nº es: "+n);
			System.out.print("Introducir nº: ");
			n=teclado.nextInt();}
		System.out.println("Se han leído "+suma+" valores distintos");
		teclado.close();
	}

}

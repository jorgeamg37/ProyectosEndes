package PrimerTrimestre;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int a, b, operacion, resultado = 0;
		Scanner teclado=new Scanner (System.in);
		System.out.print("Introduzca el nº a: ");
		a=teclado.nextInt();
		System.out.print("Introduzca el nº b: ");
		b=teclado.nextInt();
		System.out.println("1-SUMA");
		System.out.println("2-RESTA");
		System.out.println("3-MULTIPLICACIÓN");
		System.out.println("4-DIVISIÓN");
		System.out.print("Introduzca la operación: ");
		operacion=teclado.nextInt();
		switch (operacion) {
		case 1:
			resultado=a+b;
			System.out.println("El resultado es: "+resultado);
			break;
		case 2:
			resultado=a-b;
			System.out.println("El resultado es: "+resultado);
			break;
		case 3:
			resultado=a*b;
			System.out.println("El resultado es: "+resultado);
			break;
		case 4: 
			resultado=a/b;
			System.out.println("El resultado es: "+resultado);
			break;
		default:
			System.out.println("Operación incorrecta");}
		teclado.close();
	}

}

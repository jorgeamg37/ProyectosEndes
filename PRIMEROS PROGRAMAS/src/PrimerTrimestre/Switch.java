package PrimerTrimestre;

import java.util.Scanner;

public class Switch {

	public static void main(String[] args) {
		int a, b, operacion, resultado = 0;
		Scanner teclado=new Scanner (System.in);
		System.out.print("Introduzca el n� a: ");
		a=teclado.nextInt();
		System.out.print("Introduzca el n� b: ");
		b=teclado.nextInt();
		System.out.println("1-SUMA");
		System.out.println("2-RESTA");
		System.out.println("3-MULTIPLICACI�N");
		System.out.println("4-DIVISI�N");
		System.out.print("Introduzca la operaci�n: ");
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
			System.out.println("Operaci�n incorrecta");}
		teclado.close();
	}

}

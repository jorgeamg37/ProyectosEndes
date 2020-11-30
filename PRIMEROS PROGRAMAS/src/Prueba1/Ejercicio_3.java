package Prueba1;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		int H, M, S;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca las horas: ");
		H=teclado.nextInt();
		System.out.print("Introduzca los minutos: ");
		M=teclado.nextInt();
		System.out.print("Introduzca los segundos: ");
		S=teclado.nextInt();
		if(H>=24||H<0||M>=60||M<0||S>=60||S<0) {
			System.out.println("La hora "+H+":"+M+":"+S+" no es válida porque: ");
			if(H>=24||H<0) 
				System.out.println("Las horas deben estar entre 0 y 23, ambos inclusive.");
			if(M>=60||M<0) 
				System.out.println("Los minutos deben estar entre 0 y 60, ambos inclusive.");
			if(S>=60||S<0) 
				System.out.println("Los minutos deben estar entre 0 y 60, ambos inclusive.");}
		else
			System.out.println("La hora "+H+":"+M+":"+S+" es válida");
		teclado.close();
	}

}

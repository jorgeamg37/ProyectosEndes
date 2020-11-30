package Ejercicios_UD3_Tanda1;

import java.util.Scanner;

public class Ejercicio_3_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double base;
		double altura;
		double area;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introducir base en centímetros:");
		base=teclado.nextDouble();
		System.out.print("Introducir altura en centímetros:");
		altura=teclado.nextDouble();
		area=(base*altura);
		System.out.println("El área es: "+area+"cm");
		teclado.close();
	}

}

package Ejercicios_UD4_Tanda2;

import java.util.Scanner;

public class Ejercicio_4_6 {

	public static void suma() {
		int suma, num1, num2;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el primer número: ");
		num1=teclado.nextInt();
		System.out.print("Introduzca el segundo número: ");
		num2=teclado.nextInt();
		suma=num1+num2;
		System.out.println(num1+"+"+num2+"="+suma);
	}
	
	public static void main(String[] args) {
		suma();
	}
}

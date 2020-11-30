package Ejercicios_UD3_Tanda3;

import java.util.Scanner;

public class Ejercicio_3_11 {

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
		if(operacion==1) 
			resultado=a+b;
		if(operacion==2) 
			resultado=a-b;
		if(operacion==3) 
			resultado=a*b;
		if(operacion==4) 
			resultado=a/b;
		System.out.println("El resultado es: "+resultado);
		teclado.close();
		
	}

}

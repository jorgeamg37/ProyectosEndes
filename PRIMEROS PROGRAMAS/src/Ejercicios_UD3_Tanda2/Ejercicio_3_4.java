package Ejercicios_UD3_Tanda2;

import java.util.Scanner;

public class Ejercicio_3_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double cantidad, porcentaje;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introducir cantidad: ");
		cantidad=teclado.nextDouble();
		porcentaje=0.1*cantidad;
		System.out.println("El 10% de "+cantidad+" es: "+porcentaje);
		teclado.close();
	}

}

package Ejercicios_UD3_Tanda12;

import java.util.Scanner;

public class Ejercicio_3_39 {

	public static void main(String[] args) {
		char caracter;
		int contador, vocal=0;
		Scanner teclado=new Scanner(System.in);
		for(contador=1;contador<=10;contador++) {
			System.out.print("Introduzca una letra: ");
			caracter=teclado.next().charAt(0);
			if(caracter=='a'||caracter=='A'||caracter=='e'||caracter=='E'||caracter=='i'||caracter=='I'||caracter=='o'||caracter=='O'||caracter=='u'||caracter=='U') {
				vocal++;
			}
		}
		if(vocal>1)
			System.out.println("Hay "+vocal+" vocales");
		else {
			if(vocal==1)
				System.out.println("Hay una vocal");
			else
				System.out.println("No hay ninguna vocal");
		}
		teclado.close();
	}

}

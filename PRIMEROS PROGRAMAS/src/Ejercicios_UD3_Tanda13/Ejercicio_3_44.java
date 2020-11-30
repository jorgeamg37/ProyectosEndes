package Ejercicios_UD3_Tanda13;

import java.util.Scanner;

public class Ejercicio_3_44 {

	public static void main(String[] args) {
		char caracter;
		Scanner teclado=new Scanner(System.in);
		do {
			System.out.print("Introduzca un caracter: ");
			caracter=teclado.next().charAt(0);
			if(caracter!='*') {
				System.out.println("El caracter introducido es: "+caracter);}}
		while(caracter!='*');
		teclado.close();
	}

}

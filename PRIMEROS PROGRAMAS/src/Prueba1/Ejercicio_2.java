package Prueba1;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		int x, cent, dec, ud;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca un nº entero entre el 1 y el 999: ");
		x=teclado.nextInt();
		if(x<1||x>999)
			System.out.println("El nº no es válido. Introduzca un nº entero entre 1 y 999");
		else {
			cent=x/100;
			dec=x/10-10*cent;
			ud=x-100*cent-10*dec;
			System.out.println("Centenas: "+cent);
			System.out.println("Decenas: "+dec);
			System.out.println("Unidades: "+ud);}
		teclado.close();
	}

}

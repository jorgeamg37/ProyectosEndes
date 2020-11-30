package Prueba1;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		double precio = 0, km;
		char tipo_dia;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca los kilómetros de trayecto: ");
		km=teclado.nextDouble();
		System.out.print("Introduzca el tipo de día (laborable=L/festivo=F): ");
		tipo_dia=teclado.next().charAt(0);
		if(km>80) {
			if(tipo_dia=='L') {
				precio=0.3*km-0.15*(0.3*km)-0.05*(0.3*km);
				System.out.println("El precio del billete es: "+precio+"€");}
			else {
				if(tipo_dia!='F')
					System.out.println("El tipo de día no es válido. Introduzca L o F.");
				else {
					precio=0.3*km-0.15*(0.3*km);
					System.out.println("El precio del billete es: "+precio+"€");}}}
		else {
			if(tipo_dia=='L') {
				precio=0.3*km-0.05*(0.3*km);
				System.out.println("El precio del billete es: "+precio+"€");}
			else {
				if(tipo_dia!='F')
					System.out.println("El tipo de día no es válido. Introduzca L o F.");
				else {
					precio=0.3*km;
					System.out.println("El precio del billete es: "+precio+"€");}}}
		teclado.close();
	}

}

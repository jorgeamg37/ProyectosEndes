package Examen_1;

import java.util.Scanner;

public class Ejercicio_1 {

	public static void main(String[] args) {
		int hora;
		double precio, km, precio_km_dia, precio_km_noche;
		final double bandera_dia=1.723, bandera_noche=2.154, min_dia=4.051, min_noche=5.064;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca la hora en la que coges el taxi (Formato 24h sin minutos): ");
		hora=teclado.nextInt();
		if(hora>=24||hora<0) {
			System.out.println("La hora introducida no es válida.");
		}
		else {
			System.out.print("Introduzca los kilómetros recorridos: ");
			km=teclado.nextDouble();
			precio_km_dia=km*0.940;
			precio_km_noche=km*1.175;
			if(hora>=7&&hora<=21) {
				precio=precio_km_dia+bandera_dia;
				if(precio<min_dia) {
					precio=min_dia;
					System.out.println("Tarifa 1. Coste: "+precio+"€");
				}
				else {
					System.out.println("Tarifa 1. Coste: "+precio+"€");
				}
			}
			else {
				precio=precio_km_noche+bandera_noche;
				if(precio<min_noche) {
					precio=min_noche;
					System.out.println("Tarifa 2. Coste: "+precio+"€");
				}
				else {
					System.out.println("Tarifa 2. Coste: "+precio+"€");
				}
			}
		}
	}
}

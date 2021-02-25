package Ejercicios_matrices_Tanda5;

import java.util.Random;
import java.util.Scanner;

/**
 * @author Jorge Antonio
 * Fecha: 11 feb. 2021
 * @version:
 */
public class Ejercicio_4_36 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 11 feb. 2021
	 * @version: 1.0
	 * @param args
	 */
	public static int random () {
		int valor;
		Random numAleatorio=new Random();
		valor=numAleatorio.nextInt(2);
		return valor;
	}
	public static void rellenarMatriz (int [][] departamento, int sala, int equipo) {
		for(int contador=0; contador<50; contador++) {
			departamento[sala][equipo]=random();
			if(equipo==9) {
				equipo=0;
				sala++;
			}
			else {
				equipo++;
			}
		}
	}
	public static void asignarReserva(int [][] departamento, int sala, int equipo, Scanner teclado) {
		System.out.print("Introduzca la sala donde quiere reservar: ");
		sala=teclado.nextInt();
		System.out.print("Introduzca el equipo que quiere reservar: ");
		equipo=teclado.nextInt();
		if(departamento[sala][equipo]==1) {
			System.out.println("Ese equipo ya está reservado, por favor, seleccione otro equipo");
		}
		else {
			departamento[sala][equipo]=1;
		}
	}
	public static void cancelarReserva(int [][] departamento, int sala, int equipo, Scanner teclado) {
		System.out.print("Introduzca la sala donde tiene la reserva: ");
		sala=teclado.nextInt();
		System.out.print("Introduzca el equipo donde tiene la reserva: ");
		equipo=teclado.nextInt();
		if(departamento[sala][equipo]==0) {
			System.out.println("Ese equipo no tiene reserva, por favor, seleccione otro equipo");
		}
		else {
			departamento[sala][equipo]=0;
		}
	}
	public static int masEquipos(int [][] departamento, int sala, int equipo) {
		int salaLibre=0, libres=0, libresSala=0;
		for(sala=0; sala<5; sala++) {
			for(libres=0, equipo=0; equipo<10; equipo++) {
				if(departamento[sala][equipo]==0) {
					libres++;
				}
			}
			if(libresSala<libres) {
				salaLibre=sala;
			}
			libresSala=libres;
		}
		return salaLibre;
	}
	public static void equiposSala(int [][] departamento, int sala, int equipo, Scanner teclado) {
		int contador=0;
		System.out.print("Introduzca la sala que quiere consultar: ");
		sala=teclado.nextInt();
		for(; equipo<10; equipo++) {
			if(departamento[sala][equipo]==0) {
				contador++;
			}
		}
		System.out.println("En la sala "+sala+" hay "+contador+" equipos libres");
	}
	public static void visualizarMatriz (int [][] departamento, int sala, int equipo) {
		System.out.println("Cantidad de equipos en cada sala:");
		for(int contador=0; contador<50; contador++) {
			System.out.print(departamento[sala][equipo]+" ");
			if(equipo==9) {
				equipo=0;
				sala++;
				System.out.println();
			}
			else {
				equipo++;
			}
		}
	}
	public static void main(String[] args) {
		int [][] departamento=new int[5][10];
		int sala=0, equipo=0, menu;
		Scanner teclado=new Scanner(System.in);
		rellenarMatriz(departamento, sala, equipo);
		do {
			System.out.println("\n1. Asignar reserva.");
			System.out.println("2. Cancelar reserva.");
			System.out.println("3. En que sala hay más equipos libres.");
			System.out.println("4. Situación de equipos disponibles en una sala determinada.");
			System.out.println("5. Cantidad de equipos asignados en todas las salas.");
			System.out.println("6. Salir.");
			menu=teclado.nextInt();	
			switch(menu) {
				case 1:
					asignarReserva(departamento, sala, equipo, teclado);
					break;
				case 2:
					cancelarReserva(departamento, sala, equipo, teclado);
					break;
				case 3:
					System.out.println("La sala con más equipos libres es: "+masEquipos(departamento, sala, equipo));
					break;
				case 4:
					equiposSala(departamento, sala, equipo, teclado);
					break;
				case 5:
					visualizarMatriz(departamento, sala, equipo);
					break;
				default:
					System.out.println("El valor introducido no es válido.");
					break;
			}
		}
		while(menu!=6);
		teclado.close();
	}
}
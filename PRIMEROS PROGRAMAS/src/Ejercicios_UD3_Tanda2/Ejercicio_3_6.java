package Ejercicios_UD3_Tanda2;

import java.util.Scanner;

public class Ejercicio_3_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre;
		double ev1, ev2, ev3, media;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introducir nombre del alumno: ");
		nombre=teclado.nextLine();
		System.out.print("Introducir nota de la 1ª evaluación:");
		ev1=teclado.nextInt();
		System.out.print("Introducir nota de la 2ª evaluación:");
		ev2=teclado.nextInt();
		System.out.print("Introducir nota de la 3ª evaluación:");
		ev3=teclado.nextInt();
		media=(ev1+ev2+ev3)/3;
		System.out.println("La nota media del curso de "+nombre+" es: "+media);
		teclado.close();
	}

}

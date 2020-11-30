package Ejercicios_UD3_Tanda7;

import java.util.Scanner;

public class Ejercicio_3_21 {

	public static void main(String[] args) {
		int horas, minutos, segundos;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca las horas: ");
		horas=teclado.nextInt();
		System.out.print("Introduzca los minutos: ");
		minutos=teclado.nextInt();
		System.out.print("Introduzca los segundos: ");
		segundos=teclado.nextInt();
		if(segundos==59) {
			segundos=00;
			minutos++;
			if(minutos==60) {
				minutos=00;
				horas++;
				if(horas==24) {
					horas=00;}}}
		else
			segundos++;
		if(segundos>=60||minutos>=60||horas>=24)
			System.out.println("Las horas/minutos/segundos introducidos no son válidos");
		else
			System.out.println("La hora + 1 segundo es: "+horas+":"+minutos+":"+segundos);
		teclado.close();
	}

}

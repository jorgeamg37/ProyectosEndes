package Examen_2;

import java.util.Scanner;

public class Ejercicio_3 {

	public static void main(String[] args) {
		int base, altura, cont_b, cont_a, espacio, cont_e=0, espacio2;
		final char aste='*';
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca la base: ");
		base=teclado.nextInt();
		System.out.print("Introduzca la altura: ");
		altura=teclado.nextInt();
		for(cont_a=1; cont_a<=altura; cont_a++) {
			cont_e=(altura-cont_a);
			for(espacio=0; espacio<cont_e;) {
				System.out.print(" ");
				espacio++;
			}
			if(cont_a==1||cont_a==altura) {
				for(cont_b=1; cont_b<=(base+2); cont_b++) {
					System.out.print(aste);
				}
			}
			else {
				System.out.print(aste);
				for(espacio2=1; espacio2<=base; espacio2++) {
					System.out.print(" ");
				}
				System.out.print(aste);
			}
			System.out.println();
		}
	}	
}

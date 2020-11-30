package Ejercicios_UD3_Tanda12;

import java.util.Scanner;

public class Ejercicio_3_40 {

	public static void main(String[] args) {
		char caracter, primero;
		int contador, veces_prim=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca una letra: ");
		primero=teclado.next().charAt(0);
		for(contador=0;contador<9;contador++) {
			System.out.print("Introduzca una letra: ");
			caracter=teclado.next().charAt(0);
			if(caracter==primero)
				veces_prim++;
		}
		if(veces_prim>1)
			System.out.println("La primera letra se repite "+veces_prim+" veces");
		else {
			if(veces_prim==1)
				System.out.println("La primera letra se repite una vez");
			else
				System.out.println("La primera letra no se repite ninguna vez");
		}
		teclado.close();
	}

}

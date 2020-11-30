package PrimerTrimestre;

import java.util.Scanner;

public class Condicionales {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x,y;
		String cadena;
		boolean resultado;
		Scanner teclado= new Scanner(System.in);
		System.out.print("Introduce 1er nº: ");
		x=teclado.nextInt();
		System.out.print("Introduce 2º nº: ");
		y=teclado.nextInt();
		cadena=(x==y)?"iguales":"distintos";
		System.out.printf("Los números %d y %d son %s\n",x,y,cadena);
		resultado=(x!=y);
		System.out.println("x!=y//es "+resultado);
		resultado=(x<y);
		System.out.println("x<y//es "+resultado);
		resultado=(x>y);
		System.out.println("x>y//es "+resultado);
		resultado=(x<=y);
		System.out.println("x<=y//es "+resultado);
		resultado=(x>=y);
		System.out.println("x>=y//es "+resultado);
		teclado.close();
	}

}

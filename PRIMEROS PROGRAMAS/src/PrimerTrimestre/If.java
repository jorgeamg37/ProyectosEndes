package PrimerTrimestre;

import java.util.Scanner;

public class If {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i=0, par=0, impar=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introducir nº: ");
		i=teclado.nextInt();
		if(i%2==0) {
			System.out.println("Es par");
			par++;}
		else {
			System.out.println("Es impar");
			impar++;}
		System.out.println("Pares: "+par);
		System.out.println("Impares: "+impar);
		teclado.close();
	}

}

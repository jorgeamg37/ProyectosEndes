package Ejercicios_UD3_Tanda12;

import java.util.Scanner;

public class Ejercicio_3_38 {

	public static void main(String[] args) {
		int num, cinco=0, contador;
		Scanner teclado=new Scanner(System.in);
		for(contador=1;contador<=10;contador++) {
			System.out.print("Introduzca un nº entero: ");
			num=teclado.nextInt();
			if(num==5)
				cinco++;
		}
		if(cinco>1)
			System.out.println("Hay "+cinco+" cincos");
		else {
			if(cinco==1)
				System.out.println("Hay un cinco");
			else
				System.out.println("No hay ningún cinco");
		}
		teclado.close();
	}

}

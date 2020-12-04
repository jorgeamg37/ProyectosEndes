package Ejercicios_UD3_Tanda17;

import java.util.Scanner;

public class Ejercicio_3_57 {

	public static void main(String[] args) {
		int num, invertido=0, resto;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca un nº entero: ");
		num=teclado.nextInt();
		while(num>0) {
			resto=num%10;
			invertido=invertido*10+resto;
			num/=10;
		}
		System.out.println("nº invertido: "+invertido);
	}

}

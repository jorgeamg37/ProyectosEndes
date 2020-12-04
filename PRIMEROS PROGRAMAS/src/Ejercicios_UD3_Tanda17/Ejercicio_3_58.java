package Ejercicios_UD3_Tanda17;

import java.util.Scanner;

public class Ejercicio_3_58 {

	public static void main(String[] args) {
		int num1, num2, contador1, contador2, divisor1, divisor2, suma1=0, suma2=0;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el primer nº: ");
		num1=teclado.nextInt();
		for(contador1=(num1-1); contador1>0; contador1--) {
			if(num1%contador1==0) {
				divisor1=contador1;
				suma1+=divisor1;
			}
		}
		System.out.print("Introduzca el segundo nº: ");
		num2=teclado.nextInt();
		for(contador2=(num2-1); contador2>0; contador2--) {
			if(num2%contador2==0) {
				divisor2=contador2;
				suma2+=divisor2;
			}
		}
		if((suma1==num2)&&(suma2==num1)) {
			System.out.println("Los números "+num1+" y "+num2+" son amigos.");
		}
		else {
			System.out.println("Los números "+num1+" y "+num2+" no son amigos.");
		}
	}

}

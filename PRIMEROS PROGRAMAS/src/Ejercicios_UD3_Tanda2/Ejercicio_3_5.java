package Ejercicios_UD3_Tanda2;

import java.util.Scanner;

public class Ejercicio_3_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double precio, IVA, descuento15, precio_final;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introducir precio: ");
		precio= teclado.nextDouble();
		IVA=precio*0.21;
		descuento15=precio*0.15;
		precio_final=precio+IVA-descuento15;
		System.out.println("El precio final es: "+precio_final+"€");
		teclado.close();
	}

}

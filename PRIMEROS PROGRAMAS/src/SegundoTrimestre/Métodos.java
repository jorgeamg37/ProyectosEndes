package SegundoTrimestre;

import java.util.Scanner;

public class Métodos {

	public static void main(String[] args) {
		int numero;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el nº: ");
		numero=teclado.nextInt();
		System.out.println("El factorial de "+numero+" es: "+factorial(numero)/*llamamos al método con
		el nombre del método y las variables que se meten al método*/);
	}
	public static int factorial (int numero) {
	/*public static (tipo variable que sale, se pone void si no sale nada) (nombre metodo)
	((tipo variable y variable que entra, pueden ser varias pero hay que definirlas una a una))*/
		int facto=1;
		for(int i=1; i<=numero; i++) {
			facto*=i;
		}
		return facto;//variable que se devuelve (sólo puede ser una)
	}
}

package SegundoTrimestre;

import java.util.Scanner;

public class M�todos {

	public static void main(String[] args) {
		int numero;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Introduzca el n�: ");
		numero=teclado.nextInt();
		System.out.println("El factorial de "+numero+" es: "+factorial(numero)/*llamamos al m�todo con
		el nombre del m�todo y las variables que se meten al m�todo*/);
	}
	public static int factorial (int numero) {
	/*public static (tipo variable que sale, se pone void si no sale nada) (nombre metodo)
	((tipo variable y variable que entra, pueden ser varias pero hay que definirlas una a una))*/
		int facto=1;
		for(int i=1; i<=numero; i++) {
			facto*=i;
		}
		return facto;//variable que se devuelve (s�lo puede ser una)
	}
}

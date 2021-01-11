package Examen_2;

import java.util.Scanner;

public class Ejercicio_2 {

	public static void main(String[] args) {
		int intentos=0;
		String pass_admin, pass_user;
		Scanner teclado=new Scanner(System.in);
		System.out.print("Administrador, introduzca la contraseña del sistema: ");
		pass_admin=teclado.nextLine();
		while(intentos<3) {
			System.out.print("Usuario, introduzca la contraseña del sistema: ");
			pass_user=teclado.nextLine();
			if(pass_admin.equals(pass_user)==true) {
				System.out.println("Usuario, Bienvenido al sistema!");
				break;
			}
			else {
				System.out.println("Contraseña incorrecta");
				if(intentos==2) {
					System.out.println("Usuario, has agotado los intentos");
				}
			}
			intentos++;
		}
	}

}

package PrimerTrimestre;

public class Bucles_for2 {
	
	public static void main(String[] args) {
		int suma=0;
		for(int numero=2;numero<=100;numero+=2){//int numero=2->1� vez / numero<=100->condici�n / numero+=2-> operaci�n mientras se cumpla la condici�n
		suma+=numero;}
		System.out.println("La suma de los n�meros pares comprendidos entre 2 y 100 es: "+suma);
	}
}

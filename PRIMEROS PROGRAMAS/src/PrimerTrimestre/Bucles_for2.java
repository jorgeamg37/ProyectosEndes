package PrimerTrimestre;

public class Bucles_for2 {
	
	public static void main(String[] args) {
		int suma=0;
		for(int numero=2;numero<=100;numero+=2){//int numero=2->1ª vez / numero<=100->condición / numero+=2-> operación mientras se cumpla la condición
		suma+=numero;}
		System.out.println("La suma de los números pares comprendidos entre 2 y 100 es: "+suma);
	}
}

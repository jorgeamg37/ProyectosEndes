package PrimerTrimestre;

public class Cadenas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String cad1="CICLO DAM";
		String cad2="ciclo dam";
		
		System.out.printf("La cadena cad1 es: %s y cad2 es: %s", cad1,cad2);
		
		System.out.printf("\nLongitud de cad1: %d", cad1.length());
		
		System.out.printf("\nConcatenación %s", cad1.concat(cad2));//==cad1+cad2
		
		System.out.printf("\ncad1.equals(cad2) es %b", cad1.equals(cad2));
		
		System.out.printf("\ncad1.substring (6,9) es %s", cad1.substring (6,9));//cad1.substring(caracter_inicial,caracter_final+1)
		System.out.printf("\ncad1.equalsIgnoreCase(cad2) es %b", cad1.equalsIgnoreCase(cad2));
		System.out.printf("\ncad1.compareTo(cad2) es %d", cad1.compareTo(cad2));
	}

}

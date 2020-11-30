package PrimerTrimestre;

public class Operadores_lógicos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("OPERADOREWS LÓGICOS");
		
		System.out.println("Negación:\n!false es: "+(!false));
		System.out.println("!true es: "+(!true));
		
		System.out.println("Operador AND (&):\nfalse & false es: "+(false&false));
		System.out.println("false & true es: "+(false&true));
		System.out.println("true & false es: "+(true&false));
		System.out.println("true & true es: "+(true&true));
		
		System.out.println("Operador OR (|):\nfalse | false es: "+(false|false));
		System.out.println("false | true es: "+(false|true));
		System.out.println("true | false es: "+(true|false));
		System.out.println("true | true es: "+(true|false));
		
		System.out.println("Operador Or Exclusivo (^):\nfalse ^ false es: "+(false^false));
		System.out.println("false ^ true es: "+(false^true));
		System.out.println("true ^ false es: "+(true^false));
		System.out.println("true ^ true es: "+(true^true));
		
		System.out.println("Operador &&:\nfalse && false es: "+(false&&false));//A penas se usa
		System.out.println("false && true es: "+(false&&true));
		System.out.println("true && false es: "+(true&&false));
		System.out.println("true && true es: "+(true&&true));
		
		System.out.println("Operador ||:\nfalse || false es: "+(false||false));//A penas se usa
		System.out.println("false || true es: "+(false||true));
		System.out.println("true || false es: "+(true||false));
		System.out.println("true || true es: "+(true||true));
	}

}

package Ejercicios_UD3_Tanda12;

public class Ejercicio_3_37 {

	public static void main(String[] args) {
		int tabla=1, num=0, resultado=0;
		while(tabla<=9) {
			while(resultado<=(tabla*10)) {
				resultado+=tabla;
				System.out.print(tabla+"*"+num+"="+resultado);
				num++;
				tabla++;
				resultado=0;
				System.out.println();
			}
		}
	}

}

/**
 * 
 */
package Cafetera;

/**
 * @author Jorge Antonio
 * Fecha: 24 feb. 2021
 * @version:
 */
public class TestCafetera {

	/**
	 * @author Jorge Antonio
	 * Fecha: 24 feb. 2021
	 * @version: 1.0
	 * @param args
	 */
	public static void main(String[] args) {
		Cafetera cafetera1 = new Cafetera(500);
		Cafetera cafetera2 = new Cafetera(800);
		
		cafetera1.agregarCafe(100);
		cafetera2.agregarCafe(400);
		
		if (cafetera1.servirCafe(800)) System.out.println("Café Servido");
		  else	System.out.println("No hay suficiente café en la cafetera");
		
		if (cafetera2.servirCafe(1000)) System.out.println("Café Servido");
		  else	System.out.println("No hay suficiente café en la cafetera");
		
		if (cafetera1.servirCafe(200)) System.out.println("Café Servido");
		  else	System.out.println("No hay suficiente café en la cafetera");
	}
}

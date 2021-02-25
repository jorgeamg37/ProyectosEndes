/**
 * 
 */
package CuentaBancaria;

/**
 * @author Jorge Antonio
 * Fecha: 25 feb. 2021
 * @version:
 */
public class TestCuenta1 {

	/**
	 * @author Jorge Antonio
	 * Fecha: 25 feb. 2021
	 * @version: 1.0
	 * @param args
	 */
	public static void visualizarDatos(CuentaBancaria cuenta1, CuentaBancaria cuenta2, CuentaBancaria cuenta3) {
		System.out.println("                 DATOS DE LAS CUENTAS");
		System.out.println("___________________________________________________________");
		System.out.println("          TITULAR                       SALDO");
		System.out.println("---------------------------     ---------------------");
		System.out.println("          "+cuenta1.getTitular()+"                      "+cuenta1.getSaldo()+"€");
		System.out.println("          "+cuenta2.getTitular()+"                       "+cuenta2.getSaldo()+"€");
		System.out.println("          "+cuenta3.getTitular()+"                    "+cuenta3.getSaldo()+"€");
	}
	public static float mediaSaldos(CuentaBancaria cuenta1, CuentaBancaria cuenta2, CuentaBancaria cuenta3) {
		float media;
		media=(cuenta1.getSaldo()+cuenta2.getSaldo()+cuenta3.getSaldo())/3;
		return media;
	}
	public static void main(String[] args) {
		CuentaBancaria cuenta1=new CuentaBancaria("Rosario", 0);
		CuentaBancaria cuenta2=new CuentaBancaria("Carmen", 500);
		CuentaBancaria cuenta3=new CuentaBancaria("Jose Luis", 1000);
		visualizarDatos(cuenta1, cuenta2, cuenta3);
		cuenta1.realizarIngresos(100);
		cuenta2.realizarReintegros(200);
		cuenta3.realizarIngresos(300);
		cuenta3.realizarReintegros(400);
		System.out.println("\nVarios cambios...\n");
		visualizarDatos(cuenta1, cuenta2, cuenta3);
		System.out.println("\nEl saldo medio de las tres cuentas es de "+mediaSaldos(cuenta1, cuenta2, cuenta3)+"€");
	}
}
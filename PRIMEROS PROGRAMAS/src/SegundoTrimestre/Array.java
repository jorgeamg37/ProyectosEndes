/**
 * 
 */
package SegundoTrimestre;

/**
 * @author Jorge Antonio
 * Fecha: 11 ene. 2021
 * @version: 1.0
 */
public class Array {

	/**
	 * @author Jorge Antonio
	 * Fecha: 11 ene. 2021
	 * @version:
	 * @param args
	 */
	public static void main(String[] args) {
		int [] nombreArray={8,3,5,6,7};//nombreArray[0]=8; nombreArray[1]=3; nombreArray[2]=5
		int Array_pares[];//int Array2[]=int [] Array2
		int valor=2;
		nombreArray=new int[5];//new tipo[tamaño]
		Array_pares=new int[92];
		for(int posicion=0; posicion<Array_pares.length; posicion++) {
			Array_pares[posicion]=valor;
			valor+=2;
		}
		System.out.println(Array_pares[90]);
	}
}

package PrimerTrimestre;
//x+=y:x=x+y
//x-=y:x=x-y
//x*=y:x=x*y
//x/=y:x=x/y
public class Clase_1_Ejercicio_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int x=5;
		int y=3;
		
		System.out.printf("El valor de x es %d y el valor de y es %d\n", x,y); //%d=nºenteros //%f=nºreales //%s=cadenas_caracteres //&b=boolean
		x+=y;
		System.out.println("Suma combinada: x+=y"+"............ x vale "+ x);
		x=5;
		x-=y;
		System.out.println("Resta combinada: x-=y"+"........... x vale "+x);
		x=5;
		x-=y;
		System.out.println("Producto combinado: x*=y"+"........ x vale "+x);
		x=5;
		x*=y;
		System.out.println("División combinada: x/=y"+"........ x vale "+x);
		x=5;
		x/=y;
		System.out.println("Resto combinada: x%=y"+"........... x vale "+x);
		x=5;
		x%=y;
	}

}

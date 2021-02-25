package Cafetera;

public class Cafetera {
	int cantidadMaxima, cantidad;
	Cafetera()
	 {
		 
	 }
	 Cafetera(int cantidad)
	 {
		this.cantidad=cantidad;
		cantidadMaxima=1000;
	 }
	public void llenarCafetera() 
	 {
		cantidad=cantidadMaxima;
	 }
	public void  vaciarCafetera()
	 {
		cantidad=0;
	 }
	public void agregarCafe(int cc)
	 {
		if ((cc+cantidad)>cantidadMaxima)
			 cantidad=cantidadMaxima;
		else
			cantidad+=cc;
	 }
	public boolean servirCafe(int cc)
	 {
		if(cantidad>cc)
		{
			cantidad-=cc;
			return true;
		}
		else 
			if(cantidad==cc)
			{
				cantidad=0;
				return true;
			}
			else
				return false;
	}
}
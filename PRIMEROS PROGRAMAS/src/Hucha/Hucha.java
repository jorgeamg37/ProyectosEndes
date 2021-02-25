package Hucha;

public class Hucha {
	int unEuro=0, dosEuros=0, cincoEuros=0;
	boolean abierta;
	Hucha(boolean abierta){
		this.abierta=abierta;
	}
	public int getUnEuro() {
		return unEuro;
	}
	public void setUnEuro(int unEuro) {
		this.unEuro = unEuro;
	}
	public int getDosEuros() {
		return dosEuros;
	}
	public void setDosEuros(int dosEuros) {
		this.dosEuros = dosEuros;
	}
	public int getCincoEuros() {
		return cincoEuros;
	}
	public void setCincoEuros(int cincoEuros) {
		this.cincoEuros = cincoEuros;
	}
	public boolean isAbierta() {
		return abierta;
	}
	public void setAbierta(boolean abierta) {
		this.abierta = abierta;
	}
	public void abrirHucha(){
		abierta=true;
	}
	public void ingresar(int ingreso) {
		unEuro+=ingreso;
		dosEuros+=ingreso;
		cincoEuros+=ingreso;
	}
	public int valorTotal(int suma) {
		suma=unEuro+dosEuros+cincoEuros;
		return suma;
	}
	public boolean hayBilletes(boolean billetes) {
		if(cincoEuros>0) {
			billetes=true;
		}
		else {
			billetes=false;
		}
		return billetes;
	}
	public void sacarBilletes(int num_billetes) {
		if(abierta==false) {
			System.out.println("La hucha está cerrada");
		}
		else if(num_billetes<cincoEuros){
			System.out.println("No hay suficientes billetes");
		}
		else {
			cincoEuros-=num_billetes;
		}
	}
}
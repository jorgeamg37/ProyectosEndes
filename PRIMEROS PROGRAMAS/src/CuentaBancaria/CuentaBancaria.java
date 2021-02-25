package CuentaBancaria;

public class CuentaBancaria {
	private String titular;
	private float saldo;
	CuentaBancaria(String titular, float saldo){
		this.titular=titular;
		this.saldo=saldo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	public void realizarReintegros (int importe) {
		saldo-=importe;
	}
	public void realizarIngresos (int ingreso) {
		saldo+=ingreso;
	}
}
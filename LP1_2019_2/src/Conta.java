
public class Conta {
	private String numero;
	private double saldo;
		
	public void creditar(double valor){
		saldo = saldo + valor;
	}
	
	public void setSaldo(double valor){
		saldo = valor;
	}
	
	public double getSaldo(){
		return saldo;
	}

	public String getNumero() {
		return numero;
	}

	public void setNumero(String numero) {
		this.numero = numero;
	}
	
	
}

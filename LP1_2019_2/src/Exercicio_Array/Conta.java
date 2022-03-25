package Exercicio_Array;

public class Conta {
	protected String id;
	protected double saldo;
	
	public Conta(String id, double saldo){
		this.id = id;
		this.saldo = saldo;
	}
	
	public void setID(String id){
		this.id = id;
	}
	
	public String getID(){
		return id;
	}
	
	public void setSaldo(double saldo){
		this.saldo = saldo;
	}
	
	public double getSaldo(){
		return saldo;
	}
	
	public void imprimir(){
		System.out.println("Conta ID: " + this.id);
		System.out.println("Saldo: " + this.saldo);
	}
	
	public void creditar(double valor){
		saldo = saldo + valor;
		System.out.println("Creditado! " + valor);
	}
	
	public void debitar(double valor) throws SIException {
		if(saldo >= valor){
			saldo = saldo - valor;
			System.out.println("Debitado! " + valor);
		} else {
			SIException e = new SIException(saldo);
			throw e;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}

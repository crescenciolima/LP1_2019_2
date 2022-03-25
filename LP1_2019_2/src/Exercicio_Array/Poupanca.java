package Exercicio_Array;

public class Poupanca extends Conta {
	private double taxa;
	
	public Poupanca(String id, double saldo, double taxa){
		super(id, saldo);
		this.taxa = taxa;
	}
	
	public void renderJuros(){
		double juros = this.saldo * taxa;
		creditar(juros);
	}
		
	public void imprimir_Poupanca(){
		super.imprimir();
		System.out.println(taxa);
	
		
	}
		
}

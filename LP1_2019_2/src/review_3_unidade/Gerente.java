package review_3_unidade;

public class Gerente extends Funcionario{
	private double CRM;
	
	public Gerente(String cpf, double salario, double CRM){
		super(cpf, salario);
		this.CRM = CRM;
	}
	
	public void validar(){
		System.out.println("Sou fod*");
	}
	
	public double getBonificacao(){
		return (salario * 1.2); 
	}
}

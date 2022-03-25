package review_3_unidade;

public abstract class Funcionario implements Funcionario_Generico{
	protected String cpf;
	protected double salario;
	
	public Funcionario(String cpf, double salario){
		this.cpf = cpf;
		this.salario = salario;
	}
	
	public abstract void validar();
	public abstract double getBonificacao();
	
	public String getCPF(){
		return cpf;
	}
}

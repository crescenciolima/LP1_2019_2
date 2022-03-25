package review_3_unidade;

public class Desenvolvedor extends Funcionario{
	public Desenvolvedor(String cpf, double salario){
		super(cpf, salario);
	}
	
	public void validar(){
		System.out.println("Um dia eu chego lá");
	}
	
	public double getBonificacao(){
		return (salario * 1.5);
	}
}

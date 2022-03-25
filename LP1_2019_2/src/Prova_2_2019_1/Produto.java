package Prova_2_2019_1;

public class Produto {
	protected String descricao;
	protected double valor;
	protected int qtdestoque;
	
	public Produto(String descricao, double val, int qtdestoque){
		this.descricao = descricao;
		valor = val;
		this.qtdestoque = qtdestoque;
	}
	
	public void imprimir(){
		System.out.println(this.descricao);
		System.out.println(this.valor);
		System.out.println(this.qtdestoque);
	}
	
	
	
	
	
	
	
	
	
	
	
}

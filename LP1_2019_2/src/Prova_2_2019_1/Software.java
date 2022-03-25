package Prova_2_2019_1;

public class Software extends Produto {
	private double versao;
	public Software(String descricao, double val, int qtdestoque, double versao){
		super(descricao, val, qtdestoque);
		this.versao = versao;
	}
	
	@Override
	public void imprimir(){
		super.imprimir();
		System.out.println(this.versao);
	}
	
	public String AlterarDescricao(String nova){
		this.descricao = nova;
		return "Atualizado";
	}
	
	
	
	
	
	
	
	
	

	
	
	
	
	
}

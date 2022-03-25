package Prova_2_2019_1;

public class BDProdutos {
	private Produto[] estoqueprodutos;
	private int indice;
	
	public BDProdutos(){
		this.indice = 0;
		estoqueprodutos = new Produto[10];
	}
	
	public void inserir(Produto p){
		if(indice < 10){
			estoqueprodutos[indice] = p;
			indice++;
		}else{
			System.out.println("Array estourado");
		}
	}
	
	public void imprimirRelatorio(){
		for(int i = 0; i < indice; i++){
			estoqueprodutos[i].imprimir();
			System.out.println("---------");
		}
	}
	
	
	
	
	
	
	
	
	
}

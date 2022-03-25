package Prova_2_2019_1;

public class Main {

	public static void main(String[] args) {
		Produto novo1 = new Produto("Cheetos", 5.5, 10);
		Produto novo2 = new Produto("Pera", 0.5, 100);
		Software novo3 = new Software("Excel", 100.0, 25, 12.2);
		Software novo4 = new Software("Winrar", 0.0, 100, 3.5);
		//novo1.imprimir();
		//novo2.imprimir();
		//novo3.imprimir();
		//novo4.imprimir();

		BDProdutos estoque = new BDProdutos();
		estoque.inserir(novo1);
		estoque.inserir(novo2);
		estoque.inserir(novo3);
		estoque.inserir(novo4);
		estoque.imprimirRelatorio();
		
		
		
		
		
		
		
		
		
		

	}

}

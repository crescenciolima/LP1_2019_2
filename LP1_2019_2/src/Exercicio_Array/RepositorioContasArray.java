package Exercicio_Array;

public class RepositorioContasArray {
	private Conta [] array_contas;
	private int indice;
	private final static int MAX = 3;
	
	public RepositorioContasArray(){
		indice = 0;
		array_contas = new Conta[MAX];
	}
	
	public void inserir(Conta c){
		array_contas[indice] = c;
		indice++;
	}
	
	public void imprimirContas(){
		for (int i = 0; i < indice; i++) {
			System.out.println("-----------------");
			System.out.println("Conta ID: " + array_contas[i].getID());
			System.out.println("Saldo: " + array_contas[i].getSaldo());
			
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	
}

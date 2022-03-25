package Exercicio_Array;

public class Main {

	public static void main(String[] args) {
		Conta c;
		c = new Conta("45", 200.00);
		c.imprimir();
		Conta x = new Conta("123-3", 100.0);
		x.imprimir();
		x.setSaldo(10.0);
		x.creditar(500.0);
		try{	
			x.debitar(5010.0);
		} catch(SIException e){
			System.out.println("Erro " + e);
		}
		x.imprimir();
		Conta y = new Conta("321-1", 200.0);
		Conta z = new Conta("444-4", 0.0);
		int [] array_inteiros = new int[3];
		RepositorioContasArray array_contas_new = new RepositorioContasArray();
		
		//Conta [] array_contas = new Conta[3];
		//array_contas[0] = x;
		array_contas_new.inserir(x);
		//array_contas[1] = y;
		array_contas_new.inserir(y);
		//array_contas[2] = z;
		array_contas_new.inserir(z);
		array_contas_new.imprimirContas();
		
		//for (int i = 0; i < array_contas.length; i++) {
		//	System.out.println("-------------------");
		//	array_contas[i].imprimir();	
		//}
		
		
 
	}

}

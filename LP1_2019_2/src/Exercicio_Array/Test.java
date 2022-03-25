package Exercicio_Array;

public class Test {

	public static void main(String[] args) {
		Conta nova1 = new Conta("555-5", 100.0);
		Poupanca nova2 = new Poupanca("987-1", 10.0, 0.01);
		
		nova1.creditar(10.0);
		nova2.creditar(10.0);
		
		nova1.imprimir();
		nova2.imprimir();
		
		nova2.renderJuros();
		nova2.imprimir();
		
		
		
		
		

	}

}

package CanetaAzul;

public class Principal {

	public static void main(String[] args) {
		CanetaEsferografica nova = new CanetaEsferografica("Azul");
		Lapis novoL = new Lapis("Preto");
		
		nova.escrever("primeiro");
		novoL.escrever("teste");
		
		System.out.println(nova.getCor());
		System.out.println(novoL.getCor());
		Caneta [] bd = new Caneta[10];
		bd[0] = nova;
		bd[1] = novoL;
		
	}

}

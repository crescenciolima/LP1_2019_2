package CanetaAzul;

public class Main {
	public static void main(String[] args) {
		Carro novo1 = new Carro("Corsa", "123", "passeio", "Chev");
		Carro novo2 = new Carro("Gol", "456", "passeio", "Volks");
		System.out.println(novo1.getNome() + "\n" +
							novo1.getId() + "\n" + 
							novo1.getModelo() + "\n" +
							novo1.getFabricante());
	}
	

}

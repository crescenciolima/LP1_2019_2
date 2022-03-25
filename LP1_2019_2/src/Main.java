
public class Main {

	public static void main(String[] args) {
		String nome = "Joao";
		int idade = 25;
		double altura = 1.6;
		Pessoa x = new Pessoa(nome, idade, altura);
		System.out.println(x.getNome());
		
		Pessoa y = new Pessoa();
		System.out.println(y.getNome());
		y.setNome("Paulo");
		System.out.println(y.getNome());

	}

}

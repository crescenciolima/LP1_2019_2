package review_3_unidade;

public class Principal {

	public static void main(String[] args) {
		BaseDados BD = new BaseDados();
		Estagiario coitado1 = new Estagiario();
		BD.inserir(coitado1);
		Estagiario coitado2 = new Estagiario();
		BD.inserir(coitado2);
		Gerente alfa1 = new Gerente("123", 1000.0, 45.1);
		BD.inserir(alfa1);
		Gerente alfa2 = new Gerente("321", 1000.0, 45.1);
		BD.inserir(alfa2);
		Desenvolvedor beta1 = new Desenvolvedor("333", 500.0);
		BD.inserir(beta1);
		Desenvolvedor beta2 = new Desenvolvedor("444", 250.0);
		BD.inserir(beta2);
		System.out.println(BD.procurar("123"));
		System.out.println(BD.procurar("333"));
		System.out.println(BD.procurar("444"));
		
	}

}

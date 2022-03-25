package prova_III_unidade;

public class Principal {

	public static void main(String[] args) {
		Circulo bola1 = new Circulo(2.0);
		Circulo bola2 = new Circulo(3.4);
		Retangulo ret1 = new Retangulo(2.0, 3.0);
		Retangulo ret2 = new Retangulo(3.1, 4.3);
		Quadrado quad1  = new Quadrado(2.0);
		Quadrado quad2  = new Quadrado(3.1);
		BaseDados bd = new BaseDados();
		bd.inserir(bola1);
		bd.inserir(bola2);
		bd.inserir(ret1);
		bd.inserir(ret2);
		bd.inserir(quad1);
		bd.inserir(quad2);
		bd.imprimir();

	}

}

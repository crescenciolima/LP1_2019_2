package prova_III_unidade;

public class Circulo implements forma_geometrica {
	private static final double pi = 3.14;
	private double raio;
	
	public Circulo(double raio){
		this.raio = raio;
	}
	
	public double perimetro(){
		return 2 * pi * raio;
	}
	
	public double area(){
		return pi * raio * raio;
	}

}

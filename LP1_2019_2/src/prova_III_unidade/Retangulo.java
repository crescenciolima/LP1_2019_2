package prova_III_unidade;

public class Retangulo extends Quadrilatero {
	
	public Retangulo(double base, double altura){
		super(base, altura, base, altura);
	}
	
	public double area(){
		return lado1 * lado2;
	}
	
}

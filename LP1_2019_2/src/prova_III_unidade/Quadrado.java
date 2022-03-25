package prova_III_unidade;

public class Quadrado extends Quadrilatero {
	public Quadrado(double lado){
		super(lado, lado, lado, lado);
	}
	
	public double area(){
		return lado1 * lado1;
	}
}

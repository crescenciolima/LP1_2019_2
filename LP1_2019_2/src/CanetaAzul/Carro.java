package CanetaAzul;

public class Carro implements Veiculo, Motor {
	private String nome;
	private String Id;
	private String modelo;
	private String fabricante;
	
	public Carro(String nome, String Id, String modelo, String fabricante){
		this.nome = nome;
		this.Id = Id;
		this.modelo = modelo;
		this.fabricante = fabricante;
	}
	
	// Implementada por conta da interface Veiculo
	public String getNome() {
		return nome;
	}

	// Implementada por conta da interface Veiculo
	public String getId() {
		return Id;
	}

	// Implementada por conta da interface Motor
	public String getModelo() {
		return modelo;
	}

	// Implementada por conta da interface Motor
	public String getFabricante() {
		return fabricante;
	}

}

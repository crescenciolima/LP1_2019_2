package exemplo_ploi;

public class Reptil extends Animal implements AnimalDomesticado {
	private String cordaescama;
	
	public Reptil(double peso, int idade, int membros, String cordaescama){
		super(peso, idade, membros);
		this.cordaescama = cordaescama;
	}
	
	public void locomover(){
		System.out.println("Rastejando");
	}
	
	public void alimentar(){
		System.out.println("Comendo vegetais");
	}
	
	public void emitirsom(){
		System.out.println("Som de Reptil");
	}
	
	public void reproducaoReptil(){
		System.out.println("Pondo ovos");
	}
	
	public void levarVeterinario(){
		System.out.println("Indo para Cliv");
	}
	
}










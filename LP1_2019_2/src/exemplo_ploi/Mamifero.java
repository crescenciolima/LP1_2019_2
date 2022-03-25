package exemplo_ploi;

public class Mamifero extends Animal {
	private String cordopelo;
	
	public Mamifero(double peso, int idade, int membros, String cordopelo){
		super(peso, idade, membros);
		this.cordopelo = cordopelo;
	}
	
	@Override
	public void locomover(){
		System.out.println("Andando");
	}
	
	public void alimentar(){
		System.out.println("Mamando");
	}
	
	public void emitirsom(){
		System.out.println("Som de mamífero");
	}
	
	public void imprimir(){
		super.imprimir();
		System.out.println(this.cordopelo);
	}

	@Override
	public void levarVeterinario() {
		// TODO Auto-generated method stub
		
	}
	
	
}

package exemplo_ploi;

public class Cachorro extends Mamifero implements AnimalEstimacao{
	
	public Cachorro(double peso, int idade, int membros, String cordopelo){
		super(peso, idade, membros, cordopelo);
	}

	public void brincar() {
		System.out.println("Brincando no parque");
	}

	public void levarPassear() {
		System.out.println("Passeando na rua");
	}
	
	
}

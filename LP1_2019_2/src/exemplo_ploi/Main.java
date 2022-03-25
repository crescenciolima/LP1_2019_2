package exemplo_ploi;

public class Main {

	public static void main(String[] args) {
		//Animal test = new Animal();
		Mamifero dog = new Mamifero(70.0, 35, 4, "malhado");
		dog.imprimir();
		dog.locomover();
		dog.alimentar();
		dog.emitirsom();
		
		Cachorro dogNovo = new Cachorro(70.0, 35, 4, "malhado");
		dogNovo.brincar();
		dog.levarVeterinario();
		
		
		Reptil cobra = new Reptil(15.5, 10, 0, "verde");
		cobra.imprimir();
		cobra.locomover();
		cobra.alimentar();
		cobra.emitirsom();
		cobra.reproducaoReptil();
		
		
		

	}

}





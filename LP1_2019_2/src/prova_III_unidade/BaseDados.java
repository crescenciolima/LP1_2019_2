package prova_III_unidade;

public class BaseDados {
	private int indice;
	private forma_geometrica [] bd;
	private static final int MAX = 4;
	
	public BaseDados(){
		indice = 0;
		bd = new forma_geometrica[MAX];
	}
	
	public void inserir(forma_geometrica forma){
		try{
			bd[indice] = forma;
			indice++;			
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Array estourado: " + e);
		}
	}
	
	public void imprimir(){
		for(int i=0; i < indice; i++){
			System.out.println(bd[i].perimetro());
			System.out.println(bd[i].area());
		}
	}
	
}

package review_3_unidade;

public class BaseDados {
	private int indice;
	private Funcionario_Generico [] BD;
	private static final int MAX = 2;
	
	public BaseDados(){
		indice = 0;
		BD = new Funcionario_Generico[MAX];
	}
	
	public void inserir(Funcionario_Generico x){
		try{
			BD[indice] = x;
			indice++;
		}catch(Exception e){
			System.out.println("Array estourado");
		}
	}
	
	public boolean procurar(String CPF){
		boolean temp = false;
		for (int i = 0; i < indice; i++){
			if(BD[i].getCPF().equals(CPF)){
				temp = true;
				break;
			}
		}
		return temp;
	}
	
}

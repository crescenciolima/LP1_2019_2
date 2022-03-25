package Exercicio_Array;

public class Teste_erro {

	public static void main(String[] args) {
		System.out.println("Inicio do Main");

			metodo1();
		System.out.println("Final do Main");
		
	}
	
	public static void metodo1(){
		System.out.println("Inicio do metodo 1");
		try{
		 metodo2();
		}catch(Exception e){
			System.out.println("Erro " + e);
		}
		finally{
			System.out.println("Test");
		}
		
		System.out.println("Final do metodo 1");
	}
	
	public static void metodo2(){
		System.out.println("Inicio do metodo 2");
		int [] matriz = new int[10];
		for(int i = 0; i < 15; i++){
			matriz[i] = i;
			System.out.println(i);
		}
		
		System.out.println("Fim do metodo 2");
		
		
		
		
	}
	
	
	
	
	
	
	

}

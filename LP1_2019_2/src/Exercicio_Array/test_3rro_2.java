package Exercicio_Array;

public class test_3rro_2 {

	public static void main(String[] args) {
		String frase = null;
		String nova_frase = null;
		try{ 
			nova_frase = frase.toUpperCase();
		} catch(Exception e){
			System.out.println("A frase esta nula");
			frase = "Frase vazia";
		} finally {
			nova_frase = frase.toUpperCase();
		}
		System.out.println("Frase antiga " + frase);
		System.out.println("Frase alterada " + nova_frase);
	}

}

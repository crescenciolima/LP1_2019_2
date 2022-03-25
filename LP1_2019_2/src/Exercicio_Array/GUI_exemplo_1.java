package Exercicio_Array;

import javax.swing.JOptionPane;

public class GUI_exemplo_1 {

	public static void main(String[] args) {
		
		int numero1 = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
		int numero2 = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero: "));
		JOptionPane.showMessageDialog(null, "Resultado da soma: " + (numero1 + numero2));

	}

}

package cursojava.executavel;

import javax.swing.JOptionPane;

public class ArrayVetor {
	
	/* Usado para executar codigo */
	public static void main(String[] args) {
		
		
		
		String[] valores = {"alex", "90", "Curso de java", "contato@jdevtreinamento.com.br"};
		
		
		
		
		for (int pos = 0; pos < valores.length; pos++) {
			
			System.out.println("Valor na posição " + pos + " é igual = " + valores[pos]);
			
		}
		
	}

}

package cursojava.executavel;

public class ArrayVetor {
	
	/* Usado para executar codigo */
	public static void main(String[] args) {
		
		
		/* Array pode ser de todos tipos de dados e objetos também */
		
		
		/* Array sempre deve ter a quantidade de posiçoes definidas */
		double[] notas = new double[4];
		
		
		/* Atribuir valor nas posiçoes do array */
		
		notas[0] = 7.8;
		notas[1] = 8.7;
		notas[2] = 9.7;
		notas[3] = 9.9;
		
		
		
		for (int pos = 0; pos < 4; pos++) {
			System.out.println("Nota" + " " + (pos + 1) + " " + "é =" + " " + notas[pos]);
			
		}
		
		
	}

}

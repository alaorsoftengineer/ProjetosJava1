package cursojava.executavel;

import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.List;

public class SplitArray {
	
	
	
	
	public static void main(String[] args) {
		
		
		String texto = "alex, curso java, 80, 70, 90, 89";
		
		
		String[] valoresArray = texto.split(", ");
		
		System.out.println("Nome: " + valoresArray[0]);
		System.out.println("Curso: " + valoresArray[1]);
		System.out.println("Nota 1: " + valoresArray[2]);
		System.out.println("Nota 2: " + valoresArray[3]);
		System.out.println("Nota 3: " + valoresArray[4]);
		System.out.println("Nota 4:" + valoresArray[5]);
		
		
	    /* Convertendo um Array em uma lista */
		
		List<String> list = Arrays.asList(valoresArray);
		
		for (String valorString : list) {
			System.out.println(valorString);
				
		}
		
		/* Converter uma lista para Array */
		String[] conversaoArray = conversaoArray(list);
        System.out.println(Arrays.toString(conversaoArray));
	
		
		
	}

	// Definindo o método conversaoArray
    public static String[] conversaoArray(List<String> list) {
        return list.toArray(new String[0]);
    }
	
	
	

}

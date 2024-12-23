package cursojava.executavel;

import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex JDev - Treinamento");
		
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("56575765757");
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("Pablo Neruda");
		
		
		System.out.println(aluno);
		System.out.println("-------------------------------------------------------------");
		System.out.println(diretor);
		System.out.println("-------------------------------------------------------------");
		System.out.println(secretario);
		
		
		
	}

}

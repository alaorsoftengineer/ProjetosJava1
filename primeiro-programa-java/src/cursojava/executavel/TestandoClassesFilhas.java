package cursojava.executavel;

import curso.java.alex.Pessoa;
import cursojava.classes.Aluno;
import cursojava.classes.Diretor;
import cursojava.classes.Secretario;

public class TestandoClassesFilhas {
	
	
	public static void main(String[] args) {
		
		Aluno aluno = new Aluno();
		aluno.setNome("Alex JDev - Treinamento");
		aluno.setIdade(16);
		
		
		
		Diretor diretor = new Diretor();
		diretor.setRegistroGeral("56575765757");
		diretor.setNome("Egídio");
		diretor.setIdade(50);
		
		
		Secretario secretario = new Secretario();
		secretario.setNome("Pablo Neruda");
		secretario.setIdade(18);
		
		
		
		System.out.println(aluno);
		System.out.println(diretor);
		System.out.println(secretario);
		
		
		System.out.println(aluno.pessoaMaiorIdade());
		System.out.println(diretor.pessoaMaiorIdade());
		System.out.println(secretario.pessoaMaiorIdade());
		
		
		System.out.println("Salário Aluno é = " + aluno.salario());
		System.out.println("Salário Diretor é = " + diretor.salario());
		System.out.println("Salário Secretário é = " + secretario.salario());
		
		

		
		
	}

}

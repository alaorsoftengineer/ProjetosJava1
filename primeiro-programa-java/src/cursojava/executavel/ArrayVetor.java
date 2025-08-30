package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class ArrayVetor {
	
	/* Usado para executar codigo */
	public static void main(String[] args) {
		
		
		double[] notas = {8.8,9.7,7.6,6.8};
		double[] notasLogica = {7.6,6.7,8.6,9.8};
		
		
		/* Criação do aluno */
		Aluno aluno = new Aluno();
		aluno.setNome("Alex Fernando Egidio");
		aluno.setNomeEscola("JDEV Treinamento");
		
		
		
		/* Criação da disciplina */
		Disciplina disciplina = new Disciplina();
		disciplina.setDisciplina("Curso de Java");
		disciplina.setNota(notas);
		
		
		aluno.getDisciplinas().add(disciplina);
		
		Disciplina disciplina2 = new Disciplina();
		disciplina2.setDisciplina("Lógica de Programação");
		disciplina2.setNota(notasLogica);
		

		aluno.getDisciplinas().add(disciplina2);
		
	}

}

package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	
	
	
	
	/*Main é um método autoexecutavel em Java*/
	public static void main(String[] args) {
		
		
		
		/* new Aluno() é uma instancia (Criação de um objeto) */
		
		/* aluno1 (variável) é uma referência para o objeto Aluno() */
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno ?");
		String idade = JOptionPane.showInputDialog("Qual a idade ?");
		
		
		
		
		
		Aluno aluno1 = new Aluno(); /* Aqui será o João */
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade));
		aluno1.setDataNascimento("14/10/87");
		aluno1.setRegistroGeral("345673445");
		aluno1.setNumeroCpf("026.456.786-20");
		aluno1.setNomeMae("Joana");
		aluno1.setNomePai("Pedro");
		aluno1.setDataMatricula("28/12/2020");
		aluno1.setNomeEscola("Atlas");
		aluno1.setSerieMatriculado("Setimo");
		
		
		
		for (int pos = 1; pos <= 4; pos++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da Disciplina"+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da Disciplina"+pos+" ?");
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
			
		}
		
		
		
		
		
		System.out.println("Nome do aluno1 é = " + aluno1.getNome());
		System.out.println("Idade do aluno1 é = " + aluno1.getIdade());
		System.out.println("O CPF do aluno1 é = " + aluno1.getNumeroCpf());
		System.out.println("A média da Nota do aluno1 é = " + aluno1.getMediaNota());
		System.out.println("Resultado é: " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		
		
		
		
		
		
		
		/* ========================================================================== */
		
		
		
		Aluno aluno2 = new Aluno(); /* Aqui será o Pedro */
		
		Aluno aluno3 = new Aluno(); /* Aqui será o Alex */
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
		
		
		
	}
	
	
}

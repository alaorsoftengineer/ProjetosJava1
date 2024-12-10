package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {
	
	
	
	
	/*Main é um método autoexecutavel em Java*/
	public static void main(String[] args) {
		
		
		
		/* new Aluno() é uma instancia (Criação de um objeto) */
		
		/* aluno1 (variável) é uma referência para o objeto Aluno() */
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno ?");
		String idade = JOptionPane.showInputDialog("Qual a idade ?");
		
		String disciplina1 = JOptionPane.showInputDialog("Qual a Disciplina 1 ?");
		String Nota1 = JOptionPane.showInputDialog("Qual a Nota 1 ?");
		
		String disciplina2 = JOptionPane.showInputDialog("Qual a Disciplina 2 ?");
		String Nota2 = JOptionPane.showInputDialog("Qual a Nota 2 ?");
		
		String disciplina3 = JOptionPane.showInputDialog("Qual a Disciplina 3 ?");
		String Nota3 = JOptionPane.showInputDialog("Qual a Nota 3 ?");
		
		String disciplina4 = JOptionPane.showInputDialog("Qual a Disciplina 4 ?");
		String Nota4 = JOptionPane.showInputDialog("Qual a Nota 4 ?");
		
		
		
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
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		aluno1.getDisciplina().setNota1(Double.parseDouble(Nota1));
		aluno1.getDisciplina().setNota2(Double.parseDouble(Nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(Nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(Nota4));
		
		
		
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

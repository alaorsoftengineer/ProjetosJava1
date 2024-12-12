package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {
	
	
	
	
	/*Main é um método autoexecutavel em Java*/
	public static void main(String[] args) {
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		for(int qtd = 0; qtd <= 2; qtd++) {
			
		
		
		
		/* new Aluno() é uma instancia (Criação de um objeto) */
		
		/* aluno1 (variável) é uma referência para o objeto Aluno() */
		
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno "+qtd+" ?");
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
		
		
		
		/* Esse parte remove a Disciplina selecionada (1, 2, 3 ou 4) */
		int escolha = JOptionPane.showConfirmDialog(null, "Deseja Remover alguma disciplina ?");
		
		
		if (escolha == 0) {  /* Opção SIM e Zero */
		
		int continuarRemover = 0;
		
		int posicao = 1;
		
		
		while (continuarRemover == 0) {
			String disciplinaRemover = JOptionPane.showInputDialog("Qual Disciplina quer Remover?: 1, 2, 3 ou 4");
			aluno1.getDisciplinas().remove(Integer.valueOf(disciplinaRemover).intValue() -posicao);
			posicao++;
			continuarRemover = JOptionPane.showConfirmDialog(null, "Continuar Remover ?");
			}
		}
		
			alunos.add(aluno1);
		}
		
		for (Aluno aluno : alunos) {
			
			System.out.println("Nome do aluno1 é = " + aluno.getNome());
			System.out.println("A média da Nota do aluno é = " + aluno.getMediaNota());
			System.out.println("Resultado é: " + (aluno.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
			System.out.println("--------------------------------------------------------------------");
			
			
		}
		
		
		
		
		
		
		
		
		
		/* ========================================================================== */
		
		
		
		Aluno aluno2 = new Aluno(); /* Aqui será o Pedro */
		
		Aluno aluno3 = new Aluno(); /* Aqui será o Alex */
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
		
		
		
	}
	
	
}

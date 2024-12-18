package cursojava.executavel;

import java.util.ArrayList;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	
	
	
	
	/*Main é um método autoexecutavel em Java*/
	public static void main(String[] args) {
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		List<Aluno> alunosAprovados = new ArrayList<Aluno>();
		List<Aluno> alunosRecuperacao = new ArrayList<Aluno>();
		List<Aluno> alunosReprovados = new ArrayList<Aluno>();
		
		
		
		for(int qtd = 0; qtd <= 5; qtd++) {
			
		
		
		
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
		
		
		
		alunos.add(aluno1);
		
		
		for (Aluno aluno : alunos) {
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				
				alunosAprovados.add(aluno);
			}else
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					alunosRecuperacao.add(aluno);
					
				}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					alunosReprovado.add(aluno);
					
				}
			
		}
		
		System.out.println("---------------Lista dos Aprovados---------------");
		for (Aluno aluno : alunosAprovados) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		
		System.out.println("---------------Lista dos Reprovados---------------");
		for (Aluno aluno : alunosReprovados) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		
		System.out.println("---------------Lista dos Recuperação---------------");
		for (Aluno aluno : alunosRecuperacao) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		
		
		
		/* ========================================================================== */
		
		
		
		Aluno aluno2 = new Aluno(); /* Aqui será o Pedro */
		
		Aluno aluno3 = new Aluno(); /* Aqui será o Alex */
		
		Aluno aluno4 = new Aluno("Maria");
		
		Aluno aluno5 = new Aluno("José", 50);
		
		
		
		
	}
	
	
   }
	
}

package cursojava.executavel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;
import cursojava.constantes.StatusAluno;

public class PrimeiraClasseJava {
	
	
	
	
	/*Main é um método autoexecutavel em Java*/
	public static void main(String[] args) {
		
		
		
		
		String login = JOptionPane.showInputDialog("Informe o login");
		String senha = JOptionPane.showInputDialog("Informe a senha");
		
		if (login.equalsIgnoreCase("admin") && senha.equalsIgnoreCase("admin")) {
			
		
		
		
		
		List<Aluno> alunos = new ArrayList<Aluno>();
		
		
		/* É uma lista que dentro dela temos uma chave que identifica uma sequencia de valores também*/
		HashMap<String, List<Aluno>> maps = new HashMap<String, List<Aluno>>();
		
	
		
		
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
		
		
		maps.put(StatusAluno.APROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.REPROVADO, new ArrayList<Aluno>());
		maps.put(StatusAluno.RECUPERACAO, new ArrayList<Aluno>());
		
		
		
		
		for (Aluno aluno : alunos) {
			
			if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.APROVADO)) {
				maps.get(StatusAluno.APROVADO).add(aluno);
				
			}else
				if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
					maps.get(StatusAluno.RECUPERACAO).add(aluno);
					
				}else if (aluno.getAlunoAprovado2().equalsIgnoreCase(StatusAluno.REPROVADO)) {
					maps.get(StatusAluno.REPROVADO).add(aluno);
					
				}
			
		}
		
		System.out.println("---------------Lista dos Aprovados---------------");
		for (Aluno aluno : maps.get(StatusAluno.APROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		
		System.out.println("---------------Lista dos Reprovados---------------");
		for (Aluno aluno : maps.get(StatusAluno.REPROVADO)) {
			System.out.println("Resultado = " + aluno.getAlunoAprovado2() + " com média de = " + aluno.getMediaNota());
		}
		
		
		System.out.println("---------------Lista dos Recuperação---------------");
		for (Aluno aluno : maps.get(StatusAluno.RECUPERACAO)) {
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
	
}

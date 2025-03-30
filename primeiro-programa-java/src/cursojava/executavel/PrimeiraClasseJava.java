package cursojava.executavel;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Secretario;
import cursojava.classesauxiliares.FuncaoAutenticacao;
import cursojava.constantes.StatusAluno;
import cursojava.interfaces.PermitirAcesso;

public class PrimeiraClasseJava {
    
    public static void main(String[] args) {
    	
        try {
            
            File fil = new File("/Users/alaorcastelano/Desktop/Lines.txt");
            Scanner scanner = new Scanner(fil);

            String login = JOptionPane.showInputDialog("Informe o login");
            String senha = JOptionPane.showInputDialog("Informe a senha");

            FuncaoAutenticacao autenticacao = new FuncaoAutenticacao();
            PermitirAcesso permitirAcesso = new Secretario(login, senha);
            

            // Correção: Chamando a autenticação corretamente
            if (autenticacao.autenticarCursoJava(permitirAcesso)) {
                
                List<Aluno> alunos = new ArrayList<>();
                HashMap<String, List<Aluno>> maps = new HashMap<>();
                

                maps.put(StatusAluno.APROVADO, new ArrayList<>());
                maps.put(StatusAluno.REPROVADO, new ArrayList<>());
                maps.put(StatusAluno.RECUPERACAO, new ArrayList<>());
                

                for (int qtd = 0; qtd < 5; qtd++) { // Correção: <= 5 pode levar a um loop extra
                    String nome = JOptionPane.showInputDialog("Qual o nome do aluno " + (qtd + 1) + "?");
                    String idade = JOptionPane.showInputDialog("Qual a idade?");
                    

                    Aluno aluno = new Aluno();
                    aluno.setNome(nome);
                    aluno.setIdade(Integer.parseInt(idade)); // Correção: Integer.valueOf() também funciona

                    alunos.add(aluno);
                }

                for (Aluno aluno : alunos) {
                    String status = aluno.getAlunoAprovado2();
                    
                    if (status.equalsIgnoreCase(StatusAluno.APROVADO)) {
                        maps.get(StatusAluno.APROVADO).add(aluno);
                        
                    } else if (status.equalsIgnoreCase(StatusAluno.RECUPERACAO)) {
                        maps.get(StatusAluno.RECUPERACAO).add(aluno);
                        
                    } else if (status.equalsIgnoreCase(StatusAluno.REPROVADO)) {
                        maps.get(StatusAluno.REPROVADO).add(aluno);
                    }
                }

                // Exibição dos alunos por categoria
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

            } else {
                JOptionPane.showMessageDialog(null, "Acesso não permitido");
            }

            scanner.close(); // Correção: Fechar scanner para evitar vazamento de memória

        } catch (FileNotFoundException e) {
            JOptionPane.showMessageDialog(null, "Arquivo não encontrado: " + e.getMessage());
            
        } catch (Exception e) { // Captura todas as exceções não previstas
            e.printStackTrace();
            JOptionPane.showMessageDialog(null, "Erro inesperado: " + e.getClass().getName());
        }finally { /* Sempre é executado ocorrendo erros ou não. */
        	JOptionPane.showMessageDialog(null, "Obrigado por usar JAVA");
        	
        }
    }
}
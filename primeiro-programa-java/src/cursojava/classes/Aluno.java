package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

import cursojava.constantes.StatusAluno;

/*Esta é nossa Classe / Objeto que representa o aluno*/
public class Aluno extends Pessoa {
	
	
	
	/* Esses são os atributos do aluno */
	
	
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
	
	
	
	public Aluno() {
	
		
	}	
	
    public Aluno(String nomePadrao) {
    	
    	nome = nomePadrao;
    }
    
    public Aluno(String nomePadrao, int idadePadrao) {
    	
    	nome = nomePadrao;
    	idade = idadePadrao;
    	
    }
    
    
    
	
	
    public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
    
    
    public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}
    
    
    
    
    
    
    
    
    
    /* Recebe dados */
    public void setNome(String nome) {
    	this.nome = nome;
    	
    }
    
    public String getNome() {
    	return this.nome;
    	
    }

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataNascimento() {
		return dataNascimento;
	}

	public void setDataNascimento(String dataNascimento) {
		this.dataNascimento = dataNascimento;
	}

	public String getRegistroGeral() {
		return registroGeral;
	}

	public void setRegistroGeral(String registroGeral) {
		this.registroGeral = registroGeral;
	}

	public String getNumeroCpf() {
		return numeroCpf;
	}

	public void setNumeroCpf(String numeroCpf) {
		this.numeroCpf = numeroCpf;
	}

	public String getNomeMae() {
		return nomeMae;
	}

	public void setNomeMae(String nomeMae) {
		this.nomeMae = nomeMae;
	}

	public String getNomePai() {
		return nomePai;
	}

	public void setNomePai(String nomePai) {
		this.nomePai = nomePai;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	public String getNomeEscola() {
		return nomeEscola;
	}

	public void setNomeEscola(String nomeEscola) {
		this.nomeEscola = nomeEscola;
	}

	public String getSerieMatriculado() {
		return serieMatriculado;
	}

	public void setSerieMatriculado(String serieMatriculado) {
		this.serieMatriculado = serieMatriculado;
	}

	

	
    
    /* Método que retorna a média do aluno */
	public double getMediaNota() {
		
		
		double somaNotas = 0.0;
		
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getMediaNotas();
		}
		
	    return somaNotas / disciplinas.size();
	
    }
	
	
	
    
    @Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataNascimento=" + dataNascimento + ", registroGeral="
				+ registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae + ", nomePai=" + nomePai
				+ ", dataMatricula=" + dataMatricula + ", nomeEscola=" + nomeEscola + ", serieMatriculado="
				+ serieMatriculado + "]";
	}
    
    
    
    

	/* Método que verifica se o aluno está aprovado */
    public boolean getAlunoAprovado() {
    	double media = this.getMediaNota();
    	if(media >= 70) {
    		return true;
    	}else {
    		return false;
    	}
    		
    }
    	
    public String getAlunoAprovado2() {
        double media = this.getMediaNota();
        if (media >= 50) {
        	if (media >= 70) {
        		return StatusAluno.APROVADO;
        		
        	}else {
        		return StatusAluno.RECUPERACAO;
        	}
        		
        } else {
        	return StatusAluno.REPROVADO;
        }
        
        
        		
        		
    	
    	
    	
    }

    
    @Override    /* Identifica método Sobreescrito */
    public boolean pessoaMaiorIdade() {
    	
    	return super.pessoaMaiorIdade();
    }

	@Override
	public double salario() {
		
		return 1500.90;
	}
	
    
      

}




package cursojava.classes;

import java.util.ArrayList;
import java.util.List;

/*Esta é nossa Classe / Objeto que representa o aluno*/
public class Aluno {
	
	
	
	/* Esses são os atributos do aluno */
	
	private String nome;
	private int    idade;
	private String dataNascimento;
	private String registroGeral;
	private String numeroCpf;
	private String nomeMae;
	private String nomePai;
	private String dataMatricula;
	private String nomeEscola;
	private String serieMatriculado;
	
	
	
	
	
	
	public Aluno() {
	
		
	}	
	
    public Aluno(String nomePadrao) {
    	
    	nome = nomePadrao;
    }
    
    public Aluno(String nomePadrao, int idadePadrao) {
    	
    	nome = nomePadrao;
    	idade = idadePadrao;
    	
    }
    
    
    private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	
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

	public double getNota1() {
		return nota1;
	}

	public void setNota1(double nota1) {
		this.nota1 = nota1;
	}

	public double getNota2() {
		return nota2;
	}

	public void setNota2(double nota2) {
		this.nota2 = nota2;
	}

	public double getNota3() {
		return nota3;
	}

	public void setNota3(double nota3) {
		this.nota3 = nota3;
	}

	public double getNota4() {
		return nota4;
	}

	public void setNota4(double nota4) {
		this.nota4 = nota4;
	}
    
    /* Método que retorna a média do aluno */
	public double getMediaNota() {
	    return 0;
	
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
        if (media >= 70) {
            return "Aluno está Aprovado";
        } else {
            return "Aluno está Reprovado";
        }
    	
    	
    	
    }

	
    
    
    
    
    
    
    
    
    

}




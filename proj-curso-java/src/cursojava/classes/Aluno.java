package cursojava.classes;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class Aluno {
	
	/*esses s�o os atributos do Aluno*/
	private String nome;
	private int idade;
	private String dataDeNascimento;
	private	String registroGeral;
	private	String numeroCpf;
	private	String nomeMae;
	private	String nomePai;
	private	String nomeEscola;
	private String dataMatricula;

	private List<Disciplina> disciplinas = new ArrayList<Disciplina>();
	
	public void setDisciplinas(List<Disciplina> disciplinas) {
		this.disciplinas = disciplinas;
	}
	
	public List<Disciplina> getDisciplinas() {
		return disciplinas;
	}

	public String getDataMatricula() {
		return dataMatricula;
	}

	public void setDataMatricula(String dataMatricula) {
		this.dataMatricula = dataMatricula;
	}

	private	String serieMatriculado;
	
	public Aluno() {/*Cria os dados na mem�ria sendo padr�o do Java*/
		
	}
	
	public Aluno(String nomePadrao) {
		nome = nomePadrao;
	}
	
	public Aluno(String nomePadrao, int idadePadrao) {
		nome = nomePadrao;
		idade = idadePadrao;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getIdade() {
		return idade;
	}

	public void setIdade(int idade) {
		this.idade = idade;
	}

	public String getDataDeNascimento() {
		return dataDeNascimento;
	}

	public void setDataDeNascimento(String dataDeNascimento) {
		this.dataDeNascimento = dataDeNascimento;
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
	
	/* M�todo que retorna a m�dia do aluno*/
	public double getMediaNota() {
		
		double somaNotas =0.0;
		for (Disciplina disciplina : disciplinas) {
			somaNotas += disciplina.getNota();
		}
		
		return somaNotas / disciplinas.size() ;
	}
	
	@Override
	public String toString() {
		return "Aluno [nome=" + nome + ", idade=" + idade + ", dataDeNascimento=" + dataDeNascimento
				+ ", registroGeral=" + registroGeral + ", numeroCpf=" + numeroCpf + ", nomeMae=" + nomeMae
				+ ", nomePai=" + nomePai + ", nomeEscola=" + nomeEscola + ", dataMatricula=" + dataMatricula
				+ ", serieMatriculado=" + serieMatriculado + "]";
	}

	/* M�todo que retorna true para aprovado e false para reprovado*/
	public boolean getAlunoAprovado() {
		double media = this.getMediaNota();
		if(media >= 70) {
			return true;
		}else {
			return false;
		}
	}
	
	/*M�todo que retorna string com frase de aprovado / reprovado*/
	public String getAlunoAprovado2() {
		double media = this.getMediaNota();
		if(media >= 70) {
			return "Aluno est� aprovado";
		}else {
			return "Aluno est� reprovado";
		}
	}




	@Override
	public int hashCode() {
		return Objects.hash(nome, numeroCpf);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Aluno other = (Aluno) obj;
		return Objects.equals(nome, other.nome) && Objects.equals(numeroCpf, other.numeroCpf);
	}
	
	/* veremos os m�todos Getters e Setters do Objeto*/
	/* SET � para adicionar ou receber dados para os atributos*/
	/* GET � para resgatar ou obter o valor do atributo*/
	
	

}
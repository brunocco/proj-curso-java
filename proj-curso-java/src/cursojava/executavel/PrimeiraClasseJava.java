package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;
import cursojava.classes.Disciplina;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*new Aluno() � uma inst�ncia ( cria��o de objeto)*/
		/*aluno1 � uma refer�ncia para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual RG?");
		String cpf = JOptionPane.showInputDialog("Qual CPF?");
		String mae = JOptionPane.showInputDialog("Qual nome da m�e?");
		String pai = JOptionPane.showInputDialog("Qual nome do pai?");
		String matricula = JOptionPane.showInputDialog("Qual data da matricula?");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		String escola = JOptionPane.showInputDialog("Qual nome da escola?");

				
		Aluno aluno1 = new Aluno();
		
		aluno1.setNome(nome);
		aluno1.setIdade(Integer.valueOf(idade)); //converte para inteiros
		aluno1.setDataDeNascimento(dataNascimento);
		aluno1.setRegistroGeral(rg);
		aluno1.setNumeroCpf(cpf);
		aluno1.setNomeMae(mae);
		aluno1.setNomePai(pai);
		aluno1.setDataMatricula(matricula);
		aluno1.setSerieMatriculado(serie);
		aluno1.setNomeEscola(escola);

		for (int pos =1 ; pos <= 4; pos ++) {
			String nomeDisciplina = JOptionPane.showInputDialog("Nome da disciplina "+pos+" ?");
			String notaDisciplina = JOptionPane.showInputDialog("Nota da disciplina "+pos+" ?");
			
			Disciplina disciplina = new Disciplina();
			disciplina.setDisciplina(nomeDisciplina);
			disciplina.setNota(Double.valueOf(notaDisciplina));
			
			aluno1.getDisciplinas().add(disciplina);
		}
		
		/*metodo sem toString
		System.out.println("O Nome �: " + aluno1.getNome());
		System.out.println("A idade �: " + aluno1.getIdade());
		System.out.println("A data de nascimento �: " + aluno1.getDataDeNascimento());
		System.out.println("A M�dia da nota �: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());*/
		
		
		//toString facilita deixando a descricao do objeto mas detalhado quando declarado
		System.out.println(aluno1.toString()); // Descricao do objeto na mem�ria
		System.out.println("M�dia do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
		
		/*Equals e hashcode (diferenciar e comparar objetos)
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Bruno");
		aluno1.setNumeroCpf(123);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Bruno");
		aluno2.setNumeroCpf(123);
		
		if(aluno1.equals(aluno2)) {
			System.out.println("S�o iguais");
		}else {
			System.out.println("n�o s�o iguais");
		} */
	}

}

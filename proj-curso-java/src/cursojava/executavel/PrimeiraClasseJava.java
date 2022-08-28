package cursojava.executavel;

import javax.swing.JOptionPane;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*new Aluno() é uma instância ( criação de objeto)*/
		/*aluno1 é uma referência para o objeto aluno*/
		
		String nome = JOptionPane.showInputDialog("Qual o nome do aluno?");
		String idade = JOptionPane.showInputDialog("Qual a idade?");
		String dataNascimento = JOptionPane.showInputDialog("Qual data de nascimento?");
		String rg = JOptionPane.showInputDialog("Qual RG?");
		String cpf = JOptionPane.showInputDialog("Qual CPF?");
		String mae = JOptionPane.showInputDialog("Qual nome da mãe?");
		String pai = JOptionPane.showInputDialog("Qual nome do pai?");
		String matricula = JOptionPane.showInputDialog("Qual data da matricula?");
		String serie = JOptionPane.showInputDialog("Qual a serie?");
		String escola = JOptionPane.showInputDialog("Qual nome da escola?");
		String disciplina1 = JOptionPane.showInputDialog("Disciplina 1?");
		String nota1 = JOptionPane.showInputDialog("Qual a nota 1?");
		
		String disciplina2 = JOptionPane.showInputDialog("Disciplina 2?");
		String nota2 = JOptionPane.showInputDialog("Qual a nota 2?");
		
		String disciplina3 = JOptionPane.showInputDialog("Disciplina 3?");
		String nota3 = JOptionPane.showInputDialog("Qual a nota 3?");
		
		String disciplina4 = JOptionPane.showInputDialog("Disciplina 4?");
		String nota4 = JOptionPane.showInputDialog("Qual a nota 4?");
				
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
		aluno1.getDisciplina().setNota1(Double.parseDouble(nota1)); //converte para valores double
		aluno1.getDisciplina().setNota2(Double.parseDouble(nota2));
		aluno1.getDisciplina().setNota3(Double.parseDouble(nota3));
		aluno1.getDisciplina().setNota4(Double.parseDouble(nota4));
		
		aluno1.getDisciplina().setDisciplina1(disciplina1);
		aluno1.getDisciplina().setDisciplina2(disciplina2);
		aluno1.getDisciplina().setDisciplina3(disciplina3);
		aluno1.getDisciplina().setDisciplina4(disciplina4);
		
		/*metodo sem toString*/
		System.out.println("O Nome é: " + aluno1.getNome());
		System.out.println("A idade é: " + aluno1.getIdade());
		System.out.println("A data de nascimento é: " + aluno1.getDataDeNascimento());
		System.out.println("A Média da nota é: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());
		
		
		//toString facilita deixando a descricao do objeto mas detalhado quando declarado
		System.out.println(aluno1.toString()); // Descricao do objeto na memória
		System.out.println("Média do aluno: " + aluno1.getMediaNota());
		System.out.println("Resultado: " + aluno1.getAlunoAprovado2());
		
		/*Equals e hashcode (diferenciar e comparar objetos)
		
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Bruno");
		aluno1.setNumeroCpf(123);
		
		Aluno aluno2 = new Aluno();
		aluno2.setNome("Bruno");
		aluno2.setNumeroCpf(123);
		
		if(aluno1.equals(aluno2)) {
			System.out.println("São iguais");
		}else {
			System.out.println("não são iguais");
		} */
	}

}

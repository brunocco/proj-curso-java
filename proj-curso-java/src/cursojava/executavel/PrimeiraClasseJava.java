package cursojava.executavel;

import cursojava.classes.Aluno;

public class PrimeiraClasseJava {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*new Aluno() � uma inst�ncia ( cria��o de objeto)*/
		/*aluno1 � uma refer�ncia para o objeto aluno*/
		Aluno aluno1 = new Aluno();
		aluno1.setNome("Bruno Cesar");
		aluno1.setIdade(35);
		aluno1.setDataDeNascimento("18/12/1986");
		aluno1.setRegistroGeral("1111.1111.11");
		aluno1.setNumeroCpf("999.999.999-99");
		aluno1.setNomeMae("Maria");
		aluno1.setNomePai("Jo�o");
		aluno1.setDataMatricula("01/01/2019");
		aluno1.setSerieMatriculado("5");
		aluno1.setNomeEscola("Escola Dev Java");
		aluno1.setNota1(90);
		aluno1.setNota2(80.8);
		aluno1.setNota3(70.9);
		aluno1.setNota4(90.7);
		
		
		System.out.println("O Nome �: " + aluno1.getNome());
		System.out.println("A idade �: " + aluno1.getIdade());
		System.out.println("A data de nascimento �: " + aluno1.getDataDeNascimento());
		System.out.println("A M�dia da nota �: " + aluno1.getMediaNota());
		System.out.println("Resultado = " + (aluno1.getAlunoAprovado() ? "Aprovado" : "Reprovado"));
		System.out.println("Resultado = " + aluno1.getAlunoAprovado2());

	}

}

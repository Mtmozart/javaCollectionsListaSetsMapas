package br.com.alura;

public class TestaAlunoNoCurso {

	public static void main(String[] args) {
		Curso javaColecoes = new Curso("Dominando as coleções!", "Matheus Mozart");
		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		System.out.println(javaColecoes.getAulas());
		
		Aluno a1 = new Aluno("Rodrigo Turini", 349712);
		Aluno a2 = new Aluno("Guilherme Silveira", 5617);
		Aluno a3 = new Aluno("Maricio Carvalho", 349712);
		
		javaColecoes.matricula(a1);
		javaColecoes.matricula(a2);
		javaColecoes.matricula(a3);
		
		System.out.println("Quem é o aluno com matrícula 5617?");
		Aluno aluno = javaColecoes.buscaMatricula(5618);
		System.out.println(aluno);
		
		
	}

}

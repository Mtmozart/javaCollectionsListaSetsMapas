package br.com.alura;

import java.util.Iterator;
import java.util.Set;

public class TestaCursoComAluno {

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
		
		System.out.println("Todos os alunos matriculados: ");
		javaColecoes.getAlunos().forEach(a -> {
			System.out.println(a);
		});
		System.out.println("Aluno está matriculado: " + a1);
		System.out.println(javaColecoes.mostrarAlunoMatriculados(a1));
		
		Aluno turini = new Aluno("Rodrigo Turini", 34672);
		System.out.println("Está matriculadoTUrini");
		System.out.println(javaColecoes.mostrarAlunoMatriculados(turini));
		System.out.println("O a1 é equals ao Turini?");
		System.out.println(a1.equals(turini));
		//se dois elementos são obrigatoriamente diferentes, serão equals no hashcode.
		System.out.println("-----------Iterator como verificar SET, já que n tem get-----------");
		Set<Aluno> alunos = javaColecoes.getAlunos();
		Iterator<Aluno> interador = alunos.iterator();
		while(interador.hasNext()) {
			Aluno proximo = interador.next();
			System.out.println(proximo);
		}
		
		
		
		

	}

}

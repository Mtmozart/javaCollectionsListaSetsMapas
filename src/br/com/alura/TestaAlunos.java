package br.com.alura;

import java.util.Collection;
import java.util.HashSet;

public class TestaAlunos {

	public static void main(String[] args) {
		Collection<String> alunos = new HashSet<>();
		alunos.add("Rodrigo goés");
		alunos.add("Isadora Pinto");
		alunos.add("Nico Steppat");
		alunos.add("Sergio Lopez");
		alunos.add("Renan Saggio");
		alunos.add("Mauricio de Souza");
		System.out.println(alunos);
		
		for (String aluno : alunos) {
			System.out.println(aluno);
		}
		
		var teste = alunos.contains("Lionel Messi");
		System.out.println(teste);
		
		alunos.remove("Rodrigo goés");
		System.out.println(alunos);
	}
}

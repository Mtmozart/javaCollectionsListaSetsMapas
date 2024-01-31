package br.com.alura;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Curso javaColecoes = new Curso("Dominando as coleções!", "Matheus Mozart");

		List<Aula> aulasImutaveis = javaColecoes.getAulas();
		System.out.println(aulasImutaveis);

		javaColecoes.adiciona(new Aula("Trabalhando com ArrayList", 21));
		javaColecoes.adiciona(new Aula("Criando uma Aula", 20));
		javaColecoes.adiciona(new Aula("Modelando com coleções", 24));

		List<Aula> aulas = new ArrayList<>(aulasImutaveis);
		System.out.println(javaColecoes.getAulas());
		
		Collections.sort(aulas);
		System.out.println(aulas);
		
		System.out.println(javaColecoes.getTempoTotal());
		System.out.println(javaColecoes);
		

	}

}

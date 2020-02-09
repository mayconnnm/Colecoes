package br.com.alura.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestaCurso {

	public static void main(String[] args) {
		Curso javaCursos = new Curso("Dominando as cole��es", "Paulo");

		javaCursos.adicionar(new Aula("Trabalhando com ArrayList", 21));
		javaCursos.adicionar(new Aula("Criando uma aula", 20));
		javaCursos.adicionar(new Aula("Modelando cole��es", 22));

		System.out.println(javaCursos.getAulas());

		// N�o � poss�vel ordenar as aulas devido ao unmodifiable, pois ele retorna uma
		// lista que n�o pode ser modificada
		// Collections.sort(javaCursos.getAulas());

		// Uma forma de solucionar esse problema � criando outra lista e recebendo a
		// lista de aulas no construtor
		List<Aula> aulas = new ArrayList<>(javaCursos.getAulas());
		Collections.sort(aulas);
		System.out.println(aulas);

//		System.out.println(javaCursos.getTempoTotal());
//		aulas.add(new Aula("Estrutura de Dados", 10));
//		System.out.println(aulas);
		
		System.out.println(javaCursos.getTempoTotal());
	
		System.out.println(javaCursos);
	}

}
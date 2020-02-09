package br.com.alura.set;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;

public class TestaAlunos {

	public static void main(String[] args) {

		// Set faz parte da interface Collection como a List, por�m, set � um conjunto
		// onde n�o possui uma ordem como a lista e tamb�m o set n�o permite passar
		// valores repitidos, o Set tamb�m possui outra diferen�a que � o desempenho,
		// quando buscar algum valor, ele n�o percorrer� uma lista e sim buscar�
		// diretamente do conjunto

		// Set<String> alunos = new HashSet();
		Collection<String> alunos = new HashSet();

		alunos.add("Rafael");
		alunos.add("Antonio");
		alunos.add("Gabriel");
		alunos.add("Presa");
		alunos.add("Tadeu");
		alunos.add("Pablo");

		System.out.println(alunos);
		System.out.println();

		for (String aluno : alunos) {
			System.out.println(aluno);
		}

		System.out.println();

		alunos.forEach(aluno -> System.out.println(aluno));

		// O construtor de List aceita uma Collection, sendo assim � poss�vel converter
		// um conjunto para uma lista
		List<String> alunosLista = new ArrayList<>(alunos);
	}
}

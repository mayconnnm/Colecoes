package br.com.alura.list;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class TestaListaAula {

	public static void main(String[] args) {
		Aula a1 = new Aula("Revisitando as ArraysList", 21);
		Aula a2 = new Aula("Listas de objetos", 15);
		Aula a3 = new Aula("Relacionamento de listas e objetos", 30);

		ArrayList<Aula> listaAulas = new ArrayList<Aula>();
		listaAulas.add(a1);
		listaAulas.add(a2);
		listaAulas.add(a3);

		System.out.println(listaAulas);

		Collections.sort(listaAulas);

		System.out.println(listaAulas);

		Collections.sort(listaAulas, Comparator.comparing(Aula::getTempo));

		System.out.println(listaAulas);

		// Apartir do Java8 as listas possuem o método sort
		listaAulas.sort(Comparator.comparing(Aula::getTitulo));
		
		System.out.println(listaAulas);
	}
}
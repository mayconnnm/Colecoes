package br.com.alura.list;

import java.util.ArrayList;
import java.util.Collections;

public class TestandoListas {

	public static void main(String[] args) {

		String aula1 = "Conhecendo mais de listas";
		String aula2 = "Modelando a classe aula";
		String aula3 = "Trabalhando com cursos e sets";

		ArrayList<String> aulas = new ArrayList<String>();
		aulas.add(aula1);
		aulas.add(aula2);
		aulas.add(aula3);

//		aulas.remove(0);

//		for (String aula : aulas) {
//			System.out.println(aula);
//		}

		// Lâmbda
		aulas.forEach(aula -> {
			System.out.println("Aula: " + aula);
		});

		System.out.println();

		// Ordena por ordem alfabética
		Collections.sort(aulas);
		
		System.out.println(aulas);
	}
}
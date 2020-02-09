package br.com.alura.set;

import java.util.Iterator;
import java.util.Set;

import br.com.alura.list.Aula;
import br.com.alura.list.Curso;

public class TestaCursoAluno {

	public static void main(String[] args) {
		Curso javaCursos = new Curso("Dominando as cole��es", "Paulo");
		javaCursos.adicionar(new Aula("Trabalhando com ArrayList", 21));
		javaCursos.adicionar(new Aula("Criando uma aula", 20));
		javaCursos.adicionar(new Aula("Modelando cole��es", 22));

		Aluno a1 = new Aluno("Rodrigo", 34672);
		Aluno a2 = new Aluno("Matheus", 79161);
		Aluno a3 = new Aluno("Lucas", 1020);

		javaCursos.matricular(a1);
		javaCursos.matricular(a2);
		javaCursos.matricular(a3);

		System.out.println(a1);

		System.out.println(javaCursos.getAulas());
		javaCursos.getAulas().forEach(aluno -> System.out.println(aluno));

		System.out.println(javaCursos.existeAluno(a1));

		System.out.println(a1.equals(a1));

		Set<Aluno> alunos = javaCursos.getAlunos();

		for (Aluno aluno : alunos) {
			System.out.println(aluno);
		}

		// Abaixo da versão 5 só era possível percorrer uma coleção através do
		// Iterator, todas as coleções possuem o método iterator(), devido a interface
		// Collection ser filha de Iterable
		Iterator<Aluno> iterador = alunos.iterator();
		while (iterador.hasNext()) {
			Aluno aluno = iterador.next();
			System.out.println(aluno);
		}
	}
}

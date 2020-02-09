package br.com.alura.set;

import br.com.alura.list.Aula;
import br.com.alura.list.Curso;

public class TestaAlunoNoCurso {

	public static void main(String[] args) {
		Curso javaCursos = new Curso("Dominando as coleï¿½ï¿½es", "Paulo");
		javaCursos.adicionar(new Aula("Trabalhando com ArrayList", 21));
		javaCursos.adicionar(new Aula("Criando uma aula", 20));
		javaCursos.adicionar(new Aula("Modelando coleï¿½ï¿½es", 22));

		Aluno a1 = new Aluno("Rodrigo", 34672);
		Aluno a2 = new Aluno("Matheus", 5617);
		Aluno a3 = new Aluno("Lucas", 1020);

		javaCursos.matricular(a1);
		javaCursos.matricular(a2);
		javaCursos.matricular(a3);

		System.out.println("Quem é o aluno com a matrícula 5617");
		Aluno aluno = javaCursos.buscaMatricula(5617);

		System.out.println(javaCursos.buscaMatricula(5617));

		//		Map<Integer, Set<Aluno>> matriculaParaAlunos;
	}
}
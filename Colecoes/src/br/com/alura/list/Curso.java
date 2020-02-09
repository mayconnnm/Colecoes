package br.com.alura.list;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Set;

import br.com.alura.set.Aluno;

public class Curso {

	// private int tempoTotal = 0;
	private String nome;
	private String instrutor;
	private List<Aula> aulas = new LinkedList<Aula>();
	private Set<Aluno> alunos = new HashSet<>();
	private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	// Imprime o conjunto na ordem que foi adicionado, porém, não é possível acessar
	// a posição de um elemento
	// private Set<Aluno> alunos = new LinkedHashSet<>();

	// Só é possível utilizar tendo a implementação do Comparable ou no construtor
	// passando como argumento o Comparator
	// private Set<Aluno> alunos = new TreeSet<>();

	// Percorre as linhas na ordem que foi feita os puts
	// private Map<Integer, Aluno> matriculaParaAluno = new LinkedHashMap<>();

	// Utiliza o threadSafe
	// private Map<Integer, Aluno> matriculaParaAluno = new HashMap<>();

	public Curso(String nome, String instrutor) {
		this.nome = nome;
		this.instrutor = instrutor;
	}

	public String getNome() {
		return nome;
	}

	public String getInstrutor() {
		return instrutor;
	}

	public List<Aula> getAulas() {
		return Collections.unmodifiableList(aulas);
	}

	// public int getTempoTotal() {
	// return tempoTotal;
	// }

	public Set<Aluno> getAlunos() {
		return Collections.unmodifiableSet(alunos);
	}

	public void adicionar(Aula aula) {
		this.aulas.add(aula);
		// tempoTotal += aula.getTempo();
	}

	public int getTempoTotal() {
		return this.aulas.stream().mapToInt(Aula::getTempo).sum();
	}

	public void matricular(Aluno aluno) {
		alunos.add(aluno);
		matriculaParaAluno.put(aluno.getMatricula(), aluno);
	}

	public boolean existeAluno(Aluno aluno) {
		return alunos.contains(aluno);
	}

	public Aluno buscaMatricula(int numero) {
		if (!matriculaParaAluno.containsKey(numero))
			throw new NoSuchElementException();
		return matriculaParaAluno.get(numero);
		// for (Aluno aluno : alunos) {
		// if(aluno.getMatricula() == numero) {
		// return aluno;
		// }
		// }
		// throw new NoSuchElementException("Matrícula não encontrada");
	}

	@Override
	public String toString() {
		return "[Curso: " + nome + ", tempo total: " + getTempoTotal() + " minutos, aulas: " + aulas + "]";
	}

}
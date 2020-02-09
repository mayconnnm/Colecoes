package br.com.alura.list;

public class Aula implements Comparable<Aula> {

	private String titulo;
	private int tempo;

	public Aula(String titulo, int tempo) {
		if (titulo != null && tempo > 0) {
			this.titulo = titulo;
			this.tempo = tempo;
		} else {
			throw new IllegalArgumentException("Título ou Tempo digitado inválido");
		}
	}

	public String getTitulo() {
		return titulo;
	}

	public int getTempo() {
		return tempo;
	}

	@Override
	public String toString() {
		return "Aula: " + this.titulo + ", " + this.tempo + " minutos";
	}

	@Override
	public int compareTo(Aula outraAula) {
		return this.titulo.compareTo(outraAula.titulo);
	}
}
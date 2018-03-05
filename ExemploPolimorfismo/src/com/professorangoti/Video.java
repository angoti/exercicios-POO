package com.professorangoti;

public class Video extends Midia {
	private String diretor;

	public Video(String comentario, String titulo, double tempoDuracao, boolean emprestado, String diretor) {
		super(comentario, titulo, tempoDuracao, emprestado);
		this.diretor = diretor;
	}

	public String getDiretor() {
		return diretor;
	}

	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	
	@Override
	public String toString() {
		return getComentario();
	}
	
	public void exibir() {
		
		System.out.println("-"+diretor);
	}
}

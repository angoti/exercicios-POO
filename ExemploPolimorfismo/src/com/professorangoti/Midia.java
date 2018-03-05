package com.professorangoti;

public abstract class Midia extends Object {
	private String comentario, titulo;
	private double tempoDuracao;
	private boolean emprestado;

	public Midia(String comentario, String titulo, double tempoDuracao, boolean emprestado) {
		this.comentario = comentario;
		this.titulo = titulo;
		this.tempoDuracao = tempoDuracao;
		this.emprestado = emprestado;
	}

	public String getComentario() {
		return comentario;
	}

	public void setComentario(String comentario) {
		this.comentario = comentario;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public double getTempoDuracao() {
		return tempoDuracao;
	}

	public void setTempoDuracao(double tempoDuracao) {
		this.tempoDuracao = tempoDuracao;
	}

	public boolean isEmprestado() {
		return emprestado;
	}

	public void setEmprestado(boolean emprestado) {
		this.emprestado = emprestado;
	}
	
	public abstract void exibir();

}

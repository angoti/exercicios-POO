package com.professorangoti;

public class Cd extends Midia {

	private String artista;
	private int nroMusicas;

	public Cd(String comentario, String titulo, double tempoDuracao, boolean emprestado, String artista,
			int nroMusicas) {
		super(comentario, titulo, tempoDuracao, emprestado);
		this.artista = artista;
		this.nroMusicas = nroMusicas;
	}

	public String getArtista() {
		return artista;
	}

	public void setArtista(String artista) {
		this.artista = artista;
	}

	public int getNroMusicas() {
		return nroMusicas;
	}

	public void setNroMusicas(int nroMusicas) {
		this.nroMusicas = nroMusicas;
	}
	
	public void exibir() {
		
		System.out.println("-"+artista+"-"+nroMusicas);
	}

}

package com.professorangoti;

import java.util.ArrayList;

public class BaseDados {
	private ArrayList<Midia> lista;

	public BaseDados() {
		lista = new ArrayList<Midia>();
	}

	public void apagar(int idCd) {
		lista.remove(idCd);
	}

	public void inserir(Midia m) {
		lista.add(m);
	}

	public void listar() {
		for (Midia m : lista) {
			m.exibir();
			System.out.println(m);
		}
	}

}

package com.professorangoti;

public class Programa {
	public static void main(String[] args) {
		Cd cd1 = new Cd("Paulo Civino", "muito engraçado", 120.0, false, "O planeta dos macacos", 2);
		Video v1 = new Video("U2", "muito bom", 120, true, "Joshua");

		BaseDados bd = new BaseDados();
		bd.inserir(cd1);
		bd.inserir(v1);

		bd.listar();

		bd.apagar(0);
		System.out.println("-----------------------");
		bd.listar();

	}
}

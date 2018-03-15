package com.professorangoti;

public class Funcionario {
	String nome, departamento, rg;
	double salario;
	boolean estaNaEmpresa;
	Data dataEntrada;

	void mostra() {
		String departamento = "";
		System.out.println("Nome: " + this.nome + "\nDepartamento: " + this.departamento + "\nSalario: " + salario);
	}

	public static void main(String[] args) {
		Funcionario f1 = new Funcionario();
		f1.nome = "Danilo";
		f1.salario = 100;
		f1.departamento = "Vendas";
		f1.dataEntrada.ano = 2000;
		f1.dataEntrada.dia = 01;
		f1.dataEntrada.mes = 12;
		
		new Funcionario().dataEntrada.ano =1;
		

		Funcionario f2 = new Funcionario();
		f2.nome = "Danilo";
		f2.salario = 100;
		f2.departamento = "Desenvolvimento";

		f2.mostra();

		Funcionario f3 = f1;
		if (f1 == f3) {
			System.out.println("iguais");
		} else {
			System.out.println("diferentes");
		}

	}
}

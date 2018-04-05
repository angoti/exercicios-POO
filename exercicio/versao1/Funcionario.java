package ocp.exercicio.versao1;

public class Funcionario {
	private String cargo,nome;
	private double totalVendas;
	private double salarioBase;

	public Funcionario(String cargo, double totalVendas, double salarioBase, String nome) {
		super();
		this.cargo = cargo;
		this.totalVendas = totalVendas;
		this.salarioBase = salarioBase;
		this.nome = nome;
	}

	public String getCargo() {
		return cargo;
	}

	public double getTotalVendas() {
		return totalVendas;
	}

	public double getSalarioBase() {
		return salarioBase;
	}

	public String getNome() {
		return nome;
	}
}

package ocp.exercicio.versao2;

public class Funcionario {
	private String cargo,nome;
	private double totalVendas;
	private double salarioBase;
	private double meta;

	public Funcionario(String cargo, double totalVendas, double salarioBase, String nome, double meta) {
		super();
		this.cargo = cargo;
		this.totalVendas = totalVendas;
		this.salarioBase = salarioBase;
		this.nome = nome;
		this.meta = meta;
	}

	public final double getMeta() {
		return meta;
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

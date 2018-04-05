package ocp.exercicio.versao1;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	public static void main(String[] args) {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario(2.25);
		Funcionario roberto = new Funcionario("Gerente", 0, 100, "Roberto");
		Funcionario robson = new Funcionario("Vendedor", 5000, 50, "Robson");
		Funcionario keilane = new Funcionario("Assistente", 0, 50, "Keilane");
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(roberto);
		funcionarios.add(robson);
		funcionarios.add(keilane);
		for (Funcionario funcionario : funcionarios) {
			System.out.println("\nFuncionario: "+funcionario.getNome()+" - Salario: "+calculadora.calcula(funcionario.getCargo(), funcionario.getTotalVendas(), funcionario.getSalarioBase()));
		}
	}
}

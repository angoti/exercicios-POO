package ocp.exercicio.versao2;

import java.util.ArrayList;
import java.util.List;

public class Sistema {
	public static void main(String[] args) {
		CalculadoraDeSalario calculadora = new CalculadoraDeSalario(2.25);
		Funcionario roberto = new Funcionario("Gerente", 0, 100, "Roberto",0);
		Funcionario robson = new Funcionario("Vendedor", 5000, 50, "Robson",10000);
		Funcionario keilane = new Funcionario("Assistente", 0, 50, "Keilane",0);
		Funcionario gabriel = new Funcionario("Supervisor", 0, 75, "Gabriel",0);
		List<Funcionario> funcionarios = new ArrayList<Funcionario>();
		funcionarios.add(roberto);
		funcionarios.add(robson);
		funcionarios.add(keilane);
		funcionarios.add(gabriel);
		for (Funcionario funcionario : funcionarios) {
			System.out.println("\nFuncionario: "+funcionario.getNome()+" - Salario: "+calculadora.calcula(funcionario.getCargo(), funcionario.getTotalVendas(), funcionario.getSalarioBase(),funcionario.getMeta()));
		}
	}
}

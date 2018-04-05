// adicionar cargo supervisor -> salario=1.5*salario base
// adicionar regra se o vendedor bater a meta, ganha bonus de 50. A meta é definida para cada vendedor.
package ocp.exercicio.versao2;

public class CalculadoraDeSalario {
	double incentivo;

	public CalculadoraDeSalario(double incentivo) {
		super();
		this.incentivo = incentivo;
	}

	public double calcula(String cargo, double totalVendas, double salarioBase, double meta) {
		double salario = 0;
		if (cargo == "Gerente") {
			salario = 2 * salarioBase + incentivo;
		}
		if (cargo == "Vendedor") {
			if (totalVendas > meta)
				salario = salarioBase + (totalVendas * 0.03) + 50 + incentivo;
			else
				salario = salarioBase + (totalVendas * 0.03) + incentivo;
		}
		if (cargo == "Assistente") {
			salario = salarioBase + incentivo;
		}
		if (cargo == "Supervisor") {
			salario = salarioBase * 1.5 + incentivo;
		}
		return salario;
	}
}

package ocp.exercicio.versao1;

public class CalculadoraDeSalario {
	double incentivo;
	
	public CalculadoraDeSalario(double incentivo) {
		super();
		this.incentivo = incentivo;
	}

	public double calcula(String cargo, double totalVendas, double salarioBase) {
		double salario=0;
		if (cargo == "Gerente") {
			salario = 2*salarioBase + incentivo;
		}
		if (cargo == "Vendedor") {
			salario = salarioBase + (totalVendas * 0.03);
		}
		if (cargo == "Assistente") {
			salario = salarioBase + incentivo;
		}
		return salario;
	}
}

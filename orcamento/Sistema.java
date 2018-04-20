package strategy.orcamento;

public class Sistema {

	public static void main(String[] args) {
		Orcamento orcamento = new Orcamento(500.0);
		CalculadoraDeImposto calculador = new CalculadoraDeImposto();
		// Calculando o ISS
		calculador.realizaCalculo(orcamento, "iss");
		// Calculando o ICMS
		calculador.realizaCalculo(orcamento, "icms");
	}
}
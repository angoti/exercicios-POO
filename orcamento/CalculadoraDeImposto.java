package strategy.orcamento;

public class CalculadoraDeImposto {
	public void realizaCalculo(Orcamento orcamento, String imposto) {
		if (imposto.equals("icms")) {
			double icms = orcamento.getValor() * 0.10;
			System.out.println(icms);
		}
		else if(imposto.equals("iss")) {
			double iss = orcamento.getValor()*0.06;
			System.out.println(iss);
		}
	}
}

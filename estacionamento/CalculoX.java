package strategy.estacionamento;

public class CalculoX implements Calculo {

	public CalculoX() {
	}

	@Override
	public double calcularTarifa(int quantidadeDeHoras) {
		return quantidadeDeHoras;
	}

}

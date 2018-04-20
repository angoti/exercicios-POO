package strategy.estacionamento;

public class CalculoDiaria implements Calculo {

	private double valorDiaria;

	public CalculoDiaria(double valorDiaria) {
		this.valorDiaria = valorDiaria;
	}

	@Override
	public double calcularTarifa(int horas) {
		return (int)Math.ceil(horas / 24.0) * valorDiaria;
	}

}

package strategy.estacionamento;

public class CalculoHora implements Calculo {

	protected double valorHora;

	public CalculoHora(double valorPorHora) {
		this.valorHora = valorPorHora;
	}

	@Override
	public double calcularTarifa(int horas) {
		return  valorHora*horas;
	}

}

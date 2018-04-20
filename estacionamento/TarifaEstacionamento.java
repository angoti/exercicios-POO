package strategy.estacionamento;

public class TarifaEstacionamento {

	private int horas;
	private Calculo calculo;

	public TarifaEstacionamento(int horas, Calculo calculo) {
		this.horas = horas;
		this.calculo = calculo;
	}

	public double valor() {
		return calculo.calcularTarifa(horas);
	}

}

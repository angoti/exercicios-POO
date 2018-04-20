package strategy.estacionamento;

public class CalculoHoraValorAdicional implements Calculo {

	private int horasIniciais;
	private double valorHorasIniciais;
	private double valorPorHoraAdicional;

	public CalculoHoraValorAdicional(double valorHorasIniciais, int horasIniciais, double valorPorHoraAdicional) {
		this.horasIniciais = horasIniciais;
		this.valorHorasIniciais = valorHorasIniciais;
		this.valorPorHoraAdicional = valorPorHoraAdicional;
	}

	@Override
	public double calcularTarifa(int horas) {
		return horas > horasIniciais ? 
				valorHorasIniciais + (horas - horasIniciais) * valorPorHoraAdicional
				: valorHorasIniciais;
	}

}

package com.professorangoti;

class Conta {
	private int numero;
	private String cliente;
	private double saldo, limite;
	
	public int getNumero() {
		return numero;
	}

	public String getCliente() {
		return cliente;
	}

	public void setCliente(String cliente) {
		this.cliente = cliente;
	}

	public double getSaldo() {
		return saldo;
	}

	public double getLimite() {
		return limite;
	}

	void depositar(double valor) {
		this.saldo  += valor;
	}
	
	boolean sacar(double valor) {
		if(saldo < valor)
			return false;
		else {
			saldo -= valor;
			return true;
		}
	}
	
	
}





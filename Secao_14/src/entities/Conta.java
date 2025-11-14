package entities;

import exceptions.ContaException;

public class Conta {
	private Integer numero;
	private String titular;
	private Double saldo;
	private Double limiteSaque;

	public Conta() {

	}

	public Conta(Integer numero, String titular, Double saldo, Double limiteSaque) {
		this.numero = numero;
		this.titular = titular;
		this.saldo = saldo;
		this.limiteSaque = limiteSaque;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public String getTitular() {
		return titular;
	}

	public void setTitular(String titular) {
		this.titular = titular;
	}

	public Double getSaldo() {
		return saldo;
	}

	public Double getLimiteSaque() {
		return limiteSaque;
	}

	public void setLimiteSaque(Double limiteSaque) {
		this.limiteSaque = limiteSaque;
	}

	public void deposito(double deposito) {
		saldo += deposito;
	}

	public void saque(double saque) {
		if (saque > saldo) {
			throw new ContaException("Você não possui saldo suficiente!");
		}

		if (saque > limiteSaque) {
			throw new ContaException("Seu saque é superior ao seu limite de saque");
		}

		saldo -= saque;
	}

	@Override
	public String toString() {
		return "novo saldo:" + saldo;
	}

}

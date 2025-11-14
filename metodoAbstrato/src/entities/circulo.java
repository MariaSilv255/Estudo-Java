package entities;

import entities.enums.Color;

public class circulo extends Formato {
	private double raio;	

	public circulo(Color color, double raio) {
		super(color);
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	public void setRaio(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return Math.PI * raio * raio;
	}

}

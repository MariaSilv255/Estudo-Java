package entities;

import entities.enums.Color;

public class Retangulo extends Formato {
	private double largura;
	private double altura;

	public Retangulo() {

	}

	public Retangulo(Color color, double largura, double altura) {
		super(color);
		this.largura = largura;
		this.altura = altura;
	}

	public double getLargura() {
		return largura;
	}

	public void setLargura(double largura) {
		this.largura = largura;
	}

	public double getAltura() {
		return altura;
	}

	public void setAltura(double altura) {
		this.altura = altura;
	}

	// faço uma sobreposição do metodo abstrato
	@Override
	public double area() {
		return largura * altura;
	}

}

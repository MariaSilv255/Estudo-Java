package model.service;

public class BrasilTaxaServico implements TaxaServico{
	
	public double tax(double quantia) {
		if (quantia <= 100.0) {
			return quantia * 0.2;
		} else {
			return quantia * 0.15;
		}
	}
}

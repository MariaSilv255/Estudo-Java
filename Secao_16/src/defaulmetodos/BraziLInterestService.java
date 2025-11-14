package defaulmetodos;

import java.security.InvalidParameterException;

public class BraziLInterestService implements IInterestService {

	private double taxaJuros;

	
	
	public BraziLInterestService(double taxaJuros) {
		this.taxaJuros = taxaJuros;
	}

	@Override
	public double getInterestRate() {
		// TODO Auto-generated method stub
		return taxaJuros;
	}
	
}

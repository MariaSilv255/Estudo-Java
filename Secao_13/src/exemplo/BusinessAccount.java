package exemplo;

public class BusinessAccount extends Account {
	private Double loadLimit;

	public BusinessAccount() {
		super();
		// vai herdar a logica do meu contrutor padrão da pagina que herdei
		// posso deixar sem se quiser;
	}

	public BusinessAccount(Integer number, String holder, Double balance, Double loadLimit) {
		super(number, holder, balance);
		this.loadLimit = loadLimit;
	}

	public Double getLoadLimit() {
		return loadLimit;
	}

	public void setLoadLimit(Double loadLimit) {
		this.loadLimit = loadLimit;
	}

	public void loan(double amount) {
		if (amount <= loadLimit) {
			balance += amount - 10.0;
		}
	}

}

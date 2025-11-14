package entities;

public class Banco {
	
	private String name;
	private int number;
	private double deposit;
		
	public Banco(String name, int number, double deposit) {
		this.name = name;
		this.number = number;
		initalDeposit(deposit);
	}
	
	public void initalDeposit(double value) {
		this.deposit += value;
		
	}
	
	public void withDraw(double value) {
		this.deposit -= value;
		
	}
	
	public String toString() {
		return String.format("account %d, Holder: %s, Balance: %.2f",number,name,deposit);
	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}

	public double getDeposit() {
		return deposit;
	}
}

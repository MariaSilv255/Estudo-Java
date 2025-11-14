package entites;

public class Tercerizado extends Funcionario {

	private double despesaAdicional;

	public Tercerizado() {
		super();
	}

	public Tercerizado(String nome, Integer horas, Double valorHora, double despesaAdicional) {
		super(nome, horas, valorHora);
		this.despesaAdicional = despesaAdicional;
	}

	public double getDespesaAdicional() {
		return despesaAdicional;
	}

	public void setDespesaAdicional(double despesaAdicional) {
		this.despesaAdicional = despesaAdicional;
	}

	@Override
	public Double pagamento() {
		return super.pagamento() + despesaAdicional * 1.1;
	}
}

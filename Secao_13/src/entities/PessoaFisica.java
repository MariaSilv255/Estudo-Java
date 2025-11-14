package entities;

public class PessoaFisica extends Pessoa {
	private Double gastoSaude;

	public PessoaFisica() {

	}

	public PessoaFisica(String nome, Double rendaAnual, Double gastoSaude) {
		super(nome, rendaAnual);
		this.gastoSaude = gastoSaude;
	}

	public Double getGastoSaude() {
		return gastoSaude;
	}

	public void setGastoSaude(Double gastoSaude) {
		this.gastoSaude = gastoSaude;
	}

	@Override
	public double imposto() {
		double pocentagem = 0.0;
		double calc = 0.0;
		
		if(getRendaAnual() > 20000) {
			pocentagem = 0.25;
		}else {
			pocentagem = 0.15;
		}
		
		if(gastoSaude != 0) {
			calc = getRendaAnual() * pocentagem - gastoSaude * 0.50;
		}else {
			calc = getRendaAnual() * pocentagem;
		}
		
		return calc;
	}

}

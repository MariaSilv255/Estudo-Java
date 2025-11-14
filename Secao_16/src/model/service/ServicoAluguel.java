package model.service;

import java.time.Duration;

import model.entities.AluguelCarro;
import model.entities.Fatura;

public class ServicoAluguel {
	private Double precoHora;
	private Double precoDia;

	private TaxaServico taxaServico;

	public ServicoAluguel(Double precoHora, Double precoDia, TaxaServico taxaServico) {
		this.precoHora = precoHora;
		this.precoDia = precoDia;
		this.taxaServico = taxaServico;
	}

	public void processoFatura(AluguelCarro carro) {
		double minutos = Duration.between(carro.getInicio(), carro.getFim()).toMinutes();
		double hora = minutos/60.0;
		
		double pagamentoBasico;
		if(hora <= 12) {
			pagamentoBasico = precoHora * Math.ceil(hora);
		}else {
			pagamentoBasico = precoDia * Math.ceil(hora/24);
		}
		double taxa = taxaServico.tax(pagamentoBasico);
		carro.setFatura(new Fatura(pagamentoBasico,taxa));
	}
	
}

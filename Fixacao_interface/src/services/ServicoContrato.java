package services;

import java.time.LocalDate;

import model.entities.Contrato;
import model.entities.Parcela;

public class ServicoContrato {

	private IServicoPagamentoOnline servicoOnlineInterface;

	public ServicoContrato(IServicoPagamentoOnline servicoOnlineInterface) {
		this.servicoOnlineInterface = servicoOnlineInterface;
	}

	public void processoContrato(Contrato contrato, int mes) {
		
		double parcela = contrato.getValorTotal() / mes;

		double taxapagamento;
		double juroMensal;
		LocalDate data;

		for (int i = 1; i <= mes; i++) {
			juroMensal = servicoOnlineInterface.juros(parcela, i);
			taxapagamento = servicoOnlineInterface.taxaPagamento(juroMensal);
			data = contrato.getData().plusMonths(i);
			contrato.addParcela(new Parcela(data, taxapagamento));
		}

	}

}

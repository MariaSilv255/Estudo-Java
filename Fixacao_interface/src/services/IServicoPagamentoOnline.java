package services;

import java.time.Month;

public interface IServicoPagamentoOnline {
	
	Double taxaPagamento(double valor);

	Double juros(Double valor, Integer meses);
}

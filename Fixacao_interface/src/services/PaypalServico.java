package services;

public class PaypalServico implements IServicoPagamentoOnline {

	private static final double TAXA_PAGAMENTO = 0.02;
	private static final double JUROS = 0.01;
	
	@Override
	public Double taxaPagamento(double valor) {
		
		return valor + (TAXA_PAGAMENTO*valor);
	}

	@Override
	public Double juros(Double valor, Integer meses) {
		// TODO Auto-generated method stub
		return valor + (valor * JUROS) * meses;
	}

}

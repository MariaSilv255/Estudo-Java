import interfaces.IMetodoPagamento;

public class ProcessarPagamento {
	public void realizarPagamento(IMetodoPagamento pagamento, double Valor) {
		pagamento.processarPagamento(Valor);
	}
}

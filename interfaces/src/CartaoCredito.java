import interfaces.IMetodoPagamento;

public class CartaoCredito implements IMetodoPagamento {

	@Override
	public void processarPagamento(double valor) {
		System.out.println("Processando pagamento...");
		
	}

	@Override
	public double extrairPagamento() {
		// TODO Auto-generated method stub
		return 0;
	}

}

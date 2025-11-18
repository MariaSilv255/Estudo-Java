package entites;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import entites.enums.StatusPedido;

public class Pedido {

	private static DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

	private LocalDateTime data;
	private StatusPedido status;

	private List<ItemPedido> pedidos = new ArrayList<>();
	private Cliente cliente;

	public Pedido(LocalDateTime data, StatusPedido status, Cliente cliente) {
		this.data = data;
		this.status = status;
		this.cliente = cliente;
	}

	public LocalDateTime getData() {
		return data;
	}

	public void setData(LocalDateTime data) {
		this.data = data;
	}

	public StatusPedido getStatus() {
		return status;
	}

	public void setStatus(StatusPedido status) {
		this.status = status;
	}

	public List<ItemPedido> getPedidos() {
		return pedidos;
	}

	public void setPedidos(List<ItemPedido> pedidos) {
		this.pedidos = pedidos;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public void addItem(ItemPedido item) {
		pedidos.add(item);
	}

	public void removeItem(ItemPedido item) {
		pedidos.remove(item);
	}

	public double total() {

		double soma = 0.0;
		for (ItemPedido itemPedido : pedidos) {
			soma += itemPedido.subTotal();
		}

		return soma;

	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append("dia do pedido: ");
		sb.append(data.format(formatacao) + "\n");
		sb.append("Status: ");
		sb.append(status + "\n");
		sb.append("Cliente: ");
		sb.append(cliente.getNome() + "\n");
		sb.append("Itens do pedido:\n");
		for (ItemPedido item : pedidos) {
			sb.append(item + "\n");
		}
		sb.append("preco total: $");
		sb.append(String.format("%.2f", total()));
		return sb.toString();
	}

}

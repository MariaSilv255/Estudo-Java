package application;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

import entites.Cliente;
import entites.ItemPedido;
import entites.Pedido;
import entites.Produto;
import entites.enums.StatusPedido;

public class Programa {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		Cliente cliente = dadosCliente(sc);
		StatusPedido statusPedido = statusPedido(sc);
		Pedido pedido = dadosPedido(sc, statusPedido, cliente);
		System.out.println(pedido.toString());
	}

	public static Cliente dadosCliente(Scanner sc) {
		DateTimeFormatter formatacao = DateTimeFormatter.ofPattern("dd/MM/yyyy");

		System.out.println("Insira os dados do cliente:");

		System.out.print("Nome:");
		String nome = sc.nextLine();

		System.out.print("Email:");
		String email = sc.nextLine();

		System.out.print("data nascimento:");
		String dataNascimento = sc.nextLine();

		LocalDate data = LocalDate.parse(dataNascimento, formatacao);
		return new Cliente(nome, email, data);
	}

	public static StatusPedido statusPedido(Scanner sc) {
		System.out.println("Insira os dados do pedido");
		System.out.print("Status:");
		String status = sc.nextLine();
		StatusPedido s = StatusPedido.valueOf(status);
		
		return s;
	}

	public static Pedido dadosPedido(Scanner sc, StatusPedido statusPedido, Cliente cliente) {

		LocalDateTime dataLocal = LocalDateTime.now();
		Pedido pedido = new Pedido(dataLocal, statusPedido, cliente);

		System.out.println("Quantos pedidos desejam: ");
		int quantidadePedido = sc.nextInt();

		for (int i = 0; i < quantidadePedido; i++) {
			sc.nextLine();
			System.out.println("Dados pedidos #" + (i + 1));

			System.out.print("Nome produto: ");
			String nome = sc.nextLine();

			System.out.print("Preço produto:");
			double precoProduto = sc.nextDouble();

			System.out.print("quantidade produto:");
			int quantidadeProduto = sc.nextInt();

			Produto produto = new Produto(nome, precoProduto);
			
			ItemPedido Itempedido = new ItemPedido(quantidadeProduto, precoProduto, produto);
			
			pedido.addItem(Itempedido);

		}
		return pedido;
	}

}
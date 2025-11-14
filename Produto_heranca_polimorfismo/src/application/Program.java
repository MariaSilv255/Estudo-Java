package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Produto;
import entites.ProdutoImportado;
import entites.ProdutoUsado;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int quantidadeProduto = solicitarQuantidade(sc);

		List<Produto> listaProduto = registarProdutos(sc, quantidadeProduto);
		exibirDados(listaProduto);

	}

	public static int solicitarQuantidade(Scanner sc) {
		System.out.print("Informe o numero de produtos");
		int quantidade = sc.nextInt();
		return quantidade;
	}

	public static List<Produto> registarProdutos(Scanner sc, int quantidade) {
		DateTimeFormatter formatacaoData = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		List<Produto> list = new ArrayList<>();

		for (int i = 0; i < quantidade; i++) {

			System.out.println("Produto #" + (i + 1) + ":");
			System.out.print("Comum,usado ou importado? (c,u,i)");
			char caracter = sc.next().charAt(0);

			System.out.print("Nome do produto:");
			sc.nextLine();
			String nome = sc.nextLine();

			System.out.print("preço:");
			double preco = sc.nextDouble();

			if (caracter == 'i') {
				System.out.print("Taxa:");
				double taxa = sc.nextDouble();
				list.add(new ProdutoImportado(nome, preco, taxa));

			} else if (caracter == 'u') {
				System.out.print("Data de fabricacao:");
				sc.nextLine();
				String fabricacaoStr = sc.nextLine();
				LocalDate fabricacao = LocalDate.parse(fabricacaoStr, formatacaoData);
				list.add(new ProdutoUsado(nome, preco, fabricacao));

			} else {
				list.add(new Produto(nome, preco));
			}

		}
		return list;
	}

	public static void exibirDados(List<Produto> listaProduto) {
		System.out.println("");
		System.out.println("tag de preços:");
		for (Produto produto : listaProduto) {
			System.out.println(produto.tagPreco());
		}
	}
}

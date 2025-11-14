package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Pessoa;
import entities.PessoaFisica;
import entities.PessoaJuridica;

public class Programa {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int quantidadeContrinuite = solitarContribuites(sc);
		List<Pessoa> contribuites = alocarDados(quantidadeContrinuite, sc);
		exibirDados(contribuites);
	}

	public static int solitarContribuites(Scanner sc) {
		System.out.println("quantos contribuites?");
		int n = sc.nextInt();
		return n;
	}

	public static List<Pessoa> alocarDados(int quantidadeContrinuite, Scanner sc) {

		List<Pessoa> contribuites = new ArrayList<Pessoa>();

		for (int i = 0; i < quantidadeContrinuite; i++) {

			System.out.print("Pessoa fisica ou juridica (f/j)");
			char c = sc.next().charAt(0);
			sc.nextLine();
			System.out.print("Nome:");
			String nome = sc.nextLine();
			System.out.print("renda anual:");
			double renda = sc.nextDouble();

			if (c == 'f') {
				System.out.print("Gasto com saude:");
				double gasto = sc.nextDouble();
				contribuites.add(new PessoaFisica(nome, renda, gasto));
			} else {
				System.out.print("numero de funcionario:");
				int funcionario = sc.nextInt();
				contribuites.add(new PessoaJuridica(nome, renda, funcionario));
			}
		}
		return contribuites;
	}

	public static void exibirDados(List<Pessoa> contribuites) {
		System.out.println("dados");
		double soma = 0.0;
		for (Pessoa pessoa : contribuites) {
			System.out.println("nome: " + pessoa.getNome() + " - imposto:" + String.format("$%.2f", pessoa.imposto()));
			soma += pessoa.imposto();
		}
		System.out.println("total de taxas:" + soma);
	}
}

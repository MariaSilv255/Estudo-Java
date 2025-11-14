package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entites.Funcionario;
import entites.Tercerizado;

public class Programa {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int quantidade = quantidadeFuncionario(sc);
		List<Funcionario> listaFuncionarios = salvarFuncionario(sc, quantidade);
		ExibirDado(listaFuncionarios);

		sc.close();
	}

	public static int quantidadeFuncionario(Scanner sc) {
		System.out.print("Informe o numero de funcionario:");
		int quantidade = sc.nextInt();
		return quantidade;
	}

	public static List<Funcionario> salvarFuncionario(Scanner sc, int quantidade) {
		List<Funcionario> list = new ArrayList<>();
		for (int i = 0; i < quantidade; i++) {
			System.out.print("Tercerizado (s/n)?");
			char c = sc.next().charAt(0);
			sc.nextLine();

			System.out.print("Nome:");
			String nome = sc.nextLine();

			System.out.print("Hora:");
			int hora = sc.nextInt();

			System.out.print("Valor da hora:");
			double valorHora = sc.nextDouble();

			if (c == 's') {
				System.out.print("Valor da despesa:");
				double custosAdicionais = sc.nextDouble();
				list.add(new Tercerizado(nome, hora, valorHora, custosAdicionais));
			} else {
				list.add(new Funcionario(nome, hora, valorHora));
			}

		}
		return list;
	}

	public static void ExibirDado(List<Funcionario> listaFuncionarios) {
		System.out.println("PAGAMENTOS");
		for (Funcionario func : listaFuncionarios) {
			System.out.println(func.getNome() + " - " + func.pagamento());
		}
	}

}

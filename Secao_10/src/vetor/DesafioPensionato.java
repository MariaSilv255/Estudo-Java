package vetor;

import java.util.Scanner;

import fixacao_vetor.DesafioPersionatoModel;

public class DesafioPensionato {
	public static void main(String[] args) {

		DesafioPersionatoModel[] quartos = new DesafioPersionatoModel[10];

		Scanner sc = new Scanner(System.in);
		System.out.println("Quantos quartos irá alugar?");
		int n = sc.nextInt();

		String nome = "";
		String email = "";
		int quarto = 0;

		for (int i = 0; i < n; i++) {
			sc.nextLine();
			System.out.printf("# Quarto: %d\n", i + 1);
			System.out.print("diga seu nome: ");
			nome = sc.nextLine();
			System.out.print("diga seu email: ");
			email = sc.nextLine();
			System.out.print("diga seu quarto: ");
			quarto = sc.nextInt();
			quartos[quarto] = new DesafioPersionatoModel(nome, email, quarto);
		}

		for (int i = 0; i < quartos.length; i++) {
			if (quartos[i] != null) {
				System.out.println(quartos[i].toString());
			}
		}

		sc.close();
	}
}

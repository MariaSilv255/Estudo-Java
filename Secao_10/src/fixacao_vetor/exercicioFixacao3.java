package fixacao_vetor;

import java.util.Locale;
import java.util.Scanner;

public class exercicioFixacao3 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		String nome[] = new String[n];
		int idade[] = new int[n];
		double altura[] = new double[n];

		for (int i = 1; i <= n; i++) {
			System.out.println(String.format("Dados da %da pessoa", i));

			System.out.println("Nome:");
			sc.nextLine();
			nome[i - 1] = sc.nextLine();

			System.out.println("idade:");
			idade[i - 1] = sc.nextInt();
			System.out.println("altura:");
			altura[i - 1] = sc.nextDouble();
		}
		double alturaMedia = 0;
		double menor = 0;
		for (int i = 0; i < altura.length; i++) {
			alturaMedia += altura[i];
			if (idade[i] < 16) {
				menor++;
			}
		}
		double percentualMenores = ((double) menor / n) * 100.0;
		System.out.println("altura media:" + alturaMedia / n);
		System.out.println("PESSOA MENORES DE IDADE" + percentualMenores);
		sc.close();
	}
}

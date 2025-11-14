package vetor;

import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor3 {
	public static void main(String[] args) {

		System.out.println("quandos pesssoas serão digitadas ?");
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		String[] nome = new String[n];
		int[] idade = new int[n];
		double[] altura = new double[n];

		for (int i = 0; i < n; i++) {
			System.out.printf("dados da %d pessoa:", i + 1);
			sc.nextLine();
			System.out.print("nome");
			nome[i] = sc.nextLine();
			System.out.print("idade");
			idade[i] = sc.nextInt();
			System.out.print("altura");
			altura[i] = sc.nextDouble();
		}
		double somaAltura = 0.0;
		for (int i = 0; i < altura.length; i++) {
			somaAltura += altura[i];
		}

		int quantidade = 0;
		for (int i = 0; i < idade.length; i++) {
			if (idade[i] < 16) {
				quantidade += 1;

			}
		}
		double calcMediaAltura = somaAltura / n;
		double calcPercentualIdade = ((double) quantidade / n) * 100.0;
		System.out.println("media altura:" + calcMediaAltura);
		System.out.println("pessoa com menos de 16 anos " + calcPercentualIdade);

		sc.close();
	}
}

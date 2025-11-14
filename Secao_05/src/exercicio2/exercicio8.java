package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio8 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		double valor = sc.nextDouble();

		double imposto = 0.0;
		if (valor <= 2000) {
			imposto = 0.0;
		} else if (valor <= 3000) {
			imposto = valor * 0.08;
		} else if (valor <= 4500) {
			imposto = (1000 * 0.08) + (valor - 3000) * 0.18;
		} else {
			   imposto = (1000.00 * 0.08) + (1500.00 * 0.18) + (valor - 4500.00) * 0.28;
		}

		if (imposto == 0.0) {
			System.out.println("ISENTO");
		} else {
			System.out.printf("RS$ %.2f", imposto);
		}

		sc.close();
	}
}

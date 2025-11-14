package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio5 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		int quantidade, pedido;
		System.out.print("QUAL É O SEU PEDIDO?");
		pedido = sc.nextInt();
		System.out.print("QUANTIDADE");
		quantidade = sc.nextInt();
		double total = 0;

		if (pedido == 1) {
			total = quantidade * 4.0;
		} else if (pedido == 2) {
			total = quantidade * 4.50;
		} else if (pedido == 3) {
			total = quantidade * 5.0;
		} else if (pedido == 4) {
			total = quantidade * 4.50;
		} else if (pedido == 5) {
			total = quantidade * 1.50;
		}
System.out.printf("total: R$%.2f ",total);
		sc.close();
	}

}

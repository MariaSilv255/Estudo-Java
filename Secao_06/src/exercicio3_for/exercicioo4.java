package exercicio3_for;

import java.util.Locale;
import java.util.Scanner;

public class exercicioo4 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double n1 = sc.nextInt();
			double n2 = sc.nextInt();

			double calc = 0;

			if (n2 != 0) {
				calc = n1 / n2;
				System.out.println(calc);

			} else {
				System.out.println("Divisão impossivel");
			}
		}
		sc.close();

	}
}

package exercicio3_for;

import java.util.Scanner;

public class exercicioo7 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		for (int i = 1; i <= n; i++) {

			int quadrado = i * i;
			int cubo = (int) Math.pow(i, 3);

			System.out.println(i + " " + quadrado + " " + cubo);
		}
		sc.close();
	}
}

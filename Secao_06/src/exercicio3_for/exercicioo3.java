package exercicio3_for;
import java.util.Scanner;

public class exercicioo3 {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {

			double nota1 = sc.nextDouble();
			double nota2 = sc.nextDouble();
			double nota3 = sc.nextDouble();
			
			double media = (nota1 * 2 + nota2 * 3 + nota3 * 5) / 10;
			System.out.printf("media:%.1f",media);

		}

		sc.close();
	}
}

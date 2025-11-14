package vetor;
import java.util.Locale;
import java.util.Scanner;

public class ExercicioVetor1 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		double[] itens = new double[n];

		for (int i = 0; i < n; i++) {
			itens[i] = sc.nextDouble();
		}
		double soma = 0.0;
		for (int i = 0; i < n; i++) {
			soma += itens[i];
		}

		System.out.println("average height" + soma/n);
		sc.close();
	}
}

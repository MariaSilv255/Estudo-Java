package vetor;

import java.util.Locale;
import java.util.Scanner;

import entities_vetor.produto2;

public class ExercicioVetor2 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();

		produto2[] produto = new produto2[n];

		for (int i = 0; i < n; i++) {
			String nome = sc.nextLine();
			double preco = sc.nextDouble();
			produto[i] = new produto2(nome, preco);
		}
		double soma = 0.0;
		
		System.out.print("Valores: ");
		for (int i = 0; i < produto.length; i++) {
			soma += produto[i].getPreco();
			System.out.printf("%.1f ",produto[i].getPreco());
		}

	
		System.out.println("a soma é" + soma);
		System.out.println("a media é" + soma / n);

		sc.close();
	}
}

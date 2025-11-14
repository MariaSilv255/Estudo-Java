package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio2 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int x, y;
		x = sc.nextInt();
		y = sc.nextInt();

		while (y != 0 && x != 0) {
			
			if (x > 0 && y > 0) {
				System.out.println("Primeiro");
				

			} else if (x < 0 && y > 0) {
				System.out.println("Segundo");
				

			} else if (x < 0 && y < 0) {
				System.out.println("Terceiro");
				
			} else if (x > 0 && y < 0) {
				System.out.println("quarto");
				
			}
			x = sc.nextInt();
			y = sc.nextInt();
		}
		System.out.print("item nulo");
		sc.close();
	}

}

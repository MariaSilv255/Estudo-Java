package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio6 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double intervalo = sc.nextDouble();

		if (0 < intervalo && intervalo >100) {
			System.out.println("INTERVAO (25,50)");
		} else if (intervalo <= 25) {
			System.out.println("INTERVAO (0,25)");

		} else if (intervalo <= 50) {
			System.out.println("INTERVAO (25,50)");

		} else if (intervalo <= 75) {
			System.out.println("INTERVAO (50,75)");
		} else if (intervalo <= 75) {

		} else {
			System.out.println("INTERVAO (75,100)");
		}
		sc.close();
	}
}

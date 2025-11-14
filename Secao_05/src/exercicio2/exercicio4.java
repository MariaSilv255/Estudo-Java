package exercicio2;

import java.util.Locale;
import java.util.Scanner;

public class exercicio4 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		double horaInicial = sc.nextDouble();
		double horaFinal = sc.nextDouble();

		double calc = 0;
		if (horaFinal > horaInicial) {
			calc = horaInicial - horaFinal;
		} else {
			calc = 24 - horaInicial + horaFinal;
		}
		System.out.print("durou " + calc);
		sc.close();
	}
}

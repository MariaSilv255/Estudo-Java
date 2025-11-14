package exercicio2;

import java.util.Scanner;

public class exercicio7 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double x, y;

		x = sc.nextDouble();
		y = sc.nextDouble();

		if (x == 0 && y == 0) {
			System.out.print("ORIGEM");
		} else if (x > 0 && y > 0) {
			System.out.print("Q1");
		} else if (x > 0 && y < 0) {
			System.out.print("Q4");
		} else if (x < 0 && y > 0) {
			System.out.print("Q2");
		} else {
			System.out.print("Q3");
		}
		sc.close();
	}
}

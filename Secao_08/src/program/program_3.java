package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Estudante_3;

public class program_3 {
	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		Estudante_3 student = new Estudante_3();
		student.name = sc.nextLine();
		student.nota1 = sc.nextDouble();
		student.nota2 = sc.nextDouble();
		student.nota3 = sc.nextDouble();
		System.out.printf("FINAL GRADE: %.2f%n", student.finalNota());
		if (student.finalNota() < 60.0) {
			System.out.println("FAILED");
			System.out.printf("MISSING %.2f POINTS%n", student.resultNota());
		} else {
			System.out.println("PASS");
		}
		sc.close();
	}
}

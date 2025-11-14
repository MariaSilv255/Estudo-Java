package program;

import java.util.Locale;
import java.util.Scanner;

import entities.Funcionario_1;

public class program_1 {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Funcionario_1 fn = new Funcionario_1();

		Scanner sc = new Scanner(System.in);

		fn.name = sc.nextLine();
		fn.grossSalary = sc.nextDouble();
		fn.tax = sc.nextDouble();

		System.out.println(fn.toString());

		System.out.println("Deseja incrementar uma pocentagem?");
		double porcentagem = sc.nextDouble();
		fn.increaseSalary(porcentagem);
		System.out.println(fn.toString());
		sc.close();
	}

}

import java.util.Locale;
import java.util.Scanner;

import entities.Banco;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);

		Scanner sc = new Scanner(System.in);

		System.out.println("Digite o numero da conta:");
		int number = sc.nextInt();
		sc.nextLine();
		System.out.println("Digite o nome da conta:");
		String name = sc.nextLine();

		System.out.println("deposito inicial?");
		char operacao = sc.next().charAt(0);
		double dinheiro = 0.0;
		
		if (operacao == 'Y') {
			dinheiro = sc.nextDouble();
		}
		Banco banco = new Banco(name,number, dinheiro);
		System.out.println("dados da conta:");
		System.out.println(banco.toString());
		
		System.out.println("deposito a conta:");
		System.out.println("inseria o vaor:");
		banco.initalDeposit(sc.nextDouble());
		System.out.println(banco.toString());
		
		System.out.println("faça um saque:");
		System.out.println("valor do saque");
		banco.withDraw(sc.nextDouble());
		System.out.println(banco.toString());
		
		sc.close();
	}
}

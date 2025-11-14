package application;

import java.util.Locale;
import java.util.Scanner;

import entities.Conta;
import exceptions.ContaException;

public class Programa {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		try {
			Conta conta = solicitarDadosBancarios(sc);
			sacarValor(sc, conta);
			System.out.println(conta.toString());
		} catch (ContaException e) {
			System.out.println(e.getMessage());
		} catch (RuntimeException e) {
			System.out.println("erro inesperado");
		}

		sc.close();

	}

	public static Conta solicitarDadosBancarios(Scanner sc) {
		System.out.println("Infome seus dados bancarios");
		System.out.print("Numero da conta:");
		int numeroConta = sc.nextInt();
		sc.nextLine();

		System.out.print("titular da conta:");
		String titular = sc.nextLine();

		System.out.print("saldo da conta:");
		double saldo = sc.nextDouble();

		System.out.print("limite para saque:");
		double limite = sc.nextDouble();

		Conta conta = new Conta(numeroConta, titular, saldo, limite);
		return conta;
	}

	public static void sacarValor(Scanner sc, Conta conta) {
		System.out.print("infome o valor que deseja sacar:");
		double saque = sc.nextDouble();
		conta.saque(saque);
	}

}

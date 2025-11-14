package vetor;

import java.util.Scanner;

public class ExercicioVetor4 {
	public static void main(String[] args) {
		System.out.println("Quantos numeors voce vai digitar?");

		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int numero[] = new int[n];

		for (int i = 0; i < n; i++) {
			System.out.print("digite um numero: ");
			numero[i] = sc.nextInt();
		}
		System.out.println("Numeros pares");
		int pares = 0;
		for (int i = 0; i < numero.length; i++) {
			if(numero[i] % 2 == 0) {
			System.out.printf("%d ",numero[i]);	
			pares ++;
			}
		}
		
		System.out.printf("quantidade pares: %d",pares);
		sc.close();
	}
}

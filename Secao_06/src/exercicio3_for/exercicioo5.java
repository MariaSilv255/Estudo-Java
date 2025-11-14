package exercicio3_for;

import java.util.Scanner;

public class exercicioo5 {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		
		double fatorial = 1;
	
			for (int i = 1; i < n; i++) {
				fatorial += fatorial * i;

			}
		
		System.out.println(fatorial);
		sc.close();
	}
}

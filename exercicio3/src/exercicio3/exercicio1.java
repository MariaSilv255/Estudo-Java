package exercicio3;

import java.util.Locale;
import java.util.Scanner;

public class exercicio1 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		
		int senhaCorreta = 2002;
		System.out.println("Digite a senha:");
		int senha = sc.nextInt();
		
		while(senha != senhaCorreta) {
			System.out.println("senha incorreta!");
			senha = sc.nextInt();
		}
		
		System.out.println("acesso permitido!");
		sc.close();

	}

}

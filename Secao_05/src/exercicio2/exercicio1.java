package exercicio2;

import java.util.Scanner;

public class exercicio1 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num = sc.nextInt();
		if(num > 0) {
			System.out.println("não negativo");
		}else {
			System.out.println("negativo");
		}
		sc.close();	
	}
}

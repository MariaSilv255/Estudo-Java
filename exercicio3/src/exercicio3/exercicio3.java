package exercicio3;

import java.util.Scanner;

public class exercicio3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int disel = 0;
		int gasolina = 0;
		int alcool = 0;
		int item = sc.nextInt();
		
		while(item != 4){

			if (item == 1) {
				alcool += 1;
				
			} else if (item == 2) {
				gasolina += 1;
				
			} else if (item == 3) {
				disel += 1;
				
			} 
			item = sc.nextInt();
		}
		System.out.println("Alcool:" + alcool);
		System.out.println("gasolina:" + gasolina);
		System.out.println("disel:" + disel);
		System.out.println("MUITO OBRIGADO");
		sc.close();

	}

}

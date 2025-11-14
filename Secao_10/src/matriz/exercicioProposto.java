package matriz;

import java.util.Scanner;

public class exercicioProposto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int linha = sc.nextInt();
		int coluna = sc.nextInt();

		int matriz[][] = new int[linha][coluna];

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				matriz[i][j] = sc.nextInt();
			}
		}

		System.out.println("Numero que pertence matriz");
		int m = sc.nextInt();

		for (int i = 0; i < matriz.length; i++) {
			for (int j = 0; j < matriz[i].length; j++) {
				if (matriz[i][j] == m) {
					System.out.println("position:" + i + " " + j);
			
						if (j > 0) {
							System.out.println("Left: " + matriz[i][j - 1]);
						}
						if (i > 0) {
							System.out.println("Up: " + matriz[i - 1][j]);
						}
						if (j < matriz[i].length - 1) {
							System.out.println("Right: " + matriz[i][j + 1]);
						}
						if (i < matriz.length - 1) {
							System.out.println("Down: " + matriz[i + 1][j]);
						}
					}

				}
			}
		

	sc.close();
}
}

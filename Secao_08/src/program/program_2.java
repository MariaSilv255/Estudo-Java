package program;

import java.util.Scanner;

import entities.Rectangle_2;

public class program_2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Rectangle_2 retangulo = new Rectangle_2();
		System.out.print("ensira a largura e altura do retangulo");
		retangulo.Height = sc.nextDouble();
		retangulo.Width = sc.nextDouble();
		
		System.out.println("AREA="+retangulo.area());
		System.out.println("PERIMETER="+retangulo.perimeter());
		System.out.println("DIAGONAL="+retangulo.diagonal());
		
		sc.close();
		
	}

}

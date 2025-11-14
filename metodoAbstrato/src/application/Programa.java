package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities.Formato;
import entities.Retangulo;
import entities.circulo;
import entities.enums.Color;

public class Programa {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("qual é o numero de formas?");
		int quantidade = sc.nextInt();
		List<Formato> formatos = new ArrayList<>();
		for (int i = 0; i < quantidade; i++) {
			System.out.print("retangulo ou circulo? (r/c)");
			char c = sc.next().charAt(0);
			System.out.println("Forma #(" + (i + 1) + "):");
			System.out.print("cor da forma:");
			String cor = sc.next();
			if (c == 'r') {
				System.out.print("Largura:");
				double largura = sc.nextDouble();
				System.out.print("altura");
				double altura = sc.nextDouble();
				
				formatos.add(new Retangulo(Color.valueOf(cor),largura, altura));
				
			}else {
				System.out.print("Raio:");
				double raio = sc.nextDouble();
				formatos.add(new circulo(Color.valueOf(cor), raio));
			}
			
			
		}
		
		System.out.println("areas:");
		for (Formato formato : formatos) {
			System.out.println(formato.area());
		}

		sc.close();
	}
}

package application;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.Contrato;
import model.entities.Parcela;
import services.PaypalServico;
import services.ServicoContrato;

public class Programa {
	public static void main(String[] args) {

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.println("entre com os dados do contrato");
		System.out.print("Numero:");
		int numero = sc.nextInt();
		System.out.print("Data dd/mm/yyyy");
		String dataStr = sc.next();
		LocalDate data = LocalDate.parse(dataStr, fmt);
		System.out.print("Valor contrato:");
		double valor = sc.nextDouble();
		
		Contrato contrato = new Contrato(numero, data, valor);
		
		System.out.println("entre com a quantidade de parcelas:");
		int quantidade = sc.nextInt();
		
		
		
		ServicoContrato servicoContrato = new ServicoContrato(new PaypalServico()); 
		servicoContrato.processoContrato(contrato, quantidade);
		
		for (Parcela parcela : contrato.getParcelas()) {
			System.out.println(parcela.getDataVencimento() +"-" + parcela.getValor());
		}
		
	}
}

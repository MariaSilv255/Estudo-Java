package application;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;

import model.entities.AluguelCarro;
import model.entities.Veiculo;
import model.service.BrasilTaxaServico;
import model.service.ServicoAluguel;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);

		DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
		Scanner sc = new Scanner(System.in);

		System.out.println("Entre com os dados do aluguel:");
		System.out.print("modelo:");
		String modelo = sc.nextLine();
		
		System.out.print("Retirada:");
		LocalDateTime retirada = LocalDateTime.parse(sc.nextLine(), fmt);
		
		System.out.print("Retorno:");
		LocalDateTime retorno = LocalDateTime.parse(sc.nextLine(), fmt);
		
		AluguelCarro carro = new AluguelCarro(retirada, retorno, new Veiculo(modelo));
		
		
		System.out.print("preco da hora:");
		double hora = sc.nextDouble();
		
		System.out.print("preco do dia:");
		double dia = sc.nextDouble();

		ServicoAluguel servico = new ServicoAluguel(hora, dia, new BrasilTaxaServico());
		servico.processoFatura(carro);
		
		System.out.println("Fatura");
		System.out.print("PAGAMENTO BASICO: "+carro.getFatura().getPagamentoBasico());
		System.out.println("IMPOSTO:"+carro.getFatura().getTaxa());
		System.out.println("TOTAL:"+carro.getFatura().getTotalPagamento());
		
		
	}

}

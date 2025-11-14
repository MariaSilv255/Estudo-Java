package entites;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ProdutoUsado extends Produto{
	private LocalDate data;

	public ProdutoUsado(String nome, Double preco, LocalDate data) {
		super(nome, preco);
		this.data = data;
	}

	public LocalDate getData() {
		return data;
	}

	public void setDate(LocalDate data) {
		this.data= data;
	}
	
	@Override
	public String tagPreco() {
		return getNome() 
				+ " (usado) $ " 
				+ String.format("%.2f", getPreco())
				+ " (Data Fabricacao: "
				+ data.format(DateTimeFormatter.ofPattern("dd/MM/yyyy"))
				+ ")";
	}
}
	


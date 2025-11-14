package model.entities;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import services.IServicoPagamentoOnline;

public class Contrato {
	private Integer numero;
	private LocalDate data;
	private Double valorTotal;

	List<Parcela> Parcelas = new ArrayList<>();
	
	public Contrato() {

	}
		
	@Override
	public String toString() {
		return "Contrato [numero=" + numero + ", data=" + data + ", valorTotal=" + valorTotal + "]";
	}

	public Contrato(Integer numero, LocalDate data, Double valorTotal) {
		this.numero = numero;
		this.data = data;
		this.valorTotal = valorTotal;		
	}

	public List<Parcela> getParcelas() {
		return Parcelas;
	}

	public void setParcelas(List<Parcela> parcelas) {
		Parcelas = parcelas;
	}

	public Integer getNumero() {
		return numero;
	}

	public void setNumero(Integer numero) {
		this.numero = numero;
	}

	public LocalDate getData() {
		return data;
	}

	public void setData(LocalDate data) {
		this.data = data;
	}

	public Double getValorTotal() {
		return valorTotal;
	}

	public void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}
	
	public void addParcela(Parcela parcela) {
		Parcelas.add(parcela);
	}

}

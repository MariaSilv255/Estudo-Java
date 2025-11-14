package entities;

public class Animal {
	private String nome;

	public Animal(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String falar() {
		return "O animal faz um som.";
	}

}

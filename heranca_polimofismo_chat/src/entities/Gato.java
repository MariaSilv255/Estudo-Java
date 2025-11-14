package entities;

public class Gato extends Animal {
	public Gato(String nome) {
		super(nome);
	}

	@Override
	public String falar() {
		return "miu miu";
	}
}

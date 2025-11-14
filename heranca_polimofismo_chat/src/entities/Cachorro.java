package entities;

public class Cachorro extends Animal {
	public Cachorro(String nome) {
		super(nome);
	}

	@Override
	public String falar() {
		return "au au";
	}
}

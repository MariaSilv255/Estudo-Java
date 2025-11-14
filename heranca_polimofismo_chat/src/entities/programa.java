package entities;

public class programa {
public static void main(String[] args) {
	Animal a = new Cachorro("Bob");
	Animal b = new Gato("luna");
	
	System.out.println(a.getNome() +" " + a.falar());
	System.out.println(b.getNome() +" " + b.falar());
	
}
}

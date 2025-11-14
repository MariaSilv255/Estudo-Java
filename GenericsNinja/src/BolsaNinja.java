import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BolsaNinja<T> {

	//inicializar o array
	private List<T> ferramentas;
		//construtor
	public BolsaNinja() {
		this.ferramentas = new ArrayList<>();
	}

	//colocar ferramentas na lista
	public void addFerramenta(T ferramenta) {
		
		ferramentas.add(ferramenta);
	}
	
	//exibir 
	public void mostrarFerramenta() {
		for (T t : ferramentas) {
			System.out.println(t);
		}
	}
	
	
}

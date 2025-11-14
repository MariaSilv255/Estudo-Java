package generics_179;

import java.util.ArrayList;
import java.util.List;

public class PrintServices_com_generics<T> {

	List<T> itens = new ArrayList<>();
	
	public void addValue(T value) {
		itens.add(value);
	}
	
	public T first() {
		if(itens.isEmpty()) {
			throw new IllegalStateException("Lista esta vazia");
		}
		return itens.get(0);
	}
	
	public void print() {
			System.out.print("[");
			
			if (!itens.isEmpty()) {
				System.out.print(itens.get(0));
			}
			
			for (int i = 1; i < itens.size(); i++) {
				System.out.print(", " + itens.get(i));
			}
			
			System.out.println("]");
		}
	}
	

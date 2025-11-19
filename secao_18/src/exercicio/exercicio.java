package exercicio;

import java.util.ArrayList;
import java.util.List;

public class exercicio {
	public static void main(String[] args) {
	
		List<Produto> list = new ArrayList<>();
		
		list.add(new Produto("TV",900.00));
		list.add(new Produto("Mouse",50.00));
		list.add(new Produto("Tablet",350.00));
		list.add(new Produto("HD",80.90));
		
		FilterSum fs = new FilterSum();
		double sum = fs.filter(list,p -> p.getNome().charAt(0) == 'T');
		
		for (Produto produto : list) {
			System.out.println(produto);
		}
		
		System.out.println(sum);
		
	}
}

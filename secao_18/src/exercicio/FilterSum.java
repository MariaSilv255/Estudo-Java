package exercicio;

import java.util.List;
import java.util.function.Predicate;

public class FilterSum {
	public double filter(List<Produto> list,Predicate<Produto> predicado ) {
		double sum =0.0;
		for (Produto p : list) {
			if(predicado.test(p)) {
				sum += p.getPreco();
			}
		}
		return sum;
		
	}
}

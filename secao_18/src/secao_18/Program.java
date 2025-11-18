package secao_18;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Program {
	public static void main(String[] args) {

		List<Produto> list = new ArrayList<>();

		list.add(new Produto("TV", 900.00));
		list.add(new Produto("Notebook", 1200.00));
		list.add(new Produto("Tablet", 450.00));

		//chamando a função completa (sintaxe de classe anonima)
		
		Comparator<Produto> comp = new Comparator<Produto>() {
			
			@Override
			public int compare(Produto o1, Produto o2) {
				// TODO Auto-generated method stub
				return o1.getNome().compareTo(o2.getNome());
			}
		};
			
		//Com as chave e retunr

		Comparator<Produto> comp1 = (p1,p2) -> {
			return p1.getNome().compareTo(p2.getNome());
		};
		
		// posso usar de duas formas sem as chaves e retirando o return

		Comparator<Produto> comp2 = (p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase());
		
		//chamando em uma classe
		list.sort(new MyCompareto());
		
		//direto no sort
		list.sort((p1, p2) -> p1.getNome().toUpperCase().compareTo(p2.getNome().toUpperCase()));
		list.sort(comp2);
		list.sort(comp);
		list.sort(comp1);
	}
}


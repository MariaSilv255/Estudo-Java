package predicados;

import java.util.ArrayList;
import java.util.List;


import secao_18.Produto;

public class MyPredicate {
	public static void main(String[] args) {
		
		List<Produto> produto = new ArrayList<Produto>();
		
		produto.add(new Produto("TV",900.00));
		produto.add(new Produto("bala",50.00));
		produto.add(new Produto("doce",20.00));
		produto.add(new Produto("celular",250.00));
		
		produto.removeIf(p -> p.getPreco() >= 100);
		
		for (Produto produto2 : produto) {
			System.out.println(produto2);
		}
		
	}
}

package secao_18;

import java.util.Comparator;

public class MyCompareto implements Comparator<Produto>{
		
		@Override
		public int compare(Produto o1, Produto o2) {
			// TODO Auto-generated method stub
			return o1.getNome().compareTo(o2.getNome());
		}
	};
		

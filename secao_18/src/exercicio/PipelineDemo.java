package exercicio;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class PipelineDemo {
	public static void main (String[] args) {
		
	List<Integer> lista = Arrays.asList(3, 4, 5, 6, 7);
	Stream<Integer> st1 = lista.stream().map(x -> x * 10);
	System.out.println(Arrays.toString(st1.toArray()));
	
	int sum = lista.stream().reduce(0, (x,y) -> x  + y);
	
	}
}

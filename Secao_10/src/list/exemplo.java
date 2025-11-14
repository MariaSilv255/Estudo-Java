package list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class exemplo {
	public static void main(String[] args) {
		List<String> list = new ArrayList<>();

		list.add("Maria");
		list.add("Alex");
		list.add("Bob");
		list.add("Anna");
		list.add(2, "Marco");

		System.out.println("tamanho: " + list.size());
		for (String nome : list) {
			System.out.println(nome);
		}
		System.out.println("-----------------------------");

		// a lista tem uma operação capaz de remover um dado apartir de uma comparação do valor dele com outro;
		// ainda pode remover por index
		list.remove("anna");
		list.remove(1);

		// posso remover por predicado; posso definir qualquer condição e o remove if faz para mim
		list.removeIf(x -> x.charAt(0) == 'M');

		for (String x : list) {
			System.out.println(x);
		}
		System.out.println("-----------------------------");
		//posicao do bob
		System.out.println("index of bob"+list.indexOf("Bob"));
		//nao encontrou retorna -1
		System.out.println("index of bob"+list.indexOf("Maria"));
		
		System.out.println("-----------------------------");
		//filtragem de todos que comecem com A
		//pega a lista e converter para o tipo stream para aceitar operacao com expresao lambdas,
		//o filter aceitar um predicado, e o filter vai me devolver um stream filtrado,
		//so que o stream nao é compativel e converter ele para list e para isso chama o colect e collectons.to list
		
		// Converto a lista em um stream para poder aplicar operações funcionais com expressões lambda.
		// O método filter recebe um predicado (uma função que retorna verdadeiro ou falso) 
		// e devolve um novo stream contendo apenas os elementos que passaram no filtro.
		// Como o resultado ainda é um stream (e não uma lista), uso o collect para converter de volta para uma List.
		// O Collectors.toList() faz exatamente essa conversão.
		List<String> result = list.stream()// transforma a lista em um Stream, que permite trabalhar com operações funcionais, como filter
				.filter(x -> x.charAt(0) == 'A')// aplica um filtro: mantém apenas os elementos cujo primeiro caractere é 'A'
				.collect(Collectors.toList());// converte o Stream de volta para uma List usando o método collect
		
		for (String x : result) {
			System.out.println(x);
		}
		
		//para encontrar um elemento da lista que atenda um predicado
		System.out.println("-----------------------------");
		
		//lista ira receber uma expressao lambada para isso deve usar o stream.Filter possui a operacao
		String name = list.stream()// ira receber uma expressao lambada
				.filter(x -> x.charAt(0) == 'A')//aplica um filtro que recebe um predicado
				.findFirst().orElse(null);//primeiro elemento que atende meu predicado se nao tiver ele coloca nullo;
		System.out.println(name);
	}
}

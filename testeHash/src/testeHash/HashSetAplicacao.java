package testeHash;

import java.util.HashSet;
import java.util.Set;

public class HashSetAplicacao {
	public static void main(String[] args) {
		Set<String> set = new HashSet<>();
		
		set.add("Nootbook");
		set.add("tablet");
		set.add("TV");
		
		System.out.println(set.contains("TV"));
		
		for (String string : set) {
			System.out.println(string);
		}
		
	}
}
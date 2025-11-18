package maps;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class Programa {
	public static void main(String[] args) {

		String caminho = "F:\\ESTUDO\\Estudo_Java\\java\\voto.txt";
		try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

			String line = br.readLine();
			Map<String, Integer> votos = new HashMap<>();
			while (line != null) {
				//System.out.println(line);
				String[] campo = line.split(",");

				String chave = campo[0];
				int valor = Integer.parseInt(campo[1]);

				if(votos.containsKey(chave)) {
					int voto = votos.get(chave);
					votos.put(chave, valor + voto);
				}else {
					votos.put(chave, valor);
				}

				// votos.put(chave,valor);
				line = br.readLine();
			}
			
			System.out.println(votos);

		} catch (IOException e) {
			System.out.println("Erro: " + e);
		}

	}
}

package exercicio1;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.Instant;
import java.util.Date;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Programa {

	public static void main (String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Informe o caminho do arquivo");
		String path = sc.nextLine();
		
		try(BufferedReader br = new BufferedReader(new FileReader(path))){
			
			 Set<LogUsuario> set = new HashSet<>();
			 
			 String line = br.readLine();
			 while (line != null) {
				 
				 String[] filds = line.split(" ");
				 String username = filds[0];
				 Date moment = Date.from(Instant.parse(filds[1]));
				 
				 set.add(new LogUsuario(username,moment));
				 
				 line = br.readLine();					
			 }
			 System.out.println(set.size());
		}catch (IOException e) {
			System.out.println("erro"+e);
		}
		
	
		sc.close();
	}
	
}

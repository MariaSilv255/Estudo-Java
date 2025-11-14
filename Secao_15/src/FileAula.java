import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class FileAula {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Instaciamos um objetos do tipo file e ele vai encapsula todo o processo do
		// arquivo e o caminho;
		File file = new File("E:\\ESTUDO\\Estudo_Java\\java");

		Scanner sc = null;

		try {
			// assim ele ler o arquivo
			sc = new Scanner(file);
			// existe uma proxima linha ?
			while (sc.hasNextLine()) {
				System.out.println(sc.hasNextLine());
			}
		} catch (IOException e) {
			System.out.println("Erro_" + e.getMessage());
		}
		finally {
			if(sc!=null) {
				sc.close();
			}
		}

	}

}


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//posso passar o tipo que desejo adicionar, 
		//ou passo objeto para trabalhar com diversas ferramentas;
		
		BolsaNinja<Object> bolsaninja = new BolsaNinja<>();
		
		bolsaninja.addFerramenta(new Kunai("Kunai explosiva"));
		bolsaninja.addFerramenta(new Shuriken(3));
		bolsaninja.addFerramenta(new Pergaminho("Invocação do sapo"));
		
		System.out.println("Itens da bolsa ninja");
		bolsaninja.mostrarFerramenta(); 
		
	}

}

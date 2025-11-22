import entities.Product;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        String path = "F:\\ESTUDO\\Estudo_Java\\java\\itens.csv";

        try(BufferedReader br = new BufferedReader(new FileReader(path))){

            List<Product> produtos = new ArrayList<>();
            String line = br.readLine();
            while (line != null){
                String fields[] = line.split(",");
                produtos.add(new Product(fields[0],Double.parseDouble(fields[1])));
                line = br.readLine();
            }

            double media = produtos.stream()
                    .map(p -> p.getPrice())
                    .reduce(0.0,(x,y) -> x+y) / produtos.size();

            System.out.println("media" + media);

            Comparator<String> comp = (p1,p2) -> p1.toUpperCase().compareTo(p2.toUpperCase());

            List<String> names = produtos.stream()
                    .filter(p -> p.getPrice() < media)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());

            names.forEach(System.out::println);

        }catch (IOException e){
            System.out.println("Erro:" + e);
        }

    }
}
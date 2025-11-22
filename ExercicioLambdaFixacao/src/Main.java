import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Locale.setDefault(Locale.US);

        String caminho = "F:\\ESTUDO\\Estudo_Java\\java\\funcionario.csv";
        Double salario = perdirSalario();

        List<Funcionario> funcionarioList = lerArquivoFuncionario(caminho);
        mostrarEmail(funcionarioList,salario);
        filtrarEmail(funcionarioList);
    }

    public static Double perdirSalario() {

        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de salario:");
        Double s = sc.nextDouble();
        sc.close();

        return s;


    }

    public static List<Funcionario> lerArquivoFuncionario(String caminho) {
        try (BufferedReader br = new BufferedReader(new FileReader(caminho))) {

            String linha = br.readLine();
            List<Funcionario> funcionarioList = new ArrayList<>();
            while (linha != null) {
                String[] funcionario = linha.split(",");
                funcionarioList.add(new Funcionario(funcionario[0], funcionario[1], Double.parseDouble(funcionario[2])));
                linha = br.readLine();
            }

            return funcionarioList;

        } catch (IOException e) {
            System.out.println("Erro:" + e);
            return null;
        }
    }

    public static void mostrarEmail(List<Funcionario> lista, Double salario){
        List<String> saldo = lista.stream()
                .filter(p->p.getSalario() > salario)
                .map(p->p.getEmail())
                .collect(Collectors.toList());

        saldo.forEach(System.out::println);

    }

    public static void filtrarEmail(List<Funcionario> lista){
        List<String> emails = lista.stream()
                .filter(p->p.getName().charAt(0)=='M')
                .map(p->p.getEmail())
                .collect(Collectors.toList());

        emails.forEach(System.out::println);

    }
}


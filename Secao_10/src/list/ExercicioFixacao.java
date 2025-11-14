package list;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import entities_list.Employee;

public class ExercicioFixacao {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many employee will be registered?");
		int n = sc.nextInt();

		List<Employee> list = new ArrayList<>();

		for (int i = 0; i < n; i++) {
			System.out.printf("Employee # %d\n", i + 1);
			System.out.print("id:");
			int id = sc.nextInt();
						
			while (validadID(list, id)) {
				System.out.println("D already exists. Using a new ID:");
				id = sc.nextInt();
			}
			
			sc.nextLine();
			System.out.print("Name:");
			String name = sc.nextLine();

			System.out.print("Salary:");
			double salary = sc.nextDouble();
			list.add(new Employee(id, name, salary));

		}

		System.out.print("Enter the employeer id that will have salary increase:");
		int id = sc.nextInt();

		Employee emp = list.stream().filter(x -> x.getId() == id).findFirst().orElse(null);

		if (emp == null) {
			System.out.println("This id does not exist");
		} else {
			System.out.print("Enter the percentage:");
			double porcent = sc.nextDouble();
			emp.increaseSalary(porcent);
		}
		System.out.println("List of employees");
		for (Employee employee : list) {
			System.out.println(employee.toString());
		}

		sc.close();
	}

	public static boolean validadID(List<Employee> lista, int id) {

		Employee emp = lista.stream().filter(x -> x.getId() == id).findFirst().orElse(null);
		if (emp == null) {
			return false;
		} else {
			return true;
		}
	}

}

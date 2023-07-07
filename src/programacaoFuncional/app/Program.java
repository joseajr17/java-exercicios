package programacaoFuncional.app;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

import programacaoFuncional.entities.Employee;

public class Program {
	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter full file path: ");
		String path = sc.nextLine();

		try (BufferedReader br = new BufferedReader(new FileReader(path))) {

			List<Employee> list = new ArrayList<>();

			String line = br.readLine();
			while (line != null) {
				String[] fields = line.split(",");
				list.add(new Employee(fields[0], fields[1], Double.parseDouble(fields[2])));
				line = br.readLine();
			}
			
			System.out.println("Enter salary:");
			
			Double salaryInput = sc.nextDouble();
			
			List<String> emails = list.stream()
					.filter(e -> e.getSalary() > salaryInput)
					.map(p -> p.getEmail()).sorted()
					.toList();
			
			double sum = list.stream()
					.filter(e -> e.getName().charAt(0) == 'M')
					.map(e -> e.getSalary())
					.reduce(0.0 , (x, y) -> x + y);
			
			emails.forEach(System.out::println);
			
			System.out.println("Sum of salary of people whose name starts with 'M':" + sum);
			
			
		} catch (IOException e) {
			System.out.println("Error: " + e.getMessage());
		}
		sc.close();
	}
}

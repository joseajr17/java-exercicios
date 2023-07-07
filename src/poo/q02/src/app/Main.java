package poo.q02.src.app;

import java.util.Scanner;

import poo.q02.src.entities.Employee;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		Employee e = new Employee();

		e.setName(sc.nextLine());
		e.setGrossSalary(sc.nextDouble());
		e.setTax(sc.nextDouble());

		System.out.println(e);
		System.out.println("Which percentage to increase salary?");
		System.out.printf("Updated data: %s, $ %.2f", e.getName(), e.increaseSalary(sc.nextDouble()));
	}
}

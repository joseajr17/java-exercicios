package poo.q03.src.app;

import java.util.Scanner;

import poo.q03.src.entities.Student;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		Student s = new Student();
		
		s.setName(sc.nextLine());
		s.setGrade1(sc.nextDouble());
		s.setGrade2(sc.nextDouble());
		s.setGrade3(sc.nextDouble());
		
		System.out.printf("FINAL GRADE: %.2f%n", s.finalGrade());
		if (s.finalGrade() < 60.0) {
		System.out.println("FAILED");
		System.out.printf("MISSING %.2f POINTS%n", s.missing());
		}
		else
		System.out.println("PASS");
	}
}

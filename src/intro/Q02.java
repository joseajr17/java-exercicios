package intro;

import java.util.Scanner;

public class Q02 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double raio = sc.nextDouble();

		double pi = 3.14159;

		System.out.printf("A=%.4f", (pi * (raio * raio)));
	}
}

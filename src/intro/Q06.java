package intro;

import java.util.Scanner;

public class Q06 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double a = sc.nextDouble();
		double b = sc.nextDouble();
		double c = sc.nextDouble();
		double pi = 3.14159;

		System.out.printf(
				"TRIANGULO: %.3f\n" + "CIRCULO: %.3f\n" + "TRAPEZIO: %.3f\n" + "QUADRADO: %.3f\n" + "RETANGULO: %.3f",
				((a * c) / 2), (pi * (c * c)), (((a + b) * c) / 2), (b * b), (a * b));

	}
}

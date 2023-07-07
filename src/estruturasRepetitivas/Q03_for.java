package estruturasRepetitivas;

import java.util.Scanner;

public class Q03_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int qtd = sc.nextInt();

		for (int i = 0; i < qtd; i++) {
			float num1 = sc.nextFloat();
			float num2 = sc.nextFloat();
			float num3 = sc.nextFloat();

			System.out.printf("%.1f", ((num1 * 2) + (num2 * 3) + (num3 * 5)) / (2 + 3 + 5));
		}

	}
}

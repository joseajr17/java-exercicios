package estruturasRepetitivas;

import java.util.Scanner;

public class Q02_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int qtd = sc.nextInt();

		int contIN = 0;
		int contOUT = 0;

		for (int i = 0; i < qtd; i++) {
			int num = sc.nextInt();
			if (num >= 10 && num <= 20)
				contIN++;
			else
				contOUT++;
		}

		System.out.println(contIN + " in");
		System.out.println(contOUT + " out");

	}
}

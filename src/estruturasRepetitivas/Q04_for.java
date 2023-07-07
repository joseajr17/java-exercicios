package estruturasRepetitivas;

import java.util.Scanner;

public class Q04_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();

		for (int i = 0; i < n; i++) {
			float num1 = sc.nextFloat();
			float num2 = sc.nextFloat();

			if (num2 == 0)
				System.out.println("divisao impossivel");
			else
				System.out.println(num1 / num2);
		}

	}
}

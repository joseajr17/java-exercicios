package estruturasRepetitivas;

import java.util.Scanner;

public class Q05_for {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int n = sc.nextInt();
		int f = 1;

		for (int i = 0; i < n; i++) {
			if (n == 1)
				f = 1;
			else
				f += f * i;
		}
		System.out.println(f);

	}
}

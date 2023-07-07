package estruturasRepetitivas;

import java.util.Scanner;

public class Q01_for {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		int contImpar = 0;
		
		for (int i = 0; i < num; i++) {
			if (i % 2 != 0)
				System.out.println(i);
		}

	}

}

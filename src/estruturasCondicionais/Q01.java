package estruturasCondicionais;

import java.util.Scanner;

public class Q01 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num = sc.nextInt();
		
		if(num < 0)
			System.out.println("NEGATIVO");
		else
			System.out.println("NAO NEGATIVO");

	}

}

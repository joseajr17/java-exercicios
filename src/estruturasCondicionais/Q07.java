package estruturasCondicionais;

import java.util.Scanner;

public class Q07 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		float x = sc.nextFloat();
		float y = sc.nextFloat();
		
		if(x > 0 && y > 0)
			System.out.println("Q1");
		else if(x > 0 && y < 0)
			System.out.println("Q4");
		else if(x < 0 && y < 0)
			System.out.println("Q3");
		else if(x < 0 && y > 0)
			System.out.println("Q2");
		else
			System.out.println("Origem");
	}

}

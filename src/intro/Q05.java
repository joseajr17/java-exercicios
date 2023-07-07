package intro;

import java.util.Scanner;

public class Q05 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod1 = sc.nextInt();
		int quant1 = sc.nextInt();
		double valor1 = sc.nextDouble();
		
		int cod2 = sc.nextInt();
		int quant2 = sc.nextInt();
		double valor2 = sc.nextDouble();		

		System.out.printf("VALOR A PAGAR: R$ %.2f", ((quant1 * valor1)+ (quant2 * valor2)));
	}
}

package estruturasRepetitivas;

import java.util.Scanner;

public class Q03_while {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int cod = sc.nextInt();
		int contAlcool = 0;
		int contGaso = 0;
		int contDiesel = 0;

		while (cod != 4) {
			if (cod == 1)
				contAlcool++;
			else if (cod == 2)
				contGaso++;
			else if (cod == 3)
				contDiesel++;
			else
				System.out.println("Codigo invalido! Digite outro:");

			cod = sc.nextInt();
		}

		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: " + contAlcool);
		System.out.println("Gasolina: " + contGaso);
		System.out.println("Diesel: " + contDiesel);

	}

}

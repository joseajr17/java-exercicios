package estruturasCondicionais;

import java.util.Scanner;

public class Q05 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int cod = sc.nextInt();
		int qtd = sc.nextInt();
		double preco = 0;
		
		switch (cod) {
		case 1: {
			preco = 4*qtd;
			System.out.printf("Total: R$ %.2f", preco);
			break;
		}
		case 2:{
			preco = 4.5 * qtd;
			System.out.printf("Total: R$ %.2f", preco);
			break;
		}
		case 3:{
			preco = 5 * qtd;
			System.out.printf("Total: R$ %.2f", preco);
			break;
		}
		case 4:{
			preco = 2 * qtd;
			System.out.printf("Total: R$ %.2f", preco);
			break;
		}
		case 5:{
			preco = 1.5 * qtd;
			System.out.printf("Total: R$ %.2f", preco);
			break;
		}
		default:
			System.out.println("O código escolhido é inválido! Digite um número entre 1 a 5.");
		}
		
		

	}

}

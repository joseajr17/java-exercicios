package estruturasCondicionais;

import java.util.Scanner;

public class Q04 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int inicio = sc.nextInt();
		int fim = sc.nextInt();
		int duracao = 0;
		
		if(inicio < 0 || inicio > 24 || fim < 0 || fim > 24) {
			System.out.println("Valor de hora digitada invalida!");
		}else {
			if(inicio > fim)
				duracao = (24-inicio) + fim;		
			else if(inicio < fim)
				duracao = fim - inicio;
			else if(inicio == fim)
				duracao = 24;
			
			System.out.printf("O JOGO DUROU %d HORA(S)\n", duracao);
		}
		
			
		

	}

}

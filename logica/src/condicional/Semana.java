package condicional;

import java.util.Scanner;

public class Semana {

	public static void main(String[] args) {
		int opcao;
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Digite um n�mero de 1 a 7: ");
		opcao = sc.nextInt();
		
		switch(opcao) {
		case 1:
			System.out.printf("O n�mero %d � Domingo", opcao);
			break;
		case 2:
			System.out.printf("O n�mero %d � Segunda-Feira", opcao);
			break;
		case 3:
			System.out.printf("O n�mero %d � Ter�a-Feira", opcao);
			break;
		case 4:
			System.out.printf("O n�mero %d � Quarta-Feira", opcao);
			break;
		case 5:
			System.out.printf("O n�mero %d � Quinta-Feira", opcao);
			break;
		case 6:
			System.out.printf("O n�mero %d � Sexta-Feira", opcao);
			break;
		case 7:
			System.out.printf("O n�mero %d � S�bado", opcao);
			break;
		default:
			System.out.println("Op��o Invalida");
		}
		
		sc.close();

	}

}

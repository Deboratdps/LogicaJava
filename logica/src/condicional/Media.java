package condicional;

import java.util.Scanner;

public class Media {

	public static void main(String[] args) {
		double n1, n2, n3;
		Scanner sc = new Scanner(System.in);

		System.out.println("Informe 1? nota: ");
		n1 = sc.nextDouble();
		System.out.println("Informe 2? nota: ");
		n2 = sc.nextDouble();
		System.out.println("Informe 3? nota: ");
		n3= sc.nextDouble();
		
		double media = (n1+n2+n3)/3;
		String resultado;
		
		if (media >= 6.0) {
			resultado = "aprovado";
		} else {
			resultado = "reprovado";
		}
		
		System.out.printf("O aluno obteve m?dia %.1f e est? %s \n", media,resultado);
		System.out.println("Encerrado");
		
		sc.close();
	}

}

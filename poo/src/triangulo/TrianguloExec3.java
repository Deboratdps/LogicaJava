package triangulo;

import java.util.Scanner;

import geometria.Triangulo;

public class TrianguloExec3 {

	public static void main(String[] args) {
		Triangulo a = new Triangulo();
		Triangulo b = new Triangulo();

		Scanner sc = new Scanner(System.in);
		System.out.printf("Digite os valores de A: ");
		a.x = sc.nextDouble();
		a.y = sc.nextDouble();
		a.z = sc.nextDouble();
		
		System.out.printf("Digite os valores de B: ");
		b.x = sc.nextDouble();
		b.y = sc.nextDouble();
		b.z = sc.nextDouble();
		
		double area, perimetro;
		String tipo;
		
		//TrianguloA	
		if(a.validar() == true) {
			tipo = a.classificar();
			perimetro = a.perimetro();
			area = a.area();
			
			System.out.printf("\n\nOs lados de A %.1f, %.1f e %.1f formam um triangulo %s.", a.x, a.y, a.z, tipo);
			System.out.printf("\nO per?metro do triangulo ? %.1f.", perimetro);
			System.out.printf("\nA area desse triangulo ? %.1f.", area);
		}else {
			System.out.println("\nOs lados informados n?o s?o de um triangulo\n\n");
		}
		
		//TrianguloB
		if(b.validar() == true) {
			tipo = b.classificar();
			perimetro = b.perimetro();
			area = b.area();
			
			System.out.printf("\n\nOs lados de A %.1f, %.1f e %.1f formam um triangulo %s.", b.x, b.y, b.z, tipo);
			System.out.printf("\nO per?metro do triangulo ? %.1f.", perimetro);
			System.out.printf("\nA area desse triangulo ? %.1f.", area);
		}else {
			System.out.println("\nOs lados informados n?o s?o de um triangulo\n\n");
		}
		
		sc.close();
	}
}

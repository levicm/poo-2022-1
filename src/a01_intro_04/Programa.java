package a01_intro_04;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		Triangulo x = new Triangulo();
		System.out.println("Entre com as medidas do triangulo X:");
		x.a = sc.nextDouble();
		x.b = sc.nextDouble();
		x.c = sc.nextDouble();
		x.unidadeMedida = "cm";
		double areaX = x.area();
		
		Triangulo y = new Triangulo();
		System.out.println("Entre com as medidas do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		y.unidadeMedida = "mm";
		
		double areaY = y.area();
		
		System.out.println("A área do triângulo X é: " + areaX + x.unidadeMedida);
		System.out.println("A área do triângulo Y é: " + areaY + y.unidadeMedida);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		} else {
			System.out.println("Maior área: Y");
		}
		
		
		Retangulo r = new Retangulo();
		System.out.println("Entre com as medidas do retangulo R:");
		r.a = sc.nextDouble();
		r.b = sc.nextDouble();
		r.unidadeMedida = "m";
		double areaR = r.a * r.b;
		System.out.println("A área do retangulo R é: " + areaR + r.unidadeMedida);
		
		sc.close();
	}

}

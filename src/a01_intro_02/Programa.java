package a01_intro_02;

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
		double p = (x.a + x.b + x.c) / 2;
		double areaX = Math.sqrt(p * (p - x.a) * (p - x.b) * (p - x.c));
		
		Triangulo y = new Triangulo();
		System.out.println("Entre com as medidas do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		
		p = (y.a + y.b + y.c) / 2;
		double areaY = Math.sqrt(p * (p - y.a) * (p - y.b) * (p - y.c));
		
		System.out.println("A área do triângulo X é: " + areaX);
		System.out.println("A área do triângulo Y é: " + areaY);
		
		if (areaX > areaY) {
			System.out.println("Maior área: X");
		} else {
			System.out.println("Maior área: Y");
		}
		
		sc.close();
	}

}

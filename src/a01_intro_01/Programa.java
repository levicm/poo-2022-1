package a01_intro_01;

import java.util.Locale;
import java.util.Scanner;

public class Programa {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		
		double xA, xB, xC;
		System.out.println("Entre com as medidas do triangulo X:");
		xA = sc.nextDouble();
		xB = sc.nextDouble();
		xC = sc.nextDouble();
		double p = (xA + xB + xC) / 2;
		double areaX = Math.sqrt(p * (p - xA) * (p - xB) * (p - xC));
		
		double yA, yB, yC;
		System.out.println("Entre com as medidas do triangulo Y:");
		yA = sc.nextDouble();
		yB = sc.nextDouble();
		yC = sc.nextDouble();
		
		p = (yA + yB + yC) / 2;
		double areaY = Math.sqrt(p * (p - yA) * (p - yB) * (p - yC));
		
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

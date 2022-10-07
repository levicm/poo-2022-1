package a01_intro_05;

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
		
		Triangulo y = new Triangulo();
		System.out.println("Entre com as medidas do triangulo Y:");
		y.a = sc.nextDouble();
		y.b = sc.nextDouble();
		y.c = sc.nextDouble();
		y.unidadeMedida = "mm";
		
		imprimeArea(x);
		imprimeArea(y);
		
		if (x.area() > y.area()) {
			System.out.println("Maior área: X");
		} else {
			System.out.println("Maior área: Y");
		}
		
		
		Retangulo r = new Retangulo();
		System.out.println("Entre com as medidas do retangulo R:");
		r.a = sc.nextDouble();
		r.b = sc.nextDouble();
		r.unidadeMedida = "m";
		imprimeArea(r);
		
		sc.close();
	}
	
	public static void imprimeArea(Figura figura) {
		System.out.println("A área de " + figura.getClass().getSimpleName() + 
				" é: " + figura.area() + " " + figura.unidadeMedida);
	}

}

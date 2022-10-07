package a02_classes_e_objetos_05_estaticos;

public class Calculadora {
	
	static public final double PI = 3.1415f;
	
	static public double circunferencia(double raio) {
		return 2.0 * PI * raio;
	}
	
	static public double volume(double raio) {
		return 4.0 * PI * raio * raio * raio / 3.0;
	}
}

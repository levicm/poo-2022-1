package a02_classes_e_objetos_05_estaticos;

public class Programa {

	public static void main(String[] args) {
		double raio = 3.0;
		
		
		double circ = Calculadora.circunferencia(raio);
		double volume = Calculadora.volume(raio);
		
		System.out.println("Circunferencia: " + circ);
		System.out.println("Volume: " + volume);

		Calculadora calc = new Calculadora();
		circ = calc.circunferencia(raio);
		System.out.println("Circunferencia: " + circ);

	}

}

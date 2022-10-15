package a04_heranca;

public class Programa {

	public static void main(String[] args) {
//		Conta conta = new Conta(1001, "Levi");
//		System.out.println(conta);
		ContaCorrente cc = new ContaCorrente(1002, "Elder");
		
		System.out.println(cc);
		cc.deposito(100.0);
		System.out.println(cc);
		
		// Upcasting
		
		Conta c1 = cc;
		System.out.println(c1);
		Conta c2 = new ContaPoupanca(1003, "Marco", 0.01);
		System.out.println(c2);
		Conta c3 = new ContaCorrente(1003, "MAria", 1200.0);
		System.out.println(c3);
		
		// Downcasting
		if (c2 instanceof ContaCorrente) {
			ContaCorrente cc2 = (ContaCorrente) c2;
		}
		if (c2 instanceof ContaPoupanca) {
			ContaPoupanca cp2 = (ContaPoupanca) c2;
			System.out.println(cp2);
		}
		
		Conta[] contas = new Conta[] {cc, c1, c2, c3 };
		System.out.println(somatorio(contas));
	}
	
	private static double somatorio(Conta[] contas) {
		double result = 0;
		for (Conta conta : contas) {
			result += conta.getSaldo();
		}
		return result;
	}

}

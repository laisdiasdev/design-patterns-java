package templateMethod;

public class TestaTemplateMethod {

	public static void main(String[] args) {
		Conta contaCorrente = new ContaCorrente();
		Conta contaPoupanca = new ContaPoupanca();
		
		contaCorrente.depositar(100);
		contaCorrente.sacar(10);
		
		
		contaPoupanca.depositar(100);
		contaPoupanca.sacar(10);
		
		System.out.println("Saldo da Conta Corrente: " + contaCorrente.getSaldo());
	}

}

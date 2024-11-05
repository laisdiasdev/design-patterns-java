/*COMANDO: Estamos desenvolvendo um sistema bancário e precisamos modelar os
diversos tipos de contas do banco. Toda operação bancária realizada
gera a cobrança de uma taxa que é diferente para cada tipo da conta.*/

package templateMethod;

public abstract class Conta {
	private double saldo;

	public void depositar(double valor){
		this.saldo += valor;
		this.saldo -= this.calcularTaxa();
	}
	
	public void sacar(double valor) {
		this.saldo -= valor;
		this.saldo -= this.calcularTaxa();
	}
	
	public double getSaldo() {
		return saldo;
	}
	
	public abstract double calcularTaxa();
}


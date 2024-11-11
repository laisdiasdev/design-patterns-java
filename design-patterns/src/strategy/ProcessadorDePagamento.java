package strategy;

public class ProcessadorDePagamento {
	FormaDePagamento formaDePagamento;
	
	public void escolherFormaDePagamento(FormaDePagamento formaDePagamento)
	{
		this.formaDePagamento = formaDePagamento;
	}
	
	public void executarPagamento(String nome, float valor)
	{
		System.out.println("Iniciando processo de pagamento para " + nome + " no valor de " + valor);
		this.formaDePagamento.processarPagamento();
	}
}

package strategy;

public class TestaStrategy {

	public static void main(String[] args) {
		ProcessadorDePagamento processadorDePagamento = new ProcessadorDePagamento();

		processadorDePagamento.escolherFormaDePagamento(new PagamentoCartaoCredito("1234567890123", "123"));
		processadorDePagamento.executarPagamento("Joao", 120.5f);

		processadorDePagamento.escolherFormaDePagamento(new PagamentoPix("112.233.445-56"));
		processadorDePagamento.executarPagamento("Jose", 130.5f);
	}

}

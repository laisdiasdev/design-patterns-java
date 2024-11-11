package strategy;

public class PagamentoCartaoCredito implements FormaDePagamento {
	String numeroCartao;
	String cvv;
	
	public PagamentoCartaoCredito(String numeroCartao, String cvv) {
		this.numeroCartao = numeroCartao;
		this.cvv = cvv;
	}

	public void processarPagamento() {
		conectarComInstituicaoFinanceira();
		System.out.println("Processando pagamento via Cartão de Crédito.");
	}

	private void conectarComInstituicaoFinanceira()
	{
		System.out.println("Verificando cartão com a Instituição Financeira: " + numeroCartao + "/" + cvv);
	}
}

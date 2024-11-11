package strategy;

public class PagamentoPix implements FormaDePagamento {
	String chavePix;
	
	public PagamentoPix(String chavePix) {
		this.chavePix = chavePix;
	}

	public void processarPagamento() {
		conectarComBancoCentral();
		System.out.println("Processando pagamento via PIX.");
	}
	
	private void conectarComBancoCentral()
	{
		System.out.println("Buscando dados da chave PIX no Banco Central: " + chavePix);
	}
}

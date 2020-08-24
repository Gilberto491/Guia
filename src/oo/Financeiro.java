package oo;

public abstract class Financeiro  implements Interface {

	private int dinheiro;
	private int quantidadeProdutos;

	
	public int getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(int dinheiro) {
		this.dinheiro = dinheiro;
	}

	public int getQuantidadeProdutos() {
		return quantidadeProdutos;
	}

	public void setQuantidadeProdutos(int quantidadeProdutos) {
		this.quantidadeProdutos = quantidadeProdutos;
	}
	
	public int getTotal() {
		return getDinheiro() * getQuantidadeProdutos();
	}
	
	
	
}

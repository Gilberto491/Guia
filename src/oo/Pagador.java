package oo;

public class Pagador extends Financeiro {
	
	private int quantidade;
	private int preco;
	
	
	public void comprar() {
		setDinheiro(preco);
		setQuantidadeProdutos(quantidade);
		
	}

	public int getQuantidade() {
		return quantidade;
	}


	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}


	public int getPreco() {
		return preco;
	}


	public void setPreco(int preco) {
		this.preco = preco;
	}

	
	
	
	
	
	
	
}

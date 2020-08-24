package classe;

public class ProdutoTeste {
	
	public static void main(String[] args) {
		
		Produto p1 = new Produto("Notebook",4356.89);
		
		var p2 = new Produto();
		p2.nome = "Caneta Preta";
		p2.preco = 12.50;
		
		double mediaCarrinho = (p2.preco* (1 - Produto.desconto) 
				+ p1.preco * (1 - Produto.desconto)/2);
		
		System.out.println(p2.nome);
		System.out.println(p1.precoComDesconto());
		System.out.println(p2.precoComDesconto(0.1));
		
		System.out.printf("Média do carrinho = R$%.2f.", mediaCarrinho);
	}
}

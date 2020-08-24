package oo.composicao.desafio;

public class ClienteTeste {
	public static void main(String[] args) {
		
		Produtos p1 = new Produtos (4.78 ,"Desodorante"); 
		Produtos p2 = new Produtos (5.78 ,"Kinder Ovo"); 
		Item i1 = new Item(5);
		Item i2 = new Item(4);
		Cliente c1 = new Cliente("João");
		Cliente c2 = new Cliente("Carlos");
		Compra compra1 = new Compra();
		
		//Adicionando itens nas compras
		compra1.itens.add(i1);
		compra1.itens.add(i2);
		
		//Adicionando compras nos clientes
		c1.compras.add(compra1);
		c2.compras.add(compra1);
		
		System.out.println(c1.nome + " Comprou um " + p1.nome + " E gastou " + c1.obterValorCompleto(p1.preco, i1.quantidade));
		System.out.println(c2.nome + " Comprou um " + p2.nome + " E gastou " + c2.obterValorCompleto(p2.preco, i2.quantidade));
		
		
		
		
		
		
	}
}

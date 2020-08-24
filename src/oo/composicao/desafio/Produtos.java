package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Produtos {
	List<Item> itens = new ArrayList<>();
	
	double preco;
	String nome;
	
	Produtos(double preco, String nome){
		this.preco = preco;
		this.nome = nome;
	}
}

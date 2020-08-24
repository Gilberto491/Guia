package oo.composicao.desafio;

import java.util.ArrayList;
import java.util.List;

public class Cliente {
	String nome;
	
	List<Compra> compras = new ArrayList<Compra>();
	
	double obterValorCompleto(double preco, int quantidade) {
		return preco*quantidade;
	}
	
	Cliente(String nome){
		this.nome = nome;
	}
}

package oo.heranca.visibilidade;

import oo.heranca.desafio.Carro;
import oo.heranca.desafio.Ferrari;
import oo.heranca.desafio.Fusca;

public class CarroTeste {
	
	public static void main(String[] args) {
		
		Carro f1 = new Fusca();
		Carro f2 = new Fusca();
		
		Ferrari c1 = new Ferrari();
		Carro c2 = new Ferrari();
		
		f1.acelerar();
		f1.acelerar();
		System.out.println(f1.toString());
		
		f2.freiar();
		System.out.println(f2.toString());
		
		c1.acelerar();
		c1.desligarAr();
		c1.ligarTurbo();
		System.out.println(c1.velocidadeDoAr());
		System.out.println(c1.toString());
		c2.freiar();
		c2.freiar();
		c2.freiar();
		c2.freiar();
		System.out.println(c2.toString());
	}
}

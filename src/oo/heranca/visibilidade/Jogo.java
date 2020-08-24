package oo.heranca.visibilidade;

import oo.heranca.Direcao;
import oo.heranca.Heroi;
import oo.heranca.Monstro;

public class Jogo {
	
	public static void main(String[] args) {
		
		Monstro monstro = new Monstro(10, 10);
	
		
		Heroi heroi = new Heroi(10, 10);
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
		
		monstro.atacar(heroi);
		heroi.atacar(monstro);
		
		monstro.andar(Direcao.NORTE);
		
		System.out.println(monstro.vida);
		System.out.println(heroi.vida);
	}
}

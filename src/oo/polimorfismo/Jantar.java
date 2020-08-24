package oo.polimorfismo;

public class Jantar {
	public static void main(String[] args) {
		
		Pessoa visitante = new Pessoa(98);
		
		Arroz comida1 = new Arroz(0.2);
		Feijao comida2 = new Feijao(0.1);
		Comida comida3 = new Arroz(0.5); //abstract
		
		System.out.println(visitante.getPeso());
		
		visitante.comer(comida1);
		visitante.comer(comida2);
		visitante.comer(comida3);
		
		System.out.println(visitante.getPeso());
		
		Sorvete sobremesa = new Sorvete(2);
		visitante.comer(sobremesa);
		
		System.out.println(visitante.getPeso());
	}

}

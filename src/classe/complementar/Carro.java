package classe.complementar;

public class Carro {

	String nomeCarro;
	double litrosCarro;
	
	double litros(PostoDeGasolina abastecer) {
		return this.litrosCarro += abastecer.alcool;
	}
	void apresentar(String nome) {
		System.out.println("o " + nome + " têm " + this.litrosCarro + " Litros");
	}
}


package classe.complementar;

public class Abastecimento {
	public static void main(String[] args) {
		
		PostoDeGasolina C1 = new PostoDeGasolina(4.65,7.54,3.67);
		PostoDeGasolina C2 = new PostoDeGasolina(3.65,4.54,5.67);
		Carro C = new Carro();
		
		C.litros(C1);
		C.apresentar("Fusca");
		C.litros(C2);
		C.apresentar("Fusca");
		
		
	}
}

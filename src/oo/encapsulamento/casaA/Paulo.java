package oo.encapsulamento.casaA;

public class Paulo {

	Ana esposa = new Ana();
	
	void testeAcessos() {
		//private String segredo = "...";
		//String facoDentroDeCasa = "...";
		//protected String formaDeFalar = "...";
		//public String todosSabe = "...";
		System.out.println(esposa.facoDentroDeCasa);
		System.out.println(esposa.formaDeFalar);
		System.out.println(esposa.todosSabe);
	}
}

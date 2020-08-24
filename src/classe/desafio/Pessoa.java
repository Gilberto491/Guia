package classe.desafio;

public class Pessoa {
	
	String nomePessoa;
	double pesoPessoa;
	
	 Pessoa(String nomePessoa, double pesoPessoa) {
		this.nomePessoa = nomePessoa;
		this.pesoPessoa = pesoPessoa;
	}
	 
	 void comer(Comida comida) {
		 if(comida != null) {
			 this.pesoPessoa += comida.pesoComida; 
		 }
	 }
	 void apresentar(String a) {
		 System.out.println();
	 }
}

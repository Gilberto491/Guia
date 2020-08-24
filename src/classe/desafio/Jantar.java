package classe.desafio;

public class Jantar {
	
	public static void main(String[] args) {
		
		Comida c1 = new Comida("Arroz", 0.400);
		Comida c2 = new Comida("Feijão", 0.600);
		
		Pessoa p = new Pessoa("Junior",50.8);
		System.out.println(p.nomePessoa+" Tinha "+p.pesoPessoa);
		double a = c1.pesoComida+p.pesoPessoa;
		double b = c2.pesoComida+p.pesoPessoa+c1.pesoComida;
		System.out.println(p.nomePessoa+" Agora tem "+ a);
		System.out.println("E depois de comer de novo agora tem "+b);
		
		
		
		
		
	}
}

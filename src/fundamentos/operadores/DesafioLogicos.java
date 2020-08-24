package fundamentos.operadores;

public class DesafioLogicos {
	public static void main(String[] args) {
		// Trabalho na terça (V ou F)
		// Trabalho na quinta (V ou F)
		// 1 trabalho = tv 32
		// 2 trabalho = tv 50
		// se um deles der = sorvete
		// ou em casa com fome
		
		boolean Trabalho1 = true;
		boolean Trabalho2 = false;
		
		boolean Tv50 = Trabalho1 && Trabalho2;
		System.out.println("Comprou TV50? "+Tv50);
		boolean Tv32 = Trabalho1 ^ Trabalho2;
		System.out.println("Comprou TV32? "+Tv32);
		boolean sorvete = Tv32 || Tv50;
		System.out.println("A familia foi comprar sorvete? " + sorvete);
		boolean fome = !Tv32 && !Tv50;
		System.out.println("a familia ficou em casa com fome? " + fome);
		
		
	}
}

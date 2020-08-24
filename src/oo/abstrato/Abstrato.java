package oo.abstrato;

public class Abstrato {
	public static void main(String[] args) {
		
		Animal um = new Cachorro();
		Mamifero dois = new Cachorro();
		
		System.out.println(um.mover());
		System.out.println(um.respirar());
		System.out.println(dois.mamar());
	}
}

package oo.encapsulamento;

public class Pessoa {
	private int idade;
	private String name;
	
	public Pessoa(String name, int idade) {
		setIdade(idade);
		setName(name);
	}
	
	
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}


	public int getIdade() {
		return idade;
	}
	
	public void setIdade(int novaIdade) {
		novaIdade = Math.abs(novaIdade);
		if(novaIdade >= 0 && novaIdade <= 150) {
			this.idade = novaIdade;			
		}
	}
	
	public String toString() {
		return "Olá eu sou o " + getName()
		+ " e tenho " + getIdade() + " anos.";
	}
}

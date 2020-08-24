package oo.heranca.desafio;

public interface Luxo {

	public void ligarAr();
	abstract public void desligarAr();
	
	default int velocidadeDoAr() {
		return 1;
	}
}

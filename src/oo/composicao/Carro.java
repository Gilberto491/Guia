package oo.composicao;

public class Carro {
	
	final Motor motor;
	
	public Carro(){
		this.motor = new Motor(this);
	}

	public void acelerar() {
		if(motor.fatorinjecao < 2.6) {
			motor.fatorinjecao += 0.4;			
		}
	}
	
	void frear() {
		if(motor.fatorinjecao > 0.5) {
			motor.fatorinjecao -= 0.4;			
		}
	}
	
	void ligar() {
		motor.ligado = true;
	}
	
	void desligar() {
		motor.ligado = false;
	}
	
	boolean estaLigado() {
		return motor.ligado;
	}
}

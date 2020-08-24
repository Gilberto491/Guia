package oo.heranca.desafio;

public class Carro {
	
	double velocidade = 30;
	final int VELOCIDADE_MAXIMA;
	private int delta = 5;
	
	protected Carro(int velocidadeMaxima){
		VELOCIDADE_MAXIMA = velocidadeMaxima;
	}
	
	Carro(){
		this(8);
	}
	
	public double acelerar() {
		if(velocidade + getDelta() > VELOCIDADE_MAXIMA) {
			return velocidade = VELOCIDADE_MAXIMA;
		}else {
			return velocidade += getDelta();			
		}
	}
	
	public double freiar() {
		if(velocidade >= 5) {
			return velocidade -= 5;			
		}else
			return 0;
	}
	
	public String toString() {
		return "Velocidade atual é " + velocidade + "KM/H";
	}

	public int getDelta() {
		return delta;
	}

	public void setDelta(int delta) {
		this.delta = delta;
	}
}

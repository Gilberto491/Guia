package oo.heranca.desafio;

public class Fusca extends Carro{
	
	public double acelerar() {
		double v = super.acelerar();
		return v;
	}
	
	public double freiar() {
		if(velocidade >= 5) {
			double v = super.freiar();
			return v;			
		}else
			return 0;
	}
	
}

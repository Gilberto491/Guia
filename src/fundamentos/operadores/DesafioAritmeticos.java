package fundamentos.operadores;

public class DesafioAritmeticos {
	public static void main(String[] args) {
		/*
		int a = 10 - 3 * 4;
		int b = (int)Math.pow(a, 3);
		double c = Math.pow(a, 3);
		
		System.out.println(b);
		System.out.println(c);
		*/
		double Parte1 = (6 * (3 + 2)); //p1
		double PotenciaParte1 = Math.pow(Parte1, 2) / (3 * 2);

		double Parte2 = (1 - 5) * (2 - 7) / 2; //p2
		double ResultadoParte2 = PotenciaParte1 - Math.pow(Parte2, 2);
		
		double ResultadoFinal = Math.pow(ResultadoParte2, 3) / Math.pow(10, 3);
		System.out.println("O resultado final é igual a: "+(int)ResultadoFinal);
		
	}
}

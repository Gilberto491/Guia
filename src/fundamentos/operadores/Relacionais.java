package fundamentos.operadores;

import java.util.Scanner;

public class Relacionais {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		int a = 97;
		int b = 'a';
		System.out.println(a == b);
		System.out.println(30 != 7);
		System.out.println(3 > 4);
		System.out.println(3 >= 3);
		System.out.println(3 < 7);
		System.out.println(30 <= 7);
		
		System.out.println("");
		System.out.println("Informe a nota: ");
		double nota = entrada.nextDouble();
		boolean bomComportamento = true;
		boolean passouPorMedia = nota >= 7;
		boolean temDesconto = bomComportamento && passouPorMedia;
		
		System.out.println("Tem desconto? " + temDesconto);
		
		entrada.close();
	}
}

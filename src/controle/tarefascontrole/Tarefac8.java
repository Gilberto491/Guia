package controle.tarefascontrole;

import java.util.Scanner;

public class Tarefac8 {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe uma Palavra: ");
		String palavra = entrada.next();
		
		char letras[] = palavra.toCharArray();

		for (int i = 0; i < letras.length; i++) {
			System.out.println(letras[i]);
		}


		entrada.close();
	}
}

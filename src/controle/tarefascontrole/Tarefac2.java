package controle.tarefascontrole;

import java.util.Scanner;

public class Tarefac2 {
/*
 *  Criar um programa informa se 
 * o ano atual é um ano bissexto
 */
	public static void main(String[] args) {
	
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe um ano: ");
		int ano = entrada.nextInt();
		
		if(ano % 4 == 0 && ano % 100 != 0) {
			System.out.println("Ano Bissexto!");
		}else {
			System.out.println("Ano Não Bissexto!");
		}

		entrada.close();
	}
}

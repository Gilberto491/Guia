package controle.tarefascontrole;

import java.util.Scanner;

public class Tarefac1 {
	public static void main(String[] args) {
		/*
		 * 1. Criar um programa que receba um 
		 * numero e verifique se ele esta entre 
		 * 0 e 10 e � par
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe um numero: ");
		int n = entrada.nextInt();
		
		if(n>=0 && n<=10) {
			System.out.printf("%d Est� Entre 0 e 10",n);
		}
		if(n % 2 == 0) {
			System.out.printf("%d � Par!",n);
		}
		

		entrada.close();
	}
}

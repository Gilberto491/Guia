package controle.tarefascontrole;

import java.util.Scanner;

public class Tarefac5 {

		public static void main(String[] args) {
/*
 * Criar um programa que receba um numero e diga se ele e um numero primo
 * usando switch.
 */
		Scanner entrada = new Scanner(System.in);

		System.out.println("Informe o N�mero: ");
		int n = entrada.nextInt();
		int contador = 2,verdade=0;
		
		while(contador<n) {
			if(n%contador==0) {
				verdade++;
			}
			contador++;
		}
		switch(verdade) {
		case 0:
			System.out.println("N�mero Primo! ");
		break;
		default:
			System.out.println("N�mero N�o Primo! ");
		}
		entrada.close();
		}
}

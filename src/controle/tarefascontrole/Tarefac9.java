package controle.tarefascontrole;

import java.util.Scanner;

public class Tarefac9 {
	
	public static void main(String[] args) {
		
/*
 * 9. Crie um programa que recebe 10 
 * valores e ao final imprima o maior 
 * número.
 */
		Scanner entrada = new Scanner(System.in);

		double maior=0,menor=0;

		System.out.printf("Informe o 1 valor: ");
		double valor = entrada.nextDouble();
		maior = valor;
		menor = valor;
		
		for(int i=2;i<11;i++) {
			System.out.printf("Informe o %d valor: ", i);
			valor = entrada.nextDouble();
			if(valor>=maior) {
				maior = valor;
			}
			if(valor<=menor) {
				menor = valor;
			}
		}
		
		System.out.printf("O Maior valor é: %.2f",maior);
		System.out.printf("\nO Menor valor é: %.2f",menor);
		entrada.close();
	}
}

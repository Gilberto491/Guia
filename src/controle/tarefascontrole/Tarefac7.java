package controle.tarefascontrole;

import java.util.Scanner;

public class Tarefac7 {
	public static void main(String[] args) {
/*
* criar um programa que enquanto estiver recebendo numeros 
* positivos, imprime no console 
* a soma dos numeros inseridos, caso receba 
* um numero negativo, encerre o programa. Tente 
* utilizar a estrutura do while.
*/
		Scanner entrada = new Scanner(System.in);

		double n=0,somador=0;
		while(n>=0) {
			System.out.print("Informe um número: ");
			n = entrada.nextDouble();
			if(n>=0) {
				somador +=  n;	
			}
		}
		
		System.out.printf("A soma dos números é igual a %f: ",somador);

		entrada.close();
	}
}

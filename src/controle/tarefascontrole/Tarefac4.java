package controle.tarefascontrole;

import java.util.Scanner;

public class Tarefac4 {
	
	public static void main(String[] args) {
		
/*
 * 4. Criar um programa que receba um numero 
* e diga se ele e um numero primo.
*/
		Scanner entrada = new Scanner(System.in);

		System.out.print("Informe um Número: ");
		int n = entrada.nextInt();
		int contador=3,verdade=0;
		
				while(contador<n) {
					if(n % contador == 0) {
						verdade++;
					}
					contador++;
				}
			
			if(verdade==0 && n % 2 != 0) {
				System.out.printf("%d É Primo! ",n);
			}else {
				System.out.printf("%d Não É Primo! ",n);
			}

		entrada.close();
	}
}

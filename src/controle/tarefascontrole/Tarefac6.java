package controle.tarefascontrole;

import java.util.Scanner;

public class Tarefac6 {
	
	public static void main(String[] args) {
/*
* Jogo da adivinha��o: Tentar adivinhar um numero entre 0 - 100. 
* Armazene um numero aleatorio em uma variavel. O Jogador tem 10 
* tentativas para adivinhar o numero gerado. Ao final de cada tentativa, 
* imprima a quantidade de tentativas restantes, e imprima se o numero 
* inserido e maior ou menor do que o numero armazenado.
*/
		Scanner entrada = new Scanner(System.in);

		int escolhido = 40, escolha = -1,contador=0;
		
		while(escolha!=escolhido || contador<=10) {
			contador++;
			System.out.print("Tentativa "+ contador + ":");
			escolha = entrada.nextInt();
				if(escolha==escolhido) {
					System.out.println("Parabens voc� acertou!");
					break;
				}else if(escolhido<escolha) {
					System.out.println("O N�mero � Menor!");
				}else {
					System.out.println("O N�mero � Maior!");
				}
		}
		
		entrada.close();
	}
}

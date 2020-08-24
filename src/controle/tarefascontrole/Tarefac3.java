package controle.tarefascontrole;

import java.util.Scanner;

public class Tarefac3 {
	
	public static void main(String[] args) {
		
/*
* Criar um programa que receba duas notas parciais, calcular a media final. 
* Se a nota do aluno for maior ou 
* igual a 7.0 imprime no console "Aprovado", se a 
* nota for menor que 7.0 e maior do que 4.0 imprime no console "Recuperacao", 
* caso contrario imprime no console "Reprovado".
*/
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a Nota 1: ");
		double n1 = entrada.nextDouble();
		System.out.print("Informe a Nota 2: ");
		double n2 = entrada.nextDouble();
		
		double media = ( n1 + n2) / 2;
		
		if(media >= 7) {
			System.out.println("Aprovado!");
		}else if(media < 7 && media > 4) {
			System.out.println("Recuperação");
		}else {
			System.out.println("Reprovado");
		}
		
		entrada.close();
	}
}

package fundamentos.tarefas;

import java.util.Scanner;

public class Tarefa6 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que resolve equações do segundo grau 
		 * (ax2 + bx + c = 0) utilizando a fórmula de Bhaskara. 
		 * Use como exemplo a = 1, b = 12 e c = -13. Encontre o delta
		 */
		Scanner entrada = new Scanner(System.in);
		
			System.out.println("Informe o A");
			int a = entrada.nextInt();
			System.out.println("Informe o B");
			int b = entrada.nextInt();
			System.out.println("Informe o C");
			int c = entrada.nextInt();
			
			double delta = Math.pow(b, 2) - 4 * a * c;
			double resultado1 = (-b + Math.sqrt(delta)) / 2 * a; 
			double resultado2 = (-b - Math.sqrt(delta)) / 2 * a; 
			System.out.println("O primeiro delta é: " + resultado1);
			System.out.println("O segundo delta é : " + resultado2);
		
		entrada.close();
	}
}

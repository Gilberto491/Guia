package fundamentos.tarefas;

import java.util.Scanner;

public class Tarefa5 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia o valor 
		 * da base e da altura de um triângulo 
		 * e calcule a área.
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor da Base do Triângulo: ");
		double base = entrada.nextDouble();
		System.out.println("Informe a Altura do Triângulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base*altura)/2;
		System.out.println("A área do Triângulo é igual a: " + area);
		entrada.close();
		
	}
}

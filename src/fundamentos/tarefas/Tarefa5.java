package fundamentos.tarefas;

import java.util.Scanner;

public class Tarefa5 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia o valor 
		 * da base e da altura de um tri�ngulo 
		 * e calcule a �rea.
		 */
		Scanner entrada = new Scanner(System.in);
		System.out.println("Informe o valor da Base do Tri�ngulo: ");
		double base = entrada.nextDouble();
		System.out.println("Informe a Altura do Tri�ngulo: ");
		double altura = entrada.nextDouble();
		
		double area = (base*altura)/2;
		System.out.println("A �rea do Tri�ngulo � igual a: " + area);
		entrada.close();
		
	}
}

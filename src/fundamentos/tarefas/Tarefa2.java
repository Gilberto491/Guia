package fundamentos.tarefas;

import java.util.Scanner;

public class Tarefa2 {
	public static void main(String[] args) {
		/*
		 * Criar um programa que leia a 
		 * temperatura em Fahrenheit e 
		 * converta para Celsius.
		 */
		System.out.println("Informe a Temperatura em Fahrenheit: ");
		Scanner entrada = new Scanner(System.in);
		
		double temperatura = entrada.nextDouble();
		
		double resultado = (temperatura - 32) / 1.8000;
		System.out.println("O Resultado é Igual a: "+ (int)resultado);
	
		entrada.close();
	}
}

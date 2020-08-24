package fundamentos.tarefas;

import java.util.Scanner;

public class Tarefa4 {
	public static void main(String[] args) {
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Informe o Valor: ");
		double n = entrada.nextDouble();
		
		double quadrado = Math.pow(n, 2);
		double cubo = Math.pow(n, 3);
		
		System.out.printf("Ao Quadrado = %.2f \nAo Cubo = %.2f ",quadrado,cubo);
		
		entrada.close();
	}
}

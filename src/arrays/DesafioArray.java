package arrays;

import java.util.Scanner;

public class DesafioArray {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
		System.out.print("Informe o número de Alunos: ");
		int alunos = entrada.nextInt();
		
		int i = 0;
		double contador[] = new double[alunos];
		while(i < contador.length) {
			System.out.println("*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-*-");
			System.out.printf("Informe a Média do Aluno %d: ", i+1);
			contador[i] = entrada.nextDouble();
			i++;
		}
		
		double somatorio=0;
		for(double soma:contador) {
			somatorio += soma;
		}
		System.out.println("---------------------------------------");
		System.out.println("A Média dos Alunos foi de: " + somatorio/contador.length);
		System.out.println("---------------------------------------");
		
		entrada.close();
	}
}

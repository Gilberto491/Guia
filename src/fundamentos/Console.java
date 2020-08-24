package fundamentos;

import java.util.Scanner;

public class Console {
	public static void main(String[] args) {
		System.out.print("Bom");
		System.out.print(" dia\n");
		
		System.out.println("Bom");
		System.out.println("dia!");
		
		System.out.printf("Megasena: %d %d %d",1,2,3);
		System.out.printf("\n%s","junior");
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("\nDigite seu nome: ");
		String nome = entrada.nextLine();
		System.out.print("Digite o seu sobrenome: ");
		String sobrenome = entrada.nextLine();
		System.out.print("Quanto anos você tem: ");
		int idade = entrada.nextInt();
		
		System.out.printf("\nNome = %s %s\nIdade = %d",nome,sobrenome,idade);
		entrada.close();
	}
}

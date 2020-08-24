package fundamentos;

import java.util.Scanner;

public class DesafioCalculadora {
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.print("Informe o Primeiro Número: ");
		double n1 = entrada.nextDouble();
		System.out.print("Informe o Segundo Número: ");
		double n2 = entrada.nextDouble();
		
		System.out.println("********************************");
		System.out.println("Qual operação você deseja fazer: ");
		System.out.println("[1] +");
		System.out.println("[2] -");
		System.out.println("[3] *");
		System.out.println("[4] /");
		System.out.println("[5] %");
		System.out.println("********************************");
		String op = entrada.next().replace(",", ".");
		
		int ope = Integer.parseInt(op);
		double resultado = ope==1 ? n1 + n2 : 0;
		resultado = ope==2 ? n1 - n2 : resultado;
		resultado = ope==3 ? n1 * n2 : resultado;
		resultado = ope==4 ? n1 / n2 : resultado;
		resultado = ope==5 ? n1 % n2 : resultado; 
		
		System.out.printf("O resultado é igual a: %.2f ", resultado);
		
		entrada.close();
	}
}

package oo;

import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Informe a quantidade de produtos desejados: ");
		int qnt = entrada.nextInt();
		System.out.print("Informe o valor desejado: ");
		int valor = entrada.nextInt();
		
		Financeiro cliente = new Pagador();
		cliente.setQuantidadeProdutos(qnt);
		cliente.setDinheiro(valor);
		
		System.out.println("o valor a pagar é: " + cliente.getTotal() + " reais.");
		
		entrada.close();
		
	}
	
	
	
}

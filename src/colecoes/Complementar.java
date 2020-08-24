package colecoes;

import java.util.ArrayList;
import java.util.Scanner;

public class Complementar {
	public static void main(String[] args) {
		
		ArrayList<String> lista = new ArrayList<>();
		
		Scanner entrada = new Scanner(System.in);
		
		int opcao = 0;
		
		do {
			System.out.println("------------------------------------");
			System.out.println("[1]Cadastrar um nome ");
			System.out.println("[2]Procurar se contém determinado nome ");
			System.out.println("[3]Remover um nome ");
			System.out.println("[4]Sair ");
			System.out.println("------------------------------------");
			System.out.printf("Informe a opção acima: ");
			opcao = entrada.nextInt();
			if(opcao==1) {
				System.out.print("Informe o nome que você deseja cadastrar: ");				
				String cadastro = entrada.next();
				lista.add(cadastro);
			}
			if(opcao==2) {
				System.out.println("Informe o nome: ");
				String nome = entrada.next();
				
				System.out.println(lista.contains(nome));
			}
			if(opcao==3) {
				System.out.println("Qual nome deseja remover: ");
				String remover = entrada.next();
				System.out.println(lista.remove(remover));
			}
			
		}while(opcao!=4);
		
		System.out.println(lista);				
		entrada.close();
	}
}

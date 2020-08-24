package oo;

import java.util.Scanner;

public class GustavoProva {
	public static void main(String[] args) {
		
				Scanner entrada = new Scanner(System.in);

				
				System.out.println("============================\n"
						+ "Informe a operação desejada:\n"
						+ "(1)Adição\n"
						+ "(2)Subtração\n"
						+ "(3)Multiplicação\n"
						+ "(4)Divisão\n"
						+ "(5)Saida\n"
						+ "============================");
			
			double opcao = entrada.nextDouble();
			
			/*
			 * PRIMEIRO IF FORA DO WHILE PARA CASO O USUARIO QUEIRA SAIR SEM FAZER ALGUM CALCULO
			 */
			
			if(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) { // VERIFICANDO AS OPÇÕES
				  System.out.print("Informe o primeiro número: ");
				  double n1 = entrada.nextDouble();
				  System.out.print("Informe o segundo número: ");
				  double n2 = entrada.nextDouble();
				  if(opcao == 1) {
						double somar = n1 + n2;
						System.out.println("Resultado: " + somar); 
					}else if(opcao == 2){
						double subtrair = n1 - n2;
						System.out.println("Resultado: " + subtrair); 
					}else if(opcao == 3) {
						double multiplicar = n1 * n2;
						System.out.println("Resultado: " + multiplicar);
					}else {
						double dividir = n1 / n2;
						System.out.println("Resultado: " + dividir);
					}
			}else {
				System.out.println("Programa Finalizado"); 
			}
				
			while(opcao != 5) {
				
				System.out.println("============================\n"
						+ "Informe a operação desejada:\n"
						+ "(1)Adição\n"
						+ "(2)Subtração\n"
						+ "(3)Multiplicação\n"
						+ "(4)Divisão\n"
						+ "(5)Saida\n"
						+ "============================");
				
			   opcao = entrada.nextInt(); 
			   
			   if(opcao == 1 || opcao == 2 || opcao == 3 || opcao == 4) { // VERIFICANDO AS OPÇÕES
					  System.out.print("Informe o primeiro número: ");
					  double n1 = entrada.nextDouble();
					  System.out.print("Informe o segundo número: ");
					  double n2 = entrada.nextDouble();
					  if(opcao == 1) {
							double somar = n1 + n2;
							System.out.println("Resultado: " + somar); 
						}else if(opcao == 2){
							double subtrair = n1 - n2;
							System.out.println("Resultado: " + subtrair); 
						}else if(opcao == 3) {
							double multiplicar = n1 * n2;
							System.out.println("Resultado: " + multiplicar);
						}else {
							double dividir = n1 / n2;
							System.out.println("Resultado: " + dividir);
						}
				}else {
					System.out.println("Programa Finalizado");
				}
				
			}
				entrada.close();
	}
	
}